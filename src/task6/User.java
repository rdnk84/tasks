package task6;

import java.util.Scanner;

public class User {
    private final Scanner scanner = new Scanner(System.in);
   private String info;

//   private String name;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public User() {
        this.info = info;
        setInfo(scanner.next());
    }

    public  void userInfo() {
        System.out.println("я - пользователь, мне " + info + " лет");
    }
}
