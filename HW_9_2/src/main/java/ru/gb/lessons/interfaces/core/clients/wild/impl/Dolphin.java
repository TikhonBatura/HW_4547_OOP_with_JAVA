package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Swimable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Dolphin extends WildAnimal implements Swimable, Soundable {
    public Dolphin(){
    }

    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " make a noise near 35 dB");
    }

    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swim with speed 60 km/h");
        return 60;
    }
}
