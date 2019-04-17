package NewCoderSolution.offer;

import javax.crypto.Cipher;

/**
 * @author KiroScarlet
 * @date 2019-04-09  -16:19
 * 题目描述
输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 *
 */
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    public RandomListNode(int label) {
        this.label = label;
    }
}
public class Offer25 {
        /*
     *解题思路：
     *1、遍历链表，复制每个结点，如复制结点A得到A1，将结点A1插到结点A后面；
     *2、重新遍历链表，复制老结点的随机指针给新结点，如A1.random = A.random.next;
     *3、拆分链表，将链表拆分为原链表和复制后的链表
     */
    public RandomListNode Clone(RandomListNode pHead){
        if (pHead == null) {
            return null;
        }
        RandomListNode currentNode = pHead;
        while (currentNode != null) {
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            cloneNode.next = currentNode.next;
            currentNode.next = cloneNode;
            currentNode = cloneNode.next;
        }

        currentNode = pHead;
        while (currentNode != null) {
            if (currentNode.random != null) {
                currentNode.next.random = currentNode.random.next;
            } else {
                currentNode.next.random = null;
            }
            currentNode = currentNode.next.next;
        }

        currentNode = pHead;
        RandomListNode pCloneHead = pHead.next;
        RandomListNode cloneCurrentNode=pCloneHead;
        while (currentNode != null) {
            currentNode.next = currentNode.next.next;
            //注意空指针问题
            if (currentNode.next!=null){
                cloneCurrentNode.next = cloneCurrentNode.next.next;
            }
            currentNode = currentNode.next;
            cloneCurrentNode = cloneCurrentNode.next;
        }

        return pCloneHead;
    }
}
