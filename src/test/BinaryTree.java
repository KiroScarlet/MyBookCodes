package test;


import org.junit.Test;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author KiroScarlet
 * @date 2019-04-17  -9:54
 * 二叉树的遍历
 */


public class BinaryTree {
    //二叉树的节点
    private class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    //由二叉树的前序和中序遍历重建二叉树

    /* 先序遍历第一个位置肯定是根节点node，
      中序遍历的根节点位置在中间p，在p左边的肯定是node的左子树的中序数组，p右边的肯定是node的右子树的中序数组
      另一方面，先序遍历的第二个位置到p，也是node左子树的先序子数组，剩下p右边的就是node的右子树的先序子数组
      把四个数组找出来，分左右递归调用即可
    */
    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        return buildTree(pre,0,pre.length-1,in ,0,in.length-1);
    }
    private TreeNode buildTree(int[] pre,int preLeft,int preRight,int[] in ,int inLeft,int inRight){

        if(preLeft>preRight||inLeft>inRight){
            return null;
        }
        TreeNode rootNode=new TreeNode(pre[preLeft]);
        for(int i=inLeft;i<=inRight;i++){
            if (pre[preLeft]==in[i]){
                int leftLength=i-inLeft;

                rootNode.val=pre[preLeft];
                rootNode.left=buildTree(pre,preLeft+1,preLeft+leftLength,in,inLeft,i-1);
                rootNode.right=buildTree(pre,preLeft+leftLength+1,preRight,in,i+1,inRight);

            }
        }
        return rootNode;
    }

    /**
     * 前序遍历，递归方法
     */
    public void preOrder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }


    /**
     * 前序遍历，非递归方法，借助栈实现
     */
    public void preOrderNonrecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                System.out.print(root.val + " ");
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                root = root.right;
            }
        }
    }

    /**
     * 中序遍历，递归方法
     */
    public void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }

    /**
     * 中序遍历，非递归方法，借助栈实现
     */
    public void inOrderNonrecursive(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            if (!stack.isEmpty()) {
                root = stack.pop();
                System.out.print(root.val + " ");
                root = root.right;
            }
        }
    }

    /**
     * 后序遍历，递归方法
     */
    public void postOrder(TreeNode root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }

    /**
     * 后序遍历，非递归方法，使用两个栈来实现
     */
    public void postOrderNonrecursive(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> intStack = new Stack<>();
        int i = 1;
        while (root != null || !nodeStack.isEmpty()) {
            while (root != null) {
                nodeStack.push(root);
                intStack.push(0);
                root = root.left;
            }
            while (!nodeStack.isEmpty() && intStack.peek() == i) {
                intStack.pop();
                System.out.print(nodeStack.pop().val + " ");
            }
            if (!nodeStack.isEmpty()) {
                intStack.pop();
                intStack.push(1);
                root = nodeStack.peek();
                root = root.right;
            }
        }
    }

    /**
     * 层次遍历，非递归方法，借用一个队列来实现
     */
    public void levelOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode currentNode;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            System.out.print(currentNode.val + " ");
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
    }

    @Test
    public void Test() {
        int[] pre = {4, 2, 1, 3, 6, 5, 7, 8, 10};
        int[] in = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        BinaryTree binaryTree = new BinaryTree();
        TreeNode root = binaryTree.reConstructBinaryTree(pre, in);
        System.out.print("递归前序遍历 ：");
        binaryTree.preOrder(root);
        System.out.print("\n非递归前序遍历：");
        binaryTree.preOrderNonrecursive(root);
        System.out.print("\n递归中序遍历 ：");
        binaryTree.inOrder(root);
        System.out.print("\n非递归中序遍历 ：");
        binaryTree.inOrderNonrecursive(root);
        System.out.print("\n递归后序遍历 ：");
        binaryTree.postOrder(root);
        System.out.print("\n非递归后序遍历 ：");
        binaryTree.postOrderNonrecursive(root);
        System.out.print("\n层序遍历：");
        binaryTree.levelOrder(root);
    }
}
