package HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.Swimable;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class AquaFish extends Pet implements Swimable {
    public AquaFish() {

    }
    public AquaFish (int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner){
        super (id, name, numberOfLimbs, registrationDate, owner);
    }

    @Override
    public int swims() {
        return 4;
    }
}
