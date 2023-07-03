package HomeWork.HW_9_1;



import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal("Slon", 32, "true", "White",
//        "Mammal", new Owner("Stas"), 4);
//        Animal animal1 = new Animal("Black", "Bird", 2);
//        System.out.println(animal.getAge());
//        animal.setAge(3);
//        System.out.println(animal.getAge());
//        System.out.println(animal);
//        Animal0 animal0 = new Animal0(null, null, null, null, null, null, null);
//        animal0.getAge();
//        System.out.println(animal0);
//        Animal cat = new Animal0();
//        List <Animal> animals = new ArrayList<>();
//        animals.add(new Dog(null, null, null));
//        animals.add(new Cat(null, null, null));
//        animals.add(cat);
//        animals.add(animal);
//        animals.add(animal1);
//        System.out.println(animals);
//        // for (Animal item : animals) {
//        //     if (item instanceof Cat) {
//        //     ((Cat)item).FIndFood(3);
//        //     ((Cat)item).FIndFood();
//        //     }
//        // }
//        Cat barsik = new Cat(null,null,null);
//            barsik.Hunt();

        Sparrow sparrow = new Sparrow("brown", null, 2);
        //sparrow.dayOfSparrow();

        Eagle eagle = new Eagle("brown", null, 2);

        Tiger tiger = new Tiger("red", null, 4);
        Cow cow = new Cow ("black&white", null, 4);

        Dolphin dolphin = new Dolphin("grey", null, 0);
        Shark shark = new Shark("black", null, 0);

        List <Animal> animals = new ArrayList<>();
        animals.add(sparrow);
        animals.add(eagle);
        animals.add(tiger);
        animals.add(cow);
        animals.add(dolphin);
        animals.add(shark);
        System.out.println(animals);

        for (Animal item : animals) {
            if (item instanceof Sparrow || item instanceof Eagle){
                System.out.print("I have wings! ");
                item.fly();
            }
            if (item instanceof Tiger || item instanceof Cow){
                System.out.print("I have legs! ");
                item.toGo();
            }
            if (item instanceof Shark || item instanceof Dolphin){
                System.out.print("I have fins! ");
                item.swim();
            }
        }
    }
}
