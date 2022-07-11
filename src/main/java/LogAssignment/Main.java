package LogAssignment;

public class Main {
    public static void main(String[] args) {
        LogClass LC = new LogClass();
        Application APP = new Application();

        LC.logInit();
        APP.Application(0);
        LC.LGR.warning("Program finished and logs written to files \n");
    }
}
