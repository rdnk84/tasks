package task6;

public class NewUser extends User {

    @Override
    public void userInfo() {
        System.out.println("я новый пользователь, меня зовут " + this.getInfo());
    }
}
