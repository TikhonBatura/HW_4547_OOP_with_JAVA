package HomeWork.HW_2.Task_3;

import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.stream.Collectors;

public class add_Task_3 {
    public static void main(String[] args) {

        File fl = new File("C:\\Users\\loki_\\OneDrive\\Документы\\Учеба\\Разработчик\\8.ОПП (на JAVA)\\HomeWork\\HW_2\\Task_3\\task_text.txt");

        try {
                FileReader file = new FileReader(fl);
                char[] arr = new char[(int) fl.length()];
                file.read(arr);
                StringBuilder taskArr = new StringBuilder();
                for (char c : arr) {
                    taskArr.append(c);
                }
                System.out.println("1th enter - taskArr - " + taskArr);

                String[] reqeustVal = taskArr.substring(0, taskArr.length() - 1).split(", ");

//                reqeustVal = Arrays.stream(reqeustVal)
//                            .filter(s -> (s != null && s.length() > 0))
//                            .toArray(String[]::new);

                //System.out.println(Arrays.toString(keyWithVal));
                //String[] keyWithVal = text1.split(", ");
                System.out.println();
                System.out.println("2th enter - RequestVal - " + Arrays.toString(reqeustVal));
                System.out.println("*************");

//                for (String item: reqeustVal) {
//                    String[] keyValue = item.split(":");
//                    System.out.println(Arrays.toString(keyValue));
//
//                    String key = keyValue[0].replace("\"", "");
//                    String value = keyValue[1].replace("\"", "");
//
//                    System.out.println("key - " + key);
//                    System.out.println("value - " + value);
//                    System.out.println("===");
//                }
            }
        catch(Exception e)
            {
                System.out.println("Что то пошло не так");
            }
        }
    }
