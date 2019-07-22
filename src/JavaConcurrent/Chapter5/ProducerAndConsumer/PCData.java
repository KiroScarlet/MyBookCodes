package JavaConcurrent.Chapter5.ProducerAndConsumer;

/**
 * @author KiroScarlet
 * @date 2019-06-11  -10:42
 * 共享数据模型
 */
public final class PCData {
    private final int intData;

    public PCData(int d) {
        this.intData = d;
    }

    public PCData(String d) {
        this.intData = Integer.valueOf(d);
    }

    @Override
    public String toString() {
        return "PCData{" +
                "intData=" + intData +
                '}';
    }

    public int getData() {
        return intData;
    }
}
