package HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.supports.Record;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;
import java.util.List;

public class Snake extends WildAnimal {
    public Snake() {

    }
    public Snake (int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
    }
}
