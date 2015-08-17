import java.util.*;
class KthLargestElementSolution {
    //param k : description of k
    //param numbers : array of numbers
    //return: description of return
    public static int kthLargestElement(int k, ArrayList<Integer> numbers) {
        // write your code here
        return partion(k - 1, numbers, 0, numbers.size() - 1);
    }
    public static int partion(int k , ArrayList<Integer> numbers, int beg, int end){
        int left = beg;
        int right = end;
        int privot = numbers.get(left);
        while(left < right){
            while(left < right && numbers.get(right) < privot){
                right--;
            }
            swap(numbers, left, right);
            while(left < right && numbers.get(left) > privot){
                left++;
            }
            swap(numbers, left, right);
        }
        if(left == k){
            return numbers.get(left);
        }
        else if(left < k){
            return partion(k , numbers, left + 1, end);
        }
        else{
            return partion(k , numbers, beg, left - 1);
        }
    }
    public static void swap(ArrayList<Integer> numbers, int beg, int end){
        int temp = numbers.get(beg);
        numbers.set(beg, numbers.get(end));
        numbers.set(end, temp);
    }
    
    
    public static void main(String[] args) {
        // node1.left = node3;
        // node2.left = node4;
        // node2.right = node5;
        int[] nums = {9,3,2,4,8};
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        System.out.println(kthLargestElement(3, numbers));
        //inorder(node);
    }
};
    
 
