package HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.Soundable;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.Swimable;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable, Swimable, Soundable {

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    public Cat() {
    }

    @Override
    public int runs() {
        return 10;
    }

    @Override
    public int swims() {
        return 2;
    }

    @Override
    public void sounds() {
        System.out.println("- Мяу! Мяу!");
    }
}
