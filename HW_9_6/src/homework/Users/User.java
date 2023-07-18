package homework.Users;

import homework.impl.IUser;

public class User extends AuthortizedUser implements IUser {


    public User(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void save() {
        System.out.println("Save: " + CLASS_NAME + " " + name);

    }
    @Override
    public void report() {
        System.out.println("Report: " + CLASS_NAME + " " + name);
    }
}
