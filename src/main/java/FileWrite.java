import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.util.List;

/**
 * Created by Taras_Oliinyk on 9/3/2018.
 */
public class FileWrite {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\Taras_Oliinyk\\Desktop", "temp.txt");

        Charset charset = Charset.forName("UTF-8");
        List<String> lines = Files.readAllLines(path,charset);
        System.out.println(lines);
        String content = "Hello World !! new text";
        Files.write(path, content.getBytes(), StandardOpenOption.APPEND);


    }
    //https://docs.oracle.com/javase/7/docs/api/java/nio/file/Files.html#readAllLines(java.nio.file.Path,%20java.nio.charset.Charset)
}
