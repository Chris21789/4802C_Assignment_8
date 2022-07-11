package LogAssignment;

import java.util.logging.Level;

import static java.lang.Math.pow;

public class Application extends LogClass{

    public void Application (int v) {
        int a;

        try {
            for (a = v; a <= 100; a++){
                int b = (int) Math.pow(a, 3);
                int c = b / a;
                LGR.log(Level.INFO, "For a^3/a = b, if a equals " + a + " than b equals " + c + "\n");
            }

        } catch (Exception e) {
            LGR.log(Level.SEVERE, "Exception: " + e + "\n");
            LGR.log(Level.WARNING, "Continuing for loop \n");
            Application(1);
        }

    }

}