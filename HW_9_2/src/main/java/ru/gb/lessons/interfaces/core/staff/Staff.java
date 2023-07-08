package HomeWork.HW_9_2.src.main.java.ru.gb.lessons.interfaces.core.staff;

public abstract class Staff {

    protected int id;

    protected String name;
    protected String surname;
    protected int age;

    public Staff(){

    }

    public Staff(int id, String name, String surname, int age) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

}
