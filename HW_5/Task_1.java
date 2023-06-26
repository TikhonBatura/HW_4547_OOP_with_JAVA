package HomeWork.HW_5;

// Реализуйте структуру телефонной книги с помощью HashMap.
// Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
// их необходимо считать, как одного человека с разными телефонами.
// Вывод должен быть отсортирован по убыванию числа телефонов.

// Пример меню:
// 1) Добавить контакт
// 2) Вывести всех
// 3) Выход

// Иванов 123432
// Иванов 546457
// Иванов 788354

// Map<String, ArrayList> ---- {Иванов:[23145, 456745, 56787], Петров:[4325, 45674]}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Task_1 {
    static void sortedPrint(Map<String, ArrayList> map) {

        Set<String> keySet = map.keySet();

        int maxCount = 0;
        int minCount = 1_000_000;

        for (var item : map.entrySet()) {
            if (maxCount < item.getValue().size())
                maxCount = item.getValue().size();
            if (minCount > item.getValue().size())
                minCount = item.getValue().size();

        }

        Stack<String> st = new Stack<>();
        int num = minCount;
        while (num <= maxCount) {
            // System.out.println(map);
            for (var item : map.entrySet()) {
                if (item.getValue().size() == num) {
                    st.push(item.getKey());
                }
            }
            num += 1;
        }

        String name;
        for (int i = 0; i < keySet.size(); i++) {
            name = st.pop();
            for (var item : map.entrySet()) {
                if (name == item.getKey()) {
                    System.out.printf("%8s: ", item.getKey());
                    System.out.println(item.getValue());
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Map<String, ArrayList> abon = new HashMap<>() {
            {
                put("McDonald", new ArrayList<Integer>() {
                    {
                        add(131598);
                        add(174583);
                        add(439532);
                    }
                });
                put("Potter", new ArrayList<Integer>() {
                    {
                        add(999333);
                    }
                });
                put("Baggins", new ArrayList<Integer>() {
                    {
                        add(123456);
                        add(789011);

                    }
                });
                put("Simpson", new ArrayList<Integer>() {
                    {
                        add(510629);
                        add(298347);
                        add(567483);
                        add(102938);
                    }
                });
            }
        };
        System.out.println();

        System.out.println("**** PHONE BOOK **** ");
        sortedPrint(abon);

        try (
                Scanner sc = new Scanner(System.in)) {
            Boolean getOut = false;
            String st;
            while (!getOut) {
                System.out.println("Please choose (1 - add contact, 0 - exit):");
                st = sc.nextLine();
                String name = "";
                String phString;
                switch (st) {
                    case "1": {
                        System.out.println("please, enter surname ");
                        name = sc.nextLine();
                        if (abon.containsKey(name)) {
                            System.out.println("Current contact is existing ");
                            System.out.println();
                            break;
                        } else {
                            System.out.println("Please enter number: ");
                            phString = sc.nextLine();
                            String[] arr = phString.split(" ");
                            ArrayList<Integer> arrInt = new ArrayList<>();
                            for (String item : arr) {
                                arrInt.add(Integer.parseInt(item.trim()));
                            }
                            abon.put(name, arrInt);
                            System.out.println();
                            sortedPrint(abon);
                            break;
                        }
                    }
                    case "0": {
                        getOut = true;
                        System.out.println();
                        System.out.println("I will miss you! Bye!");
                        System.out.println();
                        break;
                    }

                }
            }
        } catch (NumberFormatException e) {

            e.printStackTrace();
        }
    }
}
