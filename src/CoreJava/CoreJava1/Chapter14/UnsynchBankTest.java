package CoreJava.CoreJava1.Chapter14;

/**
 * @author KiroScarlet
 * @date 2019-03-10  -14:55
 */
public class UnsynchBankTest {
    public static final int NACCOUNTS = 100;
    public static final double INITIAL_BALANCE = 1000;
    public static final double MAX_ACCOUNT = 1000;
    public static final int DELAY = 1000;

    public static void main(String[] args) {
        Bank bank = new Bank(NACCOUNTS, INITIAL_BALANCE);
        for (int i = 0; i < NACCOUNTS; i++) {
            int fromAccount = i;
            Runnable r = () ->{
                try {
                    while (true) {
                        int toAccount = (int) (bank.size() * Math.random());
                        double amount = MAX_ACCOUNT * Math.random();
                        bank.transfor(fromAccount, toAccount, amount);
                        Thread.sleep((int) (DELAY * Math.random()));
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };
            Thread t = new Thread(r);
            t.start();

        }
    }
}
