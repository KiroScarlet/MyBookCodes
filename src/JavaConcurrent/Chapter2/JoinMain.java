package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -22:16
 */
public class JoinMain {
    public volatile static int i=0;

    public static class AddThread extends Thread {
        @Override
        public void run() {
            while (i < 1000000){
                i++;
            };

        }
    }

    public static void main(String[] args) throws InterruptedException {
        AddThread at = new AddThread();
        at.start();
        at.join();//join方法的本质是让调用线程wait() 方法在当前线程对象实例上
        System.out.println(i);
    }
}
