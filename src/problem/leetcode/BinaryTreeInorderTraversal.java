package problem.leetcode;

import problem.leetcode.model.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 이진트리 중위 순회
 * 1. 재귀함수 이용 Recursion
 * 2. 스택을 이용 Stack
 *
 * -- Tree Traversal 방식 --
 * inorder : left self right
 * preorder : self left right
 * postorder : left right self
 */
public class BinaryTreeInorderTraversal {
    // 초기값 설정이 어렵네
    private static void init(TreeNode root) {

    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode();
        init(root);
        List<Integer> res = new ArrayList<>();
        helper1(root, res);

    }

    /**
     * 1번째 방법
     */
    private static void helper1(TreeNode root, List<Integer> res) {
        helper1(root.left, res);
        res.add(root.val);
        helper1(root.right, res);
    }

    /**
     * 2번째 방법
     */
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            Stack<TreeNode> stack = new Stack<>();
            TreeNode curr = root;
            while (curr != null || !stack.isEmpty()) {
                while (curr != null) {
                    stack.push(curr);
                    curr = curr.left;
                }
                curr = stack.pop();
                res.add(curr.val);
                curr = curr.right;
            }
            return res;
        }
    }

}
