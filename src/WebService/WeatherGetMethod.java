package WebService;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author KiroScarlet
 * @date 2019-03-12  -21:01
 */
public class WeatherGetMethod {

    public static void main(String[] args) {
        WeatherGetMethod weatherGetMethod = new WeatherGetMethod();
        try {
            weatherGetMethod.get("18817576022","");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void get(String mobileCode, String userID) throws Exception {
        URL url = new URL("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo?mobileCode="
                + mobileCode + "&userID=" + userID);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setConnectTimeout(5000);
        conn.setRequestMethod("GET");

        if (conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
            InputStream is = conn.getInputStream();
            ByteArrayOutputStream boas = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len = -1;
            while ((len = is.read(buffer)) != -1) {
                boas.write(buffer,0,len);
            }
            System.out.println(boas.toString());
            boas.close();
            is.close();
        }
    }
}
