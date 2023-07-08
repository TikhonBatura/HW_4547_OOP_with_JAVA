package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Flyable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Eagle extends WildAnimal implements Soundable, Flyable {
    public Eagle(){
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " make a noise near 85 dB");
    }

    @Override
    public void fly() {
        System.out.println(CLASS_NAME + " fly with speed 48 km/h");

    }
}
