package NewCoderSolution.real2019.others;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-05-27  -19:43
 */
public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        test2 test2 = new test2();
        System.out.println(test2.glodonNumTest(n));

    }

    private boolean glodonNumTest(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true){
            System.out.println(n);

            if (n == 1) {
                return true;
            }
            n = fun(n);

            if (arrayList.contains(n)) {
                return false;
            }
            arrayList.add(n);

        }
    }

    private int fun(int n) {
        int result = 0;
        while (true) {
            if (n  == 0) {
            break;
        }
            result += (n % 10) * (n % 10);
            n = n / 10;

        }
        return result;
    }
}
