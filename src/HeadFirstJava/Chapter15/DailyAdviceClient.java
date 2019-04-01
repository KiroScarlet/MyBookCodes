package HeadFirstJava.Chapter15;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * @author KiroScarlet
 * @date 2019-03-11  -22:21
 */
public class DailyAdviceClient {

    public void go() {
        try {
            Socket e = new Socket("127.0.0.1", 4242);
            InputStreamReader streamReader = new InputStreamReader(e.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
