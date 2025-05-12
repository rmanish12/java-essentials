package comparators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrimitiveSorting {
    public static void main(String[] args) {
        int[] arr = {5, 9, 10, 2, 25};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] strArr = {"A", "C", "D", "Z"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));

        List<String> strList = new ArrayList<>();
        strList.add("A");
        strList.add("D");
        strList.add("Z");
        strList.add("C");
        Collections.sort(strList);
        strList.forEach(System.out::println);
    }
}
