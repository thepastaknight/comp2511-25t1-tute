package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        // for (String string : strings) {
        // System.out.println(string);
        // }
        strings.stream().forEach(string -> System.out.println(string));

        List<String> strings2 = new ArrayList<String>(Arrays.asList(new String[] { "1", "2", "3", "4", "5" }));
        // List<Integer> ints = new ArrayList<Integer>();
        // for (String string : strings2) {
        // ints.add(Integer.parseInt(string));
        // }
        List<Integer> ints = strings2.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .toList();
        int aaa = strings2.stream()
                .map(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .reduce(Integer::sum)
                .orElse(0);
        System.out.println(aaa);
    }
}
