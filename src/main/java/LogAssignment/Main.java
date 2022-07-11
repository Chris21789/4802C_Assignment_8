package LogAssignment;

public class Main {
    public static void main(String[] args) {
        LogClass LC = new LogClass();
        Application APP = new Application();

        LC.logInit("log.txt");
        APP.Application(0);
        LC.LGR.info("Program finished and log written to file \n");
    }
}
