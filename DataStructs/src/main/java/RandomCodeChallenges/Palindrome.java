package RandomCodeChallenges;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        int back = s.length() - 1;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.compare(s.charAt(i), s.charAt(back)) == 0) {
                back--;
            } else {
                return false;
            }

        }

        return true;
    }
}
