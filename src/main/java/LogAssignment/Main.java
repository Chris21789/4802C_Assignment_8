package LogAssignment;

import java.io.IOException;
import java.util.logging.Level;

public class Main {
    public static void main(String[] args) {
        try {
            LogClass Log = new LogClass("log.txt");

            Log.LGR.setLevel(Level.ALL);

            Log.LGR.info("Info msg");
            Log.LGR.warning("Warning msg");
            Log.LGR.severe("severe msg");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
