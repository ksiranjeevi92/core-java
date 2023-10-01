package java8;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class UniqueIntList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,2,3,4,4,5,6,7,7,8,9,10);

        List<Integer> uniqueList = new ArrayList<>();

        for(int i:integerList){
            if(!uniqueList.contains(i)){
                uniqueList.add(i);
            }
        }
        System.out.println("unique list "+uniqueList);

        List<Integer> uniqueList2 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println("unique List 2" + uniqueList2);
    }
}
