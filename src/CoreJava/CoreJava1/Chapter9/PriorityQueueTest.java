package CoreJava.CoreJava1.Chapter9;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @author KiroScarlet
 * @date 2019-03-05  -22:35
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(1906, 12, 9));
        pq.add(LocalDate.of(1814, 12, 9));
        pq.add(LocalDate.of(1234, 12, 9));
        pq.add(LocalDate.of(234, 12, 9));

        for (LocalDate date : pq) {
            System.out.println(date);
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
