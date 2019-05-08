import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PinDuoDuo03_02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] count = new int[20000];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            for (int j = a; j < b; j++) {
                count[j] += 1;
            }
        }
        int sum = 0;
        int index = 0;
        List<Integer> list = new ArrayList<>();
        while (index < 19999) {
            if (count[index] >= k) {
                sum += 1;
                list.add(index);
                int right = index + 1;
                while (right < 19999 && count[right] >= k) {
                    right ++;
                }
                list.add(right);
                index = right;
            }
            index++;
        }
        System.out.println(sum);
        for (int i = 0; i < list.size(); i+=2) {
            System.out.println(list.get(i) + " " + list.get(i + 1));
        }
    }
}