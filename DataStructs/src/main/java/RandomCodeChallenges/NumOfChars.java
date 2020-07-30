package RandomCodeChallenges;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class NumOfChars {

    public static void charCount(String line) {
        StringBuilder string = new StringBuilder();
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] arr = line.toCharArray();
        Arrays.sort(arr);

        for (char c : arr) {

            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.replace(c, map.get(c) + 1);
            }
        }

        map.forEach((k, v) -> string.append(k.toString() + v.toString()));

        System.out.println(string);
    }
}
