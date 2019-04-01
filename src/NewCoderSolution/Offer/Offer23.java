package NewCoderSolution.Offer;

/**
 * @author KiroScarlet
 * @date 2019-04-01  -11:37
 * 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Offer23 {
    public static void main(String[] args) {
        Offer23 test = new Offer23();
        boolean result = test.VerifySquenceOfBST(new int[]{4, 8, 6, 12, 14});
        System.out.println(result);

    }
    public boolean VerifySquenceOfBST(int [] sequence) {
        /*BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），如果去掉最后一个元素的序列为T，
        那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，且这两段（子树）都是合法的后序序列。*/

        if (sequence.length==0) {
            return false;
        }
        return isBST(sequence, 0, sequence.length - 1);


    }

    public boolean isBST(int[] sequence, int left, int right) {
        int length = right - left;
        if (length < 1) {
            return true;
        }
        int i = left;
        while (i < right - 1) {
            if (sequence[i] > sequence[right]) {
                break;
            }
            i++;
        }
        for (int j = i; j < right - 1; j++) {
            if (sequence[j] < sequence[right]) {
                return false;
            }
        }
        return isBST(sequence, left, i - 1) && isBST(sequence, i, right - 1);
    }
}
