package problem.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3));
        System.out.println(list);
        list.add(1, 4);

        System.out.println(list);
	// write your code here
    }
}
