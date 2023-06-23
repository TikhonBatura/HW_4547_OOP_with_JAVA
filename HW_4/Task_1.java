package HomeWork.HW_4;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

//Даны два Deque, представляющие два целых числа.
//Цифры хранятся в обратном порядке и каждый из их узлов содержит одну цифру.
//        1) Умножьте два числа и верните произведение в виде связанного списка.
//        2) Сложите два числа и верните сумму в виде связанного списка.
//        Одно или два числа могут быть отрицательными.
//
//        Даны два Deque, цифры в обратном порядке.
//        [3,2,1] - пример Deque
//        [5,4,3]- пример второго Deque
//        1) 123 * 345 = 42 435
//        Ответ всегда - связный список, в обычном порядке
//        [4,2,4,3,5] - пример ответа
public class Task_1 {
    public static void main(String[] args) {

        ArrayDeque<Integer> first_num = new ArrayDeque<Integer>();
        first_num.add(3);
        first_num.add(2);
        first_num.add(1);

        System.out.println("1th number is: " + Arrays.toString(first_num.toArray()));


        ArrayDeque<Integer> second_num = new ArrayDeque<Integer>();
        second_num.add(5);
        second_num.add(4);
        second_num.add(3);

        System.out.println("2th number is: " + Arrays.toString(second_num.toArray()));
        System.out.println();

        StringBuilder first_num_temp = new StringBuilder();
        StringBuilder second_num_temp = new StringBuilder();

        while(first_num.peek() != null){
            first_num_temp.append(first_num.pollLast());
        }
        //System.out.println(first_num_temp);

        while(second_num.peek() != null){
            second_num_temp.append(second_num.pollLast());
        }
        //System.out.println(second_num_temp);

        int num_1 = Integer.parseInt(String.valueOf(first_num_temp));
        int num_2 = Integer.parseInt(String.valueOf(second_num_temp));

        int multiply = num_1 * num_2;
        int sum = num_1 + num_2;

        //System.out.println("multiply = " + multiply);
        //System.out.println("sum = " + sum);

        LinkedList<Integer> result_multiply = new LinkedList<Integer>();
        LinkedList<Integer> result_sum = new LinkedList<Integer>();

        while (multiply != 0) {
            result_multiply.addFirst(multiply%10);
            multiply/=10;
        }

        System.out.println("Multiply is " + result_multiply);

        while (sum != 0) {
            result_sum.addFirst(sum%10);
            sum/=10;
        }
        System.out.println("Sum is " + result_sum);
    }
}
