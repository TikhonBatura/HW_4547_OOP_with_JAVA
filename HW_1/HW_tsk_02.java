package HomeWork.HW_1;

//Вывести все простые числа от 1 до 1000

public class HW_tsk_02 {
    public static void main (String [] args) {
        int max = 1000;
        for (int i=2; i<max; i++){
            if(checkSimple(i))
                System.out.println(i);
        }
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }

}
