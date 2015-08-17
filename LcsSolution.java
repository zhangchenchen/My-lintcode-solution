public class LcsSolution {
    /**
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public static String longestCommonPrefix(String[] strs) {
        // write your code here
        if(strs == null){
            System.out.println("NULL ARGUMENT");
            return null;
        }
        String result = "";
        int minLen = 256;
        int i ;
        int j ;
        for(String s : strs){
            minLen = minLen < s.length() ? minLen : s.length();
        }
        
        if(minLen == 0){
            System.out.println(minLen);
            return result;
        }
        lable:for( i = 0 ; i < minLen ;i++){
            for( j = 0 ;j < strs.length - 1 ; j++){
                if(strs[j].charAt(i) == strs[j+1].charAt(i)){
                    continue;
                }
                else{
                    break lable;
                }
            }
        }
        return strs[0].substring(0,i);
        
    }
    public static void main(String args[]){
        String[] a = {};
        System.out.println(longestCommonPrefix(a));
    }
}
