package CoreJava.CoreJava1.Chapter14;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author KiroScarlet
 * @date 2019-03-10  -14:46
 */
public class Bank {
    private final double[] accounts;
    private Lock bankLock;
    private Condition sufficientFunds;


    public Bank(int n ,double initalBalance) {
        accounts = new double[n];
        Arrays.fill(accounts,initalBalance);
        bankLock = new ReentrantLock();
        sufficientFunds = bankLock.newCondition();
    }

    public void transfor(int from, int to, double amount) throws InterruptedException {
        bankLock.lock();

        try {
            while (accounts[from] < amount) {
                sufficientFunds.await();
            }
            System.out.print(Thread.currentThread());
            accounts[from] -= amount;
            System.out.printf(" %10.2f from %d to %d", amount, from, to);
            accounts[to] += amount;
            System.out.printf(" Total Balance: %10.2f%n",getTotalBalance());
            sufficientFunds.signalAll();
        } finally {
            bankLock.unlock();
        }

    }

    public double getTotalBalance() {

        bankLock.lock();
        try {
            double sum = 0;
            for (double account : accounts) {
                sum += account;
            }
            return sum;
        } finally {
            bankLock.unlock();

        }
    }

    public int size() {
        return accounts.length;
    }
}
