package task6;

public class NewUser extends User{

    @Override
    public void nameInfo(String newUsername) {

        System.out.println("а я Новый пользователь, и меня зовут " + newUsername);
    }
}
