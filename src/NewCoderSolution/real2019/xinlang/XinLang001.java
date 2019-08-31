package NewCoderSolution.real2019.xinlang;

import java.util.Scanner;

/**
 * @author KiroScarlet
 * @date 2019-08-31  -16:53
 * @title XinLang001
 * @project MyBookCodes
 * @desc TODO
 */
public class XinLang001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        String[] split = s.split(", ");

        String result = split[0];
        for (int i = 1; i < split.length; i++) {
            if (compare(result, split[i]) > 0) {
                result = split[i];
            }
        }

        System.out.println(result);

    }

    public String getMinVersion(String[] list) {
        String result = list[0];
        for (int i = 1; i < list.length; i++) {
            if (compare(result, list[i]) > 0) {
                result = list[i];
            }

        }

        return result;
    }


    private static int compare(String s1, String s2) {
        String[] split1 = s1.split("\\.");
        String[] split2 = s2.split("\\.");

        int length = split1.length < split2.length ? split1.length : split2.length;

        for (int i = 0; i < length; i++) {
            if (Integer.valueOf(split1[i]) < Integer.valueOf(split2[i])) {
                return -1;
            } else if (Integer.valueOf(split1[i]) > Integer.valueOf(split2[i])) {
                return 1;
            }
        }
        return 0;
    }
}
