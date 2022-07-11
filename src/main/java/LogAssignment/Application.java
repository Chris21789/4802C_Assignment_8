package LogAssignment;

import java.util.logging.Level;

public class Application extends LogClass{

    public void Application (int v) {
        int a;

        try {
            for (a = v; a <= 100; a++){
                int b = a - 1;
                int c = a / b;
                LGR.log(Level.INFO, "For a/(a-1) = b, if a equals " + a + " than c equals " + c + "\n");
            }

        } catch (Exception e) {
            LGR.log(Level.SEVERE, "Exception: " + e + "\n");
            LGR.log(Level.WARNING, "Continuing for loop \n");
            Application(2);
        }

    }

}