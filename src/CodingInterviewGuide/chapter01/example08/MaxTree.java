package CodingInterviewGuide.chapter01.example08;

/**
 * @author KiroScarlet
 * @date 2019-04-15  -14:40
 * 构造数组的MaxTree，数组没有重复元素。
 * MaxTree是一棵二叉树，数组的每一个值对应一个二叉树的节点。每一棵子树值最大的节点都是树的头。
 */

class Node{
    public int value;
    public Node left;
    public Node right;

    public Node(int value) {
        this.value = value;
    }
}
public class MaxTree {
}
