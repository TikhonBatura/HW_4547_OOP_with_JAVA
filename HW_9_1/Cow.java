package HomeWork.HW_9_1;

public class Cow extends Animal {
    public Cow (String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }
    @Override
    public void toGo() {
        System.out.print("I am Cow, ");
        super.toGo();
    }
}
