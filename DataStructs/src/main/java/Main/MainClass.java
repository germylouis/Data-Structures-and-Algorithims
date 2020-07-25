package Main;


import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class MainClass {

    public static void main(String[] args) {
        String line = "hello";
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

        map.forEach((k,v) -> string.append(k.toString() + v.toString()));

        System.out.println(string);

    }

    public void test() {

    }
}
