package WebService.SocketTest;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author KiroScarlet
 * @date 2019-03-12  -19:07
 */
public class SocketSer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        boolean flag = true;
        while (flag) {
            System.out.println("listen:");
            Socket sc = ss.accept();
            InputStream is = sc.getInputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            len = is.read(buffer);
            String getData = new String(buffer, 0, len);
            System.out.println(getData);
            String outPutData = getData.toUpperCase();
            OutputStream os = sc.getOutputStream();
            os.write(outPutData.getBytes("UTF-8"));

            os.close();
            is.close();
            sc.close();
        }

        ss.close();
    }
}
