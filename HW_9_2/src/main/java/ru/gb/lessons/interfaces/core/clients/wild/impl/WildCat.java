package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

/**
 Одна из реализаций дикого животного
 */
public class WildCat extends WildAnimal implements Runnable, Soundable {
    public WildCat() {
    }

    public WildCat(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " run with speed 15 km/h");
        return 15;
    }
    @Override
    public void sound(){
        System.out.println(CLASS_NAME + " make a noise near 35 dB");
    }
}
