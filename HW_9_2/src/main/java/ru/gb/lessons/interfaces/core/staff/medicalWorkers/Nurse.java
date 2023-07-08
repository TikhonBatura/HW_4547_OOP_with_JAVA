package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.medicalWorkers;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.Staff;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.skills.Careable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.skills.Cleaningable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.skills.Injectable;

public class Nurse extends Staff implements Careable, Cleaningable, Injectable {

    public Nurse() {

    }

    public Nurse(int id, String name, String surname, int age, String specialization) {
        super(id, name, surname, age);

    }

    @Override
    public void care() {
        System.out.println("Don't worry, sweet, it's ok.");

    }

    @Override
    public void clean() {
        System.out.println("Oh my God! Who did this?");
    }

    @Override
    public void inject() {
        System.out.println("Let's make inject!");
    }
}