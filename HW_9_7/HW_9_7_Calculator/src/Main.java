import control.Calculator;
import view.UserView;
import logger.Log;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger log = Log.log(Main.class.getName());


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        log.log(Level.INFO, "Method main in model package started");
        UserView view = new UserView(calculator);
        view.run();
    }
}
