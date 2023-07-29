package view;

import control.Calculator;
import model.OperatorChars;

import java.util.Arrays;
import java.util.Scanner;

public class UserView {
    public UserView (Calculator calculator){
        super();
    }

    public void run(){
        OperatorChars operatorChars;
        float a = 0;
        float b = 0;

            boolean flag = false;
            System.out.println("Добро пожаловать в калькулятор!");

            while (!flag) {
                String value1 = userInput("Введите число a: ");
                if (checkIfInputText(value1)) {
                    flag = true;
                    a = Float.parseFloat(value1);
                    System.out.println("a = " + value1);
                }
            }
            flag = false;
            while (!flag) {
                String value2 = userInput("Введите число b: ");
                if (checkIfInputText(value2)) {
                    flag = true;
                    b = Float.parseFloat(value2);
                    System.out.println("b = " + value2);
                }
            }
            System.out.println("Выберете действие, которе хотите совершить над числами: ");
            System.out.println(Arrays.toString(OperatorChars.values()));
            operatorChars = OperatorChars.valueOf(userInput("введи знак действия: "));
            Calculator calculator = new Calculator();
            switch (operatorChars) {
                case ADD -> {
                    System.out.println(calculator.add(a, b));

                }
                case SUBTRACT -> {
                    System.out.println(calculator.subtract(a,b));
                }
                case MULTIPLY -> {
                    System.out.println(calculator.multiply(a, b));
                }
                case DIVIDE -> {
                    System.out.println(calculator.divide(a, b));

                }
            }


    }

    String userInput (String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

    static boolean checkIfInputText(String input){ // метод проверяющий возможно ли преобразования строки во Float число.
        try {
            Float.parseFloat(input);
        } catch (NumberFormatException e){
            System.out.println("Некорректный ввод. Надо ввести число");
            return false;
        }
        return true;
    }
}
