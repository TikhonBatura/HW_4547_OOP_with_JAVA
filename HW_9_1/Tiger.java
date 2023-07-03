package HomeWork.HW_9_1;

public class Tiger extends Animal{
    public Tiger (String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }
    @Override
    public void toGo() {
        System.out.print("I am Tiger, ");
        super.toGo();
    }
}
