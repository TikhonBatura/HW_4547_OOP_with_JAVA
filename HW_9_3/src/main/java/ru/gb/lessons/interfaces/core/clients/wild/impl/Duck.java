package HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.Flyable;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Flyable, Runnable {
    public Duck() {
    }
    public Duck (int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public int flies() {
        System.out.println(CLASS_NAME+"летит со скоростью 5 км/ч");
        return 5;
    }
    @Override
    public int runs() {
        return 3;
    }
}
