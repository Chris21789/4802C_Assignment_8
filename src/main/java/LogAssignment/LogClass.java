package LogAssignment;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class LogClass {
    public static final Logger LGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void logInit(String fileName) {
        ConsoleHandler CH;
        FileHandler FH;

        try {
            LogManager.getLogManager().reset();
            LGR.setLevel(Level.ALL);

            CH = new ConsoleHandler();
            CH.setLevel(Level.ALL);
            LGR.addHandler(CH);

            File file = new File(fileName);
            if (!file.exists()) {
                file.createNewFile();
            }

            FH = new FileHandler(fileName, true);
            FH.setLevel(Level.ALL);
            LGR.addHandler(FH);
            SimpleFormatter formatter = new SimpleFormatter();
            FH.setFormatter(formatter);

            LGR.info("Logger Started");

        } catch (Exception e) {
            LGR.log(Level.ALL, "Exception:", e);
        }

    }

}
