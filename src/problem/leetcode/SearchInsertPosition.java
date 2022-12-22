package problem.leetcode;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 7;

        System.out.println(searchInsert(nums, target)); // 그냥 일반 탐색방법
        System.out.println(searchInsert2(nums, target)); // 피벗을 활용한 탐색방법 O(log n) runtime complexity.

    }

    public static int searchInsert(int[] nums, int target) {
        int result = 0;
        boolean existed = false;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                result = i;
                existed = true;
                break;
            }
        }
        if (!existed) result = nums.length;

        return result;
    }


    public static int searchInsert2(int[] nums, int target) {
        int pivot, left = 0, right = nums.length - 1;
        while (left <= right) {
            pivot = left + (right - left) / 2;
            if (nums[pivot] == target) return pivot;
            if (target < nums[pivot]) right = pivot - 1;
            else left = pivot + 1;
        }
        return left;

    }
}
