package Seminar_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class task1 {
    // [49, 50, -47, -124, -48, -80, -47, -124, -47, -117, -48, -78, -48, -80]

    // byte x = -8;
    //
    public static void main(String[] args) throws IOException {

        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
			byte[] bytes = new byte[100];
			fileInputStream.read(bytes);
			// byte[] bytes = fileInputStream.readAllBytes();
			System.out.println(Arrays.toString(bytes));
		}

        // BufferedOutputStream os = new BufferedOutputStream(new
        // FileOutputStream("file.txt"));
        // String text = "12фафыва";
        // byte[] bytes = text.getBytes();
        // System.out.println(Arrays.toString(bytes));
        // os.write(bytes);
        // os.flush();
    }
}
