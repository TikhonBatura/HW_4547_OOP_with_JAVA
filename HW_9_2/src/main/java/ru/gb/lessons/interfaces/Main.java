package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces;

import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

import static sun.tools.jconsole.Messages.CLASS_NAME;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
//        WildCat homeCat =
//                new WildCat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat wildCat =
                new HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        //homeCat.hunt();
        //wildCat.hunt();

        Duck duck = new Duck(2,2,LocalDate.of(2023,7, 7), new Owner ("Jack"));

        System.out.printf("Duck swim with speed - %s km/h\n", (duck.swim()));
        duck.fly();

        Duck duck1 = new Duck();
        duck1.swim();
    }
}
