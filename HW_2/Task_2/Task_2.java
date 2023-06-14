package HomeWork.HW_2.Task_2;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;

public class Task_2 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task_2.class.getName());
        logger.setLevel(Level.INFO);
        FileHandler data = new FileHandler("C:\\Users\\loki_\\OneDrive\\Документы\\Учеба\\Разработчик\\8.ОПП (на JAVA)\\HomeWork\\HW_2\\Task_2\\log.txt");
        logger.addHandler(data);
        SimpleFormatter sFormat = new SimpleFormatter();
        data.setFormatter(sFormat);
        //XMLFormatter xml = new XMLFormatter();
        //data.setFormatter(xml);


        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println(Arrays.toString(arr));
        int i, j, temp;
        int step = 1;
        int n = arr.length;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
            logger.info("INFO: ");
            System.out.println("Step - " + step + " " + Arrays.toString(arr));
            step++;
        }
    }
}
