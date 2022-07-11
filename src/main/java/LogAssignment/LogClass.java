package LogAssignment;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class LogClass {
    public Logger LGR;
    ConsoleHandler CH;
    FileHandler FH;

    public LogClass(String fileName) throws SecurityException, IOException {

        LGR = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

        LogManager.getLogManager().reset();
        LGR.setLevel(Level.ALL);

        CH = new ConsoleHandler();
        CH.setLevel(Level.ALL);
        LGR.addHandler(CH);

        File file = new File(fileName);
        if(!file.exists()){
            file.createNewFile();
        }

        FH = new FileHandler(fileName, true);
        FH.setLevel(Level.ALL);
        LGR.addHandler(FH);
        SimpleFormatter formatter = new SimpleFormatter();
        FH.setFormatter(formatter);

    }

}
