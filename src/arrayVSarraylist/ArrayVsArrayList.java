package arrayVSarraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {
        String[] friendsArray = new String[4];

        String[] friendsArray2 = {"John", "Cena", "Micheal"};

        ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "cena"));

        friendsArray[0] = "John";

        friendsArrayList.add(0, "Mark");

        friendsArrayList.add(1,"Z");

        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        System.out.println(friendsArray[0]);
        System.out.println(friendsArray2[0]);
        System.out.println(friendsArrayList.get(0));
        System.out.println(friendsArrayList2.get(0));
    }
}
