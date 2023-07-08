package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Flyable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Runnable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Swimable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Swimable {
    public Duck() {
    }

    public Duck (int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public void fly() {
        System.out.println(CLASS_NAME+" fly with speed 35 km/h");
    }
    @Override
    public int swim() {
        System.out.println(CLASS_NAME + " swim with speed 5 km/h");
        return 5;
    }
}
