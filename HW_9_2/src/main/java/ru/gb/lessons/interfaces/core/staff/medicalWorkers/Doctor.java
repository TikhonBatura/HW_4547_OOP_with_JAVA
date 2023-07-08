package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.medicalWorkers;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.Staff;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.skills.Injectable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.skills.Prescribable;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff.skills.Treatable;

public class Doctor extends Staff implements Treatable, Prescribable, Injectable {
    public Doctor (){

    }
    public Doctor (int id, String name, String surname, int age, String specialization){
        super (id, name, surname, age);
    }

    @Override
    public void treat(){
        System.out.println("Please, be patient");
    }
    @Override
    public void prescribe(){
        System.out.println("Take this medicine and you feel better");
    }

    @Override
    public void inject() {
        System.out.println("Nurse, please make inject");
    }
}
