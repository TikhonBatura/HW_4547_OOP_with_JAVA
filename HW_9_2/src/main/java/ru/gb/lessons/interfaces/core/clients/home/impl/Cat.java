package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Одна из реализаций домашнего животного
 */
public class Cat extends Pet {
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
