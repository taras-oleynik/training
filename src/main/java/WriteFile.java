import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Created by Taras_Oliinyk on 8/22/2018.
 */
public class WriteFile {

    public static void main(String[] args) throws Exception {


        FileWriter fw = new FileWriter("temp345.txt");
        fw.write("Hi \n there i am here");
        fw.close();
        FileReader fr = new FileReader("temp345.txt");
        Scanner sc = new Scanner(fr);
        int i = 1;

        while (sc.hasNextLine()){

            System.out.println(i + " : " + sc.nextLine());
            i++;
        }

        fr.close();


    }
}
