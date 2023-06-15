package HomeWork.HW_1;

import HomeWork.HW_2.Task_2.Task_2;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class HW_tsk_03 {
    public static void main(String [] args) throws IOException {

        Logger logger = Logger.getLogger(HW_tsk_03.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler data = new FileHandler("C:\\Users\\loki_\\OneDrive\\Документы\\Учеба\\Разработчик\\8.ОПП (на JAVA)\\HomeWork\\HW_1\\calc_log.txt");
        logger.addHandler(data);
        SimpleFormatter sFormat = new SimpleFormatter();
        data.setFormatter(sFormat);

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter 1th number: ");
        double num_1 = sc.nextDouble();
        System.out.println();
        System.out.print("Please, choose operator (+),(-),(*),(/): ");
        String operator = sc.next();
        System.out.println();
        System.out.print("Please, enter 2th number: ");
        double num_2 = sc.nextDouble();

        switch (operator) {
            case ("+"):
                System.out.printf("%f + %f = %f", num_1, num_2, num_1 + num_2);
                System.out.println();
                logger.info("USER activity: " + num_1 + " + " + num_2 + " = " + (num_1 + num_2));
                break;

            case ("-"):
                System.out.printf("%f - %f = %f", num_1, num_2, num_1 - num_2);
                System.out.println();
                logger.info("USER activity: " + num_1 + " - " + num_2 + " = " + (num_1 - num_2));
                break;

            case ("*"):
                System.out.printf("%f x %f = %f", num_1, num_2, num_1 * num_2);
                System.out.println();
                logger.info("USER activity: " + num_1 + " x " + num_2 + " = " + (num_1 * num_2));
                break;

            case ("/"):
                System.out.printf("%f / %f = %f", num_1, num_2, num_1 / num_2);
                System.out.println();
                logger.info("USER activity: " + num_1 + " / " + num_2 + " = " + (num_1 / num_2));
                break;
            default:
                System.out.println("Something goes wrong...bye!");
                logger.info("USER activity: " + "input_1 = " + num_1 + "input_2 = " + num_2);
        }
    }
}
