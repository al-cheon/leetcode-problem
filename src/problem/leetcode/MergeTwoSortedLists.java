package problem.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * 21. Merge Two Sorted Lists
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(3, 4, 5);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 6, 7);

        solution01(list1, list2);


    }

    // My Solution
    public static List<Integer> solution01(List<Integer> list1, List<Integer> list2) {
        List<Integer> result = new ArrayList<>();
        result.addAll(list1);

        int currentIndex = 0;
        int list1Size = list1.size();
        int list1Index = 0;

        for (int i = 0; i < list2.size(); i++) {
            if (list2.get(i) <= result.get(currentIndex)) {
                result.add(currentIndex, list2.get(i));
                currentIndex++;
                list1Index++;
            } else {
                //
                do {
                    currentIndex++;
                } while (list1Size + i >= currentIndex && list2.get(i) > result.get(currentIndex));
                //
                if (list1Size + i < currentIndex) {
                    result.add(list2.get(i));
                } else {
                    result.add(currentIndex, list2.get(i));
                    currentIndex++;
                }
            }
        }
        System.out.println(result);
        return result;
    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();


        return result;
    }


    /**
     * Definition for singly-linked list
     */
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) { this.val = val; }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

}
