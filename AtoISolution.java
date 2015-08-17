public class AtoISolution {
    /**
     * @param str: A string
     * @return An integer
     */
    public static int atoi(String str) {
        // write your code here
        if(str == null || str.length() == 0){
            return 0;
        }
        str = str.trim();
        int symbol;
        int index = 0;
        double num = 0;
        int poi = str.length()-1;
        switch(str.charAt(0)){
            case '-':
                symbol = -1;
                break;
            default :
                symbol = 1;
                break;
        }
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '.'){
                poi = i;
                break;
            }
        }
        System.out.println(poi);
        //Pattern pattern=Pattern.compile("[0-9]");
        for(int i = poi ; i > -1 ; i--){
            //Matcher m=pattern.matcher(str.charAt(i));
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = num + (str.charAt(i)-'0') * Math.pow(10, index);
                index++;
            }
        }
        System.out.println(num);
        num = num > 2147483647 ? 2147483647 :num;
        num = symbol * num;
        return (int)num;
    }
    public static void main(String args[]){
        String a = "10";
        System.out.println(atoi(a));
    }
}