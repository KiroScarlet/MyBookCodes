package NewCoderSolution.offer;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author KiroScarlet
 * @date 2019-04-01  -11:29
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */



public class Offer22 {

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        TreeNode tmp;
        queue.add(root);
        while(queue.peek()!=null){
            tmp=queue.poll();
            result.add(tmp.val);
            if(tmp.left!=null){
                queue.add(tmp.left);
            }
            if(tmp.right!=null){
                queue.add(tmp.right);
            }
        }
        return result;
    }
}
