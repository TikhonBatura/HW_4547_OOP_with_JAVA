package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animals;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

/**
 Абстракция домашнего животного
 */
public class Pet extends Animal implements Animals {
    public Pet() {
    }

    public Pet(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
}
