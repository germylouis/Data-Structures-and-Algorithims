package Main;

public class MainClass {

    public static void main(String[] args) {

        plusOne();

    }


    public static void plusOne() {
        int[] digits = {9};
        StringBuilder string = new StringBuilder();

        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        for (int i : digits) {
            string.append(String.valueOf(i));
            System.out.println("pls");
        }
        char[] mstring = new char[string.toString().toCharArray().length];
        int[] mDigits = new int[string.toString().toCharArray().length];

        for (int i = 0; i < string.toString().toCharArray().length; i++) {
            System.out.println(string.toString().charAt(i));
            mstring[i] = string.toString().charAt(i);
        }

        for (int i = 0; i < digits.length; i++) {
            mDigits[i] = Character.getNumericValue(mstring[i]);
            System.out.print(mDigits[i]);
        }
    }
}
