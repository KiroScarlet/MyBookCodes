package CoreJava.CoreJava1.Chapter7;

import java.io.IOException;

/**
 * @author KiroScarlet
 * @date 2019-03-03  -21:35
 */
public class FileFormatException extends IOException {
    public FileFormatException() {
    }

    public FileFormatException(String message) {
        super(message);
    }
}
