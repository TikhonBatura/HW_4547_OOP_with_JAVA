package HomeWork.HW_3;

//Задание
//
//        Пусть дан произвольный список целых чисел.
//
//        1) Нужно удалить из него чётные числа
//        2) Найти минимальное значение
//        3) Найти максимальное значение
//        4) Найти среднее ариф. значение

import java.util.*;

public class Task_01 {
    public static void main(String[] args) {
        boolean flag = false;
        while (!flag) {


            List<Integer> task_array = new ArrayList<>(Arrays.asList(1, 5, 12, 14, 25, 4, 16, -3));
            List<Integer> result_array = new ArrayList<>();
            System.out.println();
            System.out.println("Please select, would you like to do with current array: ");
            System.out.println();
            System.out.println("1. Delete from array all even numbers;");
            System.out.println("2. Find minimal value;");
            System.out.println("3. Find maximal value;");
            System.out.println("4. Find arithmetic mean value;");
            System.out.println("5. End program;");
            System.out.println();

            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter number of option: ");
            var input_num = sc.nextInt();
            Iterator<Integer> it = task_array.iterator();

            switch (input_num) {

                case (1):
                    while (it.hasNext()) {
                        Integer i = it.next();
                        if (i % 2 != 0) {
                            result_array.add(i);
                        }
                    }
                    System.out.println();
                    System.out.println("Array was: " + task_array);
                    System.out.println("Array become: " + result_array);
                    System.out.println("*********************");
                    break;


                case (2):
                    Integer min = task_array.get(0);
                    //System.out.println("1th enter Min = " + min);
                    while (it.hasNext()) {
                        Integer i = it.next();
                        if (i < min) {
                            min = i;
                        }
                    }

                    System.out.println("From: " + task_array);
                    System.out.println("Min value = " + min);
                    System.out.println("*******************");
                    break;

                case (3):
                    Integer max = task_array.get(0);
                    //System.out.println("1th enter Max = " + max);
                    while (it.hasNext()) {
                        Integer i = it.next();
                        if (i > max) {
                            max = i;
                        }
                    }
                    System.out.println("From: " + task_array);
                    System.out.println("Max value = " + max);
                    System.out.println("*******************");
                    break;

                case (4):
                    Double sum = 0.0;
                    Double array_size = Double.valueOf(task_array.size());
                    while (it.hasNext()) {
                        Integer i = it.next();
                        sum = sum + i;
                    }
//                    System.out.println("From: " + task_array);
//                    System.out.println("Sum = " + sum);
                    System.out.println("Array size = " + array_size);
                    System.out.println("Arithmetic mean value = " + sum/array_size);
                    System.out.println("*******************");
                    break;


                case (5):
                    flag = true;

                default:
                    System.out.println("incorrect input");

            }
        }
    }
}


