package notebook.view.Assistants;

import notebook.controller.UserController;
import notebook.model.User;

import java.util.List;

public class Functions implements Prompt {

    private final UserController userController;

    public Functions(UserController userController) {
        this.userController = userController;
    }

    public void create (){
        String firstName = prompt("���: ");
        String lastName = prompt("�������: ");
        String phone = prompt("����� ��������: ");
        userController.saveUser(new User(firstName, lastName, phone));
    }

    public void read (){
        String id = prompt("������������� ������������: ");
        try {
            User user = userController.readUser(Long.parseLong(id));
            System.out.println(user);
            System.out.println();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void list() {
        try {
            List<User> users = userController.readAllUsers();
            System.out.println(users);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void update(){
        try {
            String firstName = prompt("���: ");
            String lastName = prompt("�������: ");
            String phone = prompt("����� ��������: ");
            Long userID = Long.parseLong(prompt("������� ������������� ������������: "));
            User updated = new User(firstName, lastName, phone);
            userController.updateUser(userID, updated);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void delete(){
        try {
            Long userID = Long.parseLong(prompt("������� ������������� ������������: "));
            userController.deleteUser(userID);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
