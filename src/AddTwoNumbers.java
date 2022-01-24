import java.util.*;

public class AddTwoNumbers {

   public static void main(String[] args) {

       Solution sol = new Solution();
       sol.letterCombinations("23");
   }

   static class Solution {
       public List<String> letterCombinations(String digits) {
           List<String> result = new ArrayList<>();

           Map<Character, List<String>> current = new HashMap<>();
           List<List<String>> currentList = new ArrayList<>();

           Map<Character, List<String>> numberToLetters = new HashMap<>();
           numberToLetters.put('2', Arrays.asList("a", "b", "c"));
           numberToLetters.put('3', Arrays.asList("d", "e", "f"));
           numberToLetters.put('4', Arrays.asList("g", "h", "i"));
           numberToLetters.put('5', Arrays.asList("j", "k", "l"));
           numberToLetters.put('6', Arrays.asList("m", "n", "o"));
           numberToLetters.put('7', Arrays.asList("p", "q", "r", "s"));
           numberToLetters.put('8', Arrays.asList("t", "u", "v"));
           numberToLetters.put('9', Arrays.asList("w", "x", "y", "z"));


           for (int i = 0; i < digits.length(); i++) {
              currentList.add(numberToLetters.get(digits.charAt(i)));
           }

//            System.out.println(currentList);
           combinations(currentList);

           return result;
       }
   }

   public static List<String> combinations(List<List<String>> letters){

       for(List lst : letters){
           for (Object o : lst) {
               System.out.println(o);
           }
       }

       return null;
   }
}
