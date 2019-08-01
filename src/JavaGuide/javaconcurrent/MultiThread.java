package JavaGuide.javaconcurrent;

import org.junit.Test;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;

/**
 * @author KiroScarlet
 * @date 2019-08-01  -17:10
 * @title MultiThread
 * @project MyBookCodes
 * @desc 通过 JMX 来看一下一个普通的 Java 程序有哪些线程
 */
public class MultiThread {
    @Test
    public void test() {
        // 获取 Java 线程管理 MXBean
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        // 不需要获取同步的 monitor 和 synchronizer 信息，仅获取线程和线程堆栈信息
        ThreadInfo[] threadInfos = threadMXBean.dumpAllThreads(false, false);
        // 遍历线程信息，仅打印线程 ID 和线程名称信息
        for (ThreadInfo threadInfo : threadInfos) {
            System.out.println(threadInfo.getThreadId() + ":" + threadInfo.getThreadName());
        }
    }
}
