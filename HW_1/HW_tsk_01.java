package HomeWork.HW_1;


//Вычислить n-ое треугольного число (сумма чисел от 1 до n),
// n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class HW_tsk_01 {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number: ");
        int input_num = sc.nextInt();
        System.out.printf("Triangle number from %d = %d", input_num, triangle_number(input_num));
        System.out.println();
        System.out.printf("%d! = %d", input_num, factorial(input_num));
        sc.close();
    }
    public static int triangle_number(int num){
        int result = 0;
        if (num <= result){
            return result;
        }
        else result = num + triangle_number(num-1);
        return result;
    }

    public static int factorial (int num){
        int result = 1;
        if (num <= result){
            return result;
        }
        else result = num * factorial(num-1);
        return result;
    }
}
