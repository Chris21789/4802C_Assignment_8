package LogAssignment;

import java.io.File;
import java.util.logging.*;

public class LogClass {
    public static final Logger LGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void logInit() {
        ConsoleHandler CH;
        FileHandler FH;

        try {
            LogManager.getLogManager().reset();
            LGR.setLevel(Level.ALL);

            CH = new ConsoleHandler();
            CH.setLevel(Level.WARNING);
            LGR.addHandler(CH);

            File fullLogs = new File("log.txt");
            if (!fullLogs.exists()) {
                fullLogs.createNewFile();
            }

            File parsedLogs = new File("parsed-log.txt");
            if (!parsedLogs.exists()) {
                parsedLogs.createNewFile();
            }

            FH = new FileHandler("log.txt", true);
            FH.setLevel(Level.ALL);
            LGR.addHandler(FH);
            SimpleFormatter formatter = new SimpleFormatter();
            FH.setFormatter(formatter);

            FH = new FileHandler("parsed-log.txt", true);
            FH.setLevel(Level.WARNING);
            LGR.addHandler(FH);
            FH.setFormatter(formatter);

            LGR.info("Logger Started \n");

        } catch (Exception e) {
            LGR.log(Level.ALL, "Exception:", e);
        }

    }

}
