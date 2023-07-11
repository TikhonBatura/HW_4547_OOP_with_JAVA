package HomeWork.HW_9_3.src.main.java.ru.gb.lessons.interfaces.core.drugStore;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy(1);
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);

        pharmacy1.addComponent(comp1).addComponent(comp2);

//        Интерфейс Serializable - отвечает за сериализацию объектов. Превращает объект в массив байтов, который потом
//        можно собрать обратно при помощи десериализатора.

//        List<Marker> markers = new ArrayList<>();
//        Doctor doc1 = new Doctor(234, "Петрович", THERAPIST, "8(495)429-43-23");
//        markers.add().add();

//        while (((Iterator<Component>) pharmacy1).hasNext()){
//            System.out.println(pharmacy1.next());
//        }
        System.out.println(pharmacy1);

//        DogPharmacy dogPharmacy = new DogPharmacy();
//        System.out.println(dogPharmacy.hashCode());
        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy(2);
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy(3);
        Component comp5 = new Component("Penicillin", "10 mg", 3);
        Component comp6 = new Component("Spirit", "100 g", 13);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        Pharmacy pharmacy4 = new Pharmacy(1);
        pharmacy4.addComponent(comp5).addComponent(comp6).addComponent(comp2);

        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);

        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println();
        System.out.println(nomenclature);

        System.out.println("----TASK_1----");
        System.out.println();
        HashSet<Pharmacy> result = new HashSet<>();
        System.out.println("Step 1: result.size()=" + result.size() + ": ");
        //resOut(result);
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        System.out.println();
        System.out.println("Step 2: add pharmacy1, pharmacy2, pharmacy3. result.size()=" + result.size() + ": ");
        printResult(result);
        System.out.println();
        System.out.println("Step 3: Try to add pharmacy1 one more time. result.size()=" + result.size() + ": ");
        result.add(pharmacy1);
        printResult(result);
        System.out.println();
        System.out.println("Step 4: add pharmacy4 with not unique id=1");
        result.add(pharmacy4);
        System.out.println();
        System.out.println("Result: when added pharmacy4 with not unique id=1. result.size()=" + result.size() + ": ");

        printResult(result);

        System.out.println(" ");
        System.out.println("----TASK_2----");
        System.out.println(" ");
        Pharmacy pharmacy7 = new Pharmacy(7);
        Component comp7 = new Component("Aspirin", "100 g", 1007);
        pharmacy7.addComponent(comp5).addComponent(comp7);

        List<Pharmacy> nomenclature2 = new ArrayList<>();
        nomenclature2.add(pharmacy7);
        nomenclature2.add(pharmacy1);
        nomenclature2.add(pharmacy2);
        System.out.println("Before sort: ");
        System.out.println(nomenclature2);
        Collections.sort(nomenclature2);
        System.out.println(" ");
        System.out.println("After sort: " );
        System.out.println(nomenclature2);


    }
    public static void printResult(HashSet<Pharmacy> result) {
        for(var item: result) {
            System.out.println("id = " + item.getid() + ": " + item.getComponents());
        }
    }
}
