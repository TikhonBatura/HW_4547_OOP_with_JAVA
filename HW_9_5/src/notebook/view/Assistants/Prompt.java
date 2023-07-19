package notebook.view.Assistants;

import java.util.Scanner;

public interface Prompt {
    default String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
