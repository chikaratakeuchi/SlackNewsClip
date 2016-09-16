import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

public class CSVWriterReader {
    /**
     * main
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String file_name = "test.csv";

        {
            /*write CSV*/
            CSVPrintWriter csvpw = new CSVPrintWriter(file_name);

            csvpw.println(100, "Sato");
            csvpw.println(101, "Suzuki");
            csvpw.println(102, "Tanaka");

            csvpw.close();
        }
        {
            /*read CSV*/
            CSVScanner csvscan = new CSVScanner(new File(file_name));

            ArrayList<String[]> csv_data = csvscan.read();
            csv_data.stream().forEach(
                    line->System.out.println(Arrays.toString(line))
            );

            csvscan.close();
        }
    }
}