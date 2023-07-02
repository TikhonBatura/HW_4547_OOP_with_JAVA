package HomeWork.HW_6;

import java.util.*;

//Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
//        Создать множество ноутбуков.
//        Написать метод, который будет запрашивать у пользователя критерий фильтрации и выведет ноутбуки, отвечающие фильтру.
//        NoteBook notebook1 = new NoteBook
//        NoteBook notebook2 = new NoteBook
//        NoteBook notebook3 = new NoteBook
//        NoteBook notebook4 = new NoteBook
//        NoteBook notebook5 = new NoteBook
//
//        Например: “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет
//
//        Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
//
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//
//        Класс сделать в отдельном файле
//
//        приветствие
//        Выбор параметра
//        выбор конкретнее
//        вывод подходящих
public class program {
    public static void main(String[] args) {

        HashSet<notebook> stock = new HashSet<>();
        notebook nb1 = new notebook("Lenovo", 4, 256, "Win10", "white");
        notebook nb2 = new notebook("HP", 16, 512, "Win11", "grey");
        notebook nb3 = new notebook("MacBook", 8, 256, "MACOS", "grey");
        notebook nb4 = new notebook("Dell", 16, 1024, "Linux", "black");
        notebook nb5 = new notebook("ASUS", 16, 512, " ", " ");

        stock.add(nb1);
        stock.add(nb2);
        stock.add(nb3);
        stock.add(nb4);
        stock.add(nb5);

        //System.out.println(stock);

        System.out.println("\nWelcome to notebook catalog!");
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        HashMap<String, Object> userCharacteristics = new HashMap<>();
        HashSet<notebook> result = new HashSet<>();
        while (!flag){

            System.out.println("Please choose characteristics: ");
            System.out.println("1. RAM;");
            System.out.println("2. HD;");
            System.out.println("3. OS;");
            System.out.println("4. color;");
            System.out.println("0. start searching...");
            String request = sc.next();

            switch (request) {
                case ("1") -> {
                    System.out.print("Please, enter minimal value of RAM (GB): ");
                    Integer userRAM = sc.nextInt();
                    userCharacteristics.put("RAM", userRAM);
                }
                case ("2") -> {
                    System.out.print("Please, enter minimal value of HD (GB): ");
                    Integer userHD = sc.nextInt();
                    userCharacteristics.put("HD", userHD);
                }
                case ("3") -> {
                    System.out.print("Please, choose prefer OS: 'MACOS', 'Win11', 'Win10', 'Linux': ");
                    String userOS = sc.next();
                    userCharacteristics.put("OS", userOS);
                }
                case ("4") -> {
                    System.out.print("Please, choose prefer color: 'white', 'grey', 'black' ");
                    String userColor = sc.next();
                    userCharacteristics.put("color", userColor);
                }
                case ("0") -> {
                    flag = true;
                    System.out.println();
                    System.out.println("by request: " + userCharacteristics);

                    for (Map.Entry<String, Object> el : userCharacteristics.entrySet()) {
                        if (el.getKey().equals("RAM")) {
                            Iterator<notebook> it = stock.iterator();
                            while (it.hasNext()) {
                                notebook nb = (notebook) it.next();
                                if (nb.getRAM() >= (Integer) el.getValue()) {
                                    result.add(nb);
                                }
                            }
                        }

                        if (el.getKey().equals("HD")) {
                            Iterator<notebook> it = stock.iterator();
                            while (it.hasNext()) {
                                notebook nb = (notebook) it.next();
                                if (nb.getHD() >= (Integer) el.getValue()) {
                                    result.add(nb);
                                }
                            }
                        }

                        if (el.getKey().equals("OS")) {
                            Iterator<notebook> it = stock.iterator();
                            while (it.hasNext()) {
                                notebook nb = (notebook) it.next();
                                if (nb.getOS().equals (el.getValue())); {
                                    result.add(nb);
                                }
                            }
                        }

                        if (el.getKey().equals("color")) {
                            Iterator<notebook> it = stock.iterator();
                            while (it.hasNext()) {
                                notebook nb = (notebook) it.next();
                                if (nb.getColor().equals(el.getValue())) {
                                    result.add(nb);
                                }
                            }
                        }
                    }

                    Iterator it = result.iterator();
                    while (it.hasNext()) {
                        notebook nb = (notebook) it.next();
                        System.out.println("\n founded -> " + nb.toString());
                        System.out.println();
                    }
                }
                default -> throw new IllegalStateException("Unexpected value: " + request);
            }

        }
    }
}
