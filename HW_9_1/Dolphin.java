package HomeWork.HW_9_1;

public class Dolphin extends Animal {
    public Dolphin (String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }
    @Override
    public void swim() {
        System.out.print("I am Dolphin, ");
        super.swim();
    }
}
