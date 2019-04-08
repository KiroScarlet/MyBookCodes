package NewCoderSolution.real2019;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-08  -19:36
 */

//判断一个单链表是否有环



public class Real01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String linkListNode=in.next();
//        System.out.println(linkListNode);
        String[] nodeVal = linkListNode.split(",");
//        System.out.println(Arrays.toString(nodeVal));
        boolean result=hasCircle(nodeVal);

        System.out.println(result);
    }

    private static boolean hasCircle(String[] nodeVal) {
        if (nodeVal.length <= 1) {
            return false;
        }
        Node node = new Node(nodeVal[0]);
        for (int i = 0; i < nodeVal.length-1; i++) {
            if (node.next != null) {
                return true;
            } else {
                node.next = new Node(nodeVal[i + 1]);
                node = node.next;
            }
        }
        return false;

    }
}

class Node {
    String value ;
    Node next = null;

    public Node(String value) {
        this.value = value;
    }
}