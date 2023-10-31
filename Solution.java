import java.util.Collections;
import java.util.HashMap;

class Solution {
    public static char mostFrequentChar(String s) {
      char[] s_arr = s.toCharArray();
      HashMap<Character, Integer> characterDict = new HashMap<>();
      char max_char = s_arr[0];

      for (char c : s_arr) {
        if (characterDict.containsKey(c)) {
          characterDict.put(c, characterDict.get(c) + 1);
          if (characterDict.get(c) >= characterDict.get(max_char)){
            max_char = c;
          }
        } else {
          characterDict.put(c, 1);
        }
      }
    
      return max_char;
    }
  
    public static void main(String[] args) {
      // Try out your test cases:
      System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
      System.out.println(Solution.mostFrequentChar("david")); // -> 'd'
      System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
      System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    }

  }
