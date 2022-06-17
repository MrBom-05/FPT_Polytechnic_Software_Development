package Demo_FileIOStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        String filename = "file_io.txt";
        ghifile(filename);
        docfile(filename);
        
    }
    public static void ghifile(String filename) {
        String data = "Hello";

        File file = new File(filename);
        if (file.exists() == true) {
            System.out.println("File đã tồn tại");
        } else {
            System.out.println("File không tồn tại");
        }

        try {
            FileOutputStream fos = new FileOutputStream(file);
            byte[] b = data.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("OK");
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi luồng vào ra");
            e.printStackTrace();
        }
    }
    public static void docfile(String filename) {
        File file = new File(filename);
        if (file.exists() == false) {
            System.out.println("File không tồn tại");
            return;
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            while (true) {
                int i = fis.read();
                if (i == -1) {
                    break;
                }
                char c = (char) i;
                System.out.println(c);
            }

            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Lỗi luồng vào ra");
            e.printStackTrace();
        }
    }
}
