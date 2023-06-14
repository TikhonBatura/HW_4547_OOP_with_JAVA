package HomeWork.HW_2;

import java.util.Arrays;

//1) Дана строка sql-запроса "select * from students WHERE ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.
// Пример данной строки {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Вывод: select * from students WHERE name=Ivanov AND country=Russia AND city=Moscow
public class Task_1 {
    public static void main (String[]args){
        String taskString = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        //System.out.println(taskString);
        //System.out.println("1th step");
        String[] reqeustVal = taskString.substring(1, taskString.length() - 1).split(", ");
        //System.out.println(Arrays.toString(keyWithVal));
        //String[] keyWithVal = text1.split(", ");
        System.out.println();
        System.out.println("RequestVal - " + Arrays.toString(reqeustVal));
        System.out.println("*************");

        StringBuilder result = new StringBuilder();
        boolean flag = true;

        for (String item: reqeustVal){
            String[] keyValue = item.split(":");
            //System.out.println(Arrays.toString(keyValue));

            String key = keyValue[0].replace("\"", "");
            String value = keyValue[1].replace("\"", "");

            //System.out.println("key - " + key);
            //System.out.println("value - " + value);
            //System.out.println("===");

            if (!value.equalsIgnoreCase("null")) {
                if(!flag) {
                    result.append(" AND ");
                }
                result.append(key).append("=").append(value);
                flag = false;
            }
        }

        System.out.println("SELECT * FROM students WHERE " + result.toString());
    }
}
