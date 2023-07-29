package control;

public interface Operations {

    default float add(float a, float b){
        return a + b;
    }
    default float subtract(float a, float b) {
        return a - b;
    }

    default float multiply(float a, float b)  {
        return a * b;
    }

    default float divide(float a, float b){
        if (b == 0) {
            System.out.println("Divide by zero is denied");
        }
        return a / b;
    }
}
