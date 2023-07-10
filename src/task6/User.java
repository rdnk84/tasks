package task6;

import java.util.Scanner;

public class User {
    private final Scanner scanner = new Scanner(System.in);


    public Scanner getScanner() {
        return scanner;
    }



    public  void userInfo() {

        System.out.println("я - пользователь, мне " + scanner.next() + " лет");
    }
}
