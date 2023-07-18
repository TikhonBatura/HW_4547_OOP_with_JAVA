package homework.Users;

public abstract class AuthortizedUser {
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    protected int id; //идентификатор пользователя
    protected String name; // имя пользователя

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return CLASS_NAME + "{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
    public String getClassName() {
        return this.CLASS_NAME;
    }
}
