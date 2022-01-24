

public class Zigzag {

   public static void main(String[] args) {

       String s = "PAYPALISHIRING";
       int numRows = 3;

       Solution sol = new Solution();
       System.out.println(sol.convert(s, numRows));


   }

   static class Solution {
       public String convert(String s, int numRows) {
           char[] stringChar = s.toCharArray();
           StringBuilder result = new StringBuilder();

           for(int i = 0; i < stringChar.length; i++){
               if(i % (numRows + 1) == 0 ){
                   result.append(stringChar[i]);
               }
           }
           System.out.println(result);
       return "";
       }
   }
}
