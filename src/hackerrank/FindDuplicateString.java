package hackerrank;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FindDuplicateString {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape", "orange");




        List<String> duplicates = strings.stream()
                .collect(Collectors.groupingBy(s -> s))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.println(duplicates);
    }
}
