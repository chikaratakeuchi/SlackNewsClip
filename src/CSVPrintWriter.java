import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CSVPrintWriter {
    PrintWriter pw_;

    // Constructor
    public CSVPrintWriter(String fileName) {
        try {
            this.pw_ = new PrintWriter(fileName);
        } catch (FileNotFoundException fnex) {
            fnex.printStackTrace();
        }
    }

    public CSVPrintWriter(File file) {
        try {
            this.pw_ = new PrintWriter(file);
        } catch (FileNotFoundException fnex) {
            fnex.printStackTrace();
        }
    }

    public void close() {
        this.pw_.close();
    }

    public void print(Object arg) {
        synchronized (this.pw_) {
            this.pw_.print(arg);
            this.pw_.print(",");
        }
    }

    public void println(Object... args) {
        synchronized (this.pw_) {
            for (int i = 0; i < args.length; i++) {
                this.pw_.print(args[i]);
                this.pw_.print(",");
            }
            this.pw_.println();
        }
    }

}