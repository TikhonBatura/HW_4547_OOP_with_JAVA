package HomeWork.HW_1;

import java.util.Scanner;

public class HW_tsk_03 {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter 1th number: ");
        Double num_1 = sc.nextDouble();
        System.out.println();
        System.out.print("Please, choose operator (+),(-),(*),(/): ");
        String operator = sc.next();
        System.out.println();
        System.out.print("Please, enter 2th number: ");
        Double num_2 = sc.nextDouble();

        switch (operator) {
            case ("+"):
                System.out.printf("%f + %f = %f", num_1, num_2, num_1 + num_2);
                break;

            case ("-"):
                System.out.printf("%f - %f = %f", num_1, num_2, num_1 - num_2);
                break;

            case ("*"):
                System.out.printf("%f x %f = %f", num_1, num_2, num_1 * num_2);
                break;

            case ("/"):
                System.out.printf("%f / %f = %f", num_1, num_2, num_1 / num_2);
                break;
            default:
                System.out.println("Something goes wrong...bye!");

        }
    }
}
