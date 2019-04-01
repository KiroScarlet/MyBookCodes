package CoreJava.CoreJava1.Chapter8;

/**
 * @author KiroScarlet
 * @date 2019-03-05  -16:17
 */
public class Pair<T> {
    private T first;
    private T second;


    public Pair( ) {
        first = null;
        second = null;
    }

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }
}
