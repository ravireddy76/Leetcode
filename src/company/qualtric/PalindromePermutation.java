package company.qualtric;

import java.util.HashMap;
import java.util.Map;

/* checks whether any permutation of an input string is a palindrome
 * Examples:
 * "civic" should return True
 * "ivicc" should return True
 * "civil" should return False
 * "livci" should return False
 */
public class PalindromePermutation {
    public boolean canPermutePalindrome(String s) {
        if (s == null || s.isEmpty())
            return true;
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int oddCount = 0;
        for (Integer i : freq.values()) {
            if ((i.intValue() % 2) != 0) {
                oddCount++;
                if (oddCount > 1) {
					return false;
				}
            }
        }
        return true;
    }
}