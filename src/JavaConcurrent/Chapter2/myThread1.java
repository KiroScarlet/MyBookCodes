package JavaConcurrent.Chapter2;

/**
 * @author KiroScarlet
 * @date 2019-03-24  -17:12
 */
public class myThread1 extends Thread {
    public static void main(String[] args) {
        myThread1 t1=new myThread1();
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("hello");;
    }
}
