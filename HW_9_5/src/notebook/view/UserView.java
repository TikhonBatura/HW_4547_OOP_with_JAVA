package notebook.view;

import notebook.controller.UserController;
import notebook.model.User;
import notebook.util.Commands;
import notebook.view.Assistants.Functions;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserView extends Functions {
    public UserView(UserController userController) {
        super(userController);
    }

    public void run(){
        Commands com;

        while (true) {
            System.out.print("Доступные команды: ");
            System.out.println(Arrays.toString(Commands.values()));
            String command = prompt("Введите команду: ").toUpperCase();
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    create();
                    break;
                case FINDBYID:
                    case READ:
                        read();
                    break;
                case LIST:
                    list();
                    break;
                case UPDATE:
                    update();
                    break;
                case DELETE:
                    delete();
                    break;
            }
        }
    }

}
