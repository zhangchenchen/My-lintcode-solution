import java.util.*;
public class Anagram1 {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public static boolean anagram(String s, String t) {
        //count num of characters
        //int maxLen = s.length() >= t.length() ? s.length : t.length();
        if(s.length() != t.length()){
            return false;
        }
        int len = s.length();
        int temp;
        Hashtable<String ,Integer> count = new Hashtable<String ,Integer> ();
        //int[] count = new int[len];
        for (int i = 0 ;i < len ; i++){
            if(count.containsKey(String.valueOf(s.charAt(i)))){
                temp = count.get(String.valueOf(s.charAt(i)))+1;
                count.put(String.valueOf(s.charAt(i)) , temp);
            }
            else{
                count.put(String.valueOf(s.charAt(i)) , 1);
            }
        }
        for(int i = 0;i < len ;i++){
            if(count.containsKey(String.valueOf(t.charAt(i)))){
                temp = count.get(String.valueOf(t.charAt(i)))-1;
                count.put(String.valueOf(t.charAt(i)) , temp);
            }
            else{
                count.put(String.valueOf(t.charAt(i)) , 1);
            }
        }
        while(count.elements().hasMoreElements()){
            if( count.elements().nextElement() > 0){
                return false;
            }
        }
        return true;
    }
    
    public static void main(String args[]){
        String s = "asd"; 
        String t = "sas";
        System.out.println(anagram(s,t));
    }
};
