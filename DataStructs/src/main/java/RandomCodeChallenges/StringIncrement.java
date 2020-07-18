package RandomCodeChallenges;

public class StringIncrement {

    //O(n) time
    public static void incremented(String str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            sb.append((char) (str.charAt(i) + 1));
        }
        System.out.println(sb);
    }

}
