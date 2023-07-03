package HomeWork.HW_9_1;

public class Sparrow extends Animal{
    public Sparrow (String color, String species, Integer legsCount) {
        super(color, species, legsCount);
    }
    @Override
    public void fly() {
        System.out.print("I am sparrow, ");
        super.fly();
    }

    private void eat(){
        System.out.println("I'm eating!");
    }

    private void clean(){
        System.out.println("Sparrow is cleaning...");
    }

    public void dayOfSparrow(int ... args){
        eat();
        fly();
        eat();
        clean();
        fly();
    }
}

