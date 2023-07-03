package HomeWork.HW_9_1;

public class Shark extends Animal {
    public Shark (String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }

    @Override
    public void swim() {
        System.out.print("I am Shark, ");
        super.swim();
    }
}
