package NewCoderSolution.real2019.huawei;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-04-10  -19:02
 */
public class HuaWei01 {

    public static void main(String[] args) {

        ArrayList<String> result = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = in.next();
        }
        for (int i = 0; i < n; i++) {
            String s = strings[i];
            StringBuffer stringBuffer = new StringBuffer(s);
            int length = s.length() % 8;
            while ((8-length) != 0) {
                stringBuffer.append('0');
                length++;
            }
            for (int j = 0; j < s.length(); j = j + 8) {
                result.add(stringBuffer.substring(j, j + 8));
            }

        }
        Collections.sort(result);
        for (String s:result) {
            System.out.print(s+' ');
        }

    }
}

