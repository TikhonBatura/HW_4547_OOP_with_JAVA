package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Fox extends WildAnimal implements Runnable {
    public Fox(){
    }
    @Override
    public int run() {
        System.out.println(CLASS_NAME + " run with speed 50 km/h");
        return 50;
    }
}
