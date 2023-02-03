import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class Logging {
    static Date date = new Date();

    public static void logWrite(String action) {

        try {
            FileWriter fileWriter = new FileWriter("log.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("---------------------------------------------------");
            printWriter.println("| " + date + " | " + action + " |");
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}