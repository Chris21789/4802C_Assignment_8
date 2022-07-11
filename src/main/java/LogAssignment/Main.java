package LogAssignment;

import java.io.IOException;
import java.util.logging.Level;

import static LogAssignment.LogClass.LGR;
import static LogAssignment.LogClass.logInit;

public class Main {
    public static void main(String[] args) {

        logInit("log.txt");

        try {
            int a =10/0;

        } catch (Exception e) {
            LGR.log(Level.ALL, "Exception:", e);
        }

        LGR.info("Program finished");

    }

}
