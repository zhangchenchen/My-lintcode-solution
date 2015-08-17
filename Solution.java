import java.util.*;
public class Solution {
    /**
     * @param strs: A list of strings
     * @return: A list of strings
     */
    public static List<String> anagrams(String[] strs) {
        // write your code here
        //char[] A = new char[256];
        if(strs.length <= 1 ){
            return null;
        }
        HashMap<char[] , LinkedList<String>> store = new HashMap<char[] , LinkedList<String>>();
        for(int i = 0;i < strs.length; i++){
            char[] A = strs[i].toCharArray();
            System.out.println("PRE" +A);
            Arrays.sort(A);
            
            if(store.containsKey(A)){
                store.get(A).add(strs[i]);
                System.out.println(A);
            }
            else{
                System.out.println("AFTER"+A);
                LinkedList<String> S = new LinkedList<>();
                S.add(strs[i]);
                store.put(A , S);
            }
        }
        LinkedList<String> result = new LinkedList<String>();
        for(LinkedList L : store.values()){
            if(L.size() > 1){
                result.addAll(L);
            }
        }
        return result;
    }
    public static void main(String[] args){
    String[] strs = {"",""};
        System.out.println(anagrams(strs));
    }
}