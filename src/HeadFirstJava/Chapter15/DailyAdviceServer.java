package HeadFirstJava.Chapter15;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -22:27
 */
public class DailyAdviceServer {
    String[] adviceList = {"1111111", "212222222", "33333333"};

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }

    private void go() {
        try {
            ServerSocket serverSocket = new ServerSocket(4242);
            while (true) {
                Socket sock = serverSocket.accept();
                PrintWriter writer = new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.print(advice);
                writer.close();
                System.out.println(advice);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getAdvice() {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

}
