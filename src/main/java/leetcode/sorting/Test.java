package leetcode.sorting;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList<>();

        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);

        list.add(l1);

        l1.add(3);

        list.add(l1);

        System.out.println(list);
    }
}
