package stringsQues;

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        int[] sLetters = new int[26];
        int[] tLetters = new int[26];
        for (char ch : s.toCharArray()) {
            sLetters[ch - 'a'] += 1;
        }
        for (char ch : t.toCharArray()) {
            tLetters[ch - 'a'] += 1;
        }
        for (int i = 0; i < 26; i++) {
            if (tLetters[i] != sLetters[i]) {
                return false;
            }
        }
        return true;
    }
}
