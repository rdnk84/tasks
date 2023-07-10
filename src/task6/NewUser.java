package task6;

public class NewUser extends User {

    public String name;

    @Override
    public void userInfo() {
        System.out.println("я новый пользователь, меня зовут " + name);
    }
}
