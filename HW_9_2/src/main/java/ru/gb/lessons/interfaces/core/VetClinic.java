package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import HomeWork.HW_9_1.*;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.*;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.*;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.Dolphin;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.Eagle;

public class VetClinic {
    private static final List<Animals> animals = new ArrayList<>();
    public static void main(String[] args) {

//        Human human = new Human("John");
//        Cat cat = new Cat(0, null, 0, null, null);
//        // animals.add(human);
//        animals.add(cat);
//        for (Animals element: animals) {
//            heal(element);
//        }
//    }
//    private static void heal(Animals patients) {
//        System.out.println(patients.getClassName() + "вылечен");

        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();
        Eagle eagle = new Eagle();
        Fox fox = new Fox();
        WildCat wildCat = new WildCat();

        animals.add(dolphin);
        animals.add(duck);
        animals.add(eagle);
        animals.add(fox);
        animals.add(wildCat);

        for (Animals item : animals) {
            if (item instanceof Flyable){
                ((Flyable) item).fly();
            }
            if (item instanceof Runnable){
                ((Runnable) item).run();
            }
            if (item instanceof Soundable){
                ((Soundable) item).sound();
            }
            if (item instanceof Swimable) {
                ((Swimable) item).swim();
            }
        }


    }
}

