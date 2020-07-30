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

    public static void incrementedLogic(String str) {

        StringBuilder sb = new StringBuilder();
        String z = "z";
        String Z = "Z";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

            if (z.equals(str.charAt(i))) {
                str.replace(str.charAt(i), 'a');
            }

            sb.append((char) (str.charAt(i) + 1));
            System.out.println(sb);

        }
        System.out.println(sb);
    }

}
