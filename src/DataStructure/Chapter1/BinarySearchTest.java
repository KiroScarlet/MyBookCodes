package DataStructure.Chapter1;

import org.junit.Test;

/**
 * @author KiroScarlet
 * @date 2019-03-15  -14:47
 */
public class BinarySearchTest {
    public static int NOT_FOUND = -1;


    //二分查找，数组有序
    public static <AnyType extends Comparable<? super AnyType>> int binarySearch(String[] a, String x) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid].compareTo(x) < 0) {
                low = mid + 1;
            } else if (a[mid].compareTo(x) > 0) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return NOT_FOUND;
    }


    @Test
    public void test() {
        String[] a = {String.valueOf(1), String.valueOf(2), String.valueOf(4), String.valueOf(5)};

        String x = String.valueOf(4), y = String.valueOf(3);
        System.out.println(binarySearch(a,x)+" "+binarySearch(a,y));
    }
}
