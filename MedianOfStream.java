import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class MedianOfStream {
    
    public Queue<Integer> minHeap;
    public Queue<Integer> maxHeap;
    public int numElements;
    
    public MedianOfStream(){
        minHeap = new PriorityQueue<Integer>();
        maxHeap = new PriorityQueue<Integer>(10,new MaxHeapComparator());
        numElements = 0;
    }
    
    public void addNumberToStream(Integer num){
        maxHeap.add(num);
        if(numElements %2 == 0){
            if(minHeap.isEmpty()){
                numElements++;
                return;
            }
            else if(maxHeap.peek() > minHeap.peek() ){
                Integer maxHeapRoot = maxHeap.poll();
                Integer minHeapRoot = minHeap.poll();
                maxHeap.add(minHeapRoot);
                minHeap.add(maxHeapRoot);
            }
        }else{
            minHeap.add(maxHeap.poll());
        }
        numElements++;
    }
    public Double getMedian(){
        if (numElements%2 != 0){
            return new Double(maxHeap.peek());
        }
        else{
            return (maxHeap.peek()+minHeap.peek())/2.0;
        }
    }
    private class MaxHeapComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2){
            return o2-o1;
        }
    }

	public static void main(String[] args) {
		MedianOfStream streamMedian = new MedianOfStream();
		
		streamMedian.addNumberToStream(1);
		System.out.println(streamMedian.getMedian()); // should be 1
		
		streamMedian.addNumberToStream(5);
		streamMedian.addNumberToStream(10);
		streamMedian.addNumberToStream(12);
		streamMedian.addNumberToStream(2);
		System.out.println(streamMedian.getMedian()); // should be 5
		
		streamMedian.addNumberToStream(3);
		streamMedian.addNumberToStream(8);
		streamMedian.addNumberToStream(9);
		System.out.println(streamMedian.getMedian()); // should be 6.5
	}    
}