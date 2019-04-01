package WebService.SocketTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-03-12  -19:12
 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter data:");
        String inputData = input.nextLine();
        Socket sc = new Socket("127.0.0.1", 6666);
        OutputStream os = sc.getOutputStream();
        os.write(inputData.getBytes());

        InputStream is = sc.getInputStream();
        byte[] buffer = new byte[1024];
        int len = -1;
        len = is.read(buffer);
        String getData = new String(buffer, 0, len);
        System.out.println(getData);
        is.close();
        os.close();
        sc.close();
    }
}
