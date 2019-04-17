package NewCoderSolution.offer;


import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-16  -22:36
 * 题目描述
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
 */

public class Offer26 {
    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
/*
        解题思路：
        1.核心是中序遍历的非递归算法。
        2.修改当前遍历节点与前一遍历节点的指针指向。*/
        if (pRootOfTree == null) {
            return null;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = pRootOfTree;
        TreeNode pre = null;//保存中序遍历序列的上一节点
        boolean isFirst = true;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            if (!stack.isEmpty()) {
                cur = stack.pop();
                if (isFirst) {
                    pRootOfTree = cur;
                    pre = pRootOfTree;
                    isFirst = false;
                } else {
                    pre.right = cur;
                    cur.left = pre;
                    pre = cur;
                }
                cur = cur.right;
            }
        }
        return pRootOfTree;
    }
}
