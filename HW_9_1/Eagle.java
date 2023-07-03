package HomeWork.HW_9_1;

public class Eagle extends Animal {
    public Eagle (String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    @Override
    public void fly() {
        System.out.print("I am Eagle, ");
        super.fly();
    }
}
