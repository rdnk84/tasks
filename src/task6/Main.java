package task6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Human aClient = new Client("Deer", "John", "VTB");
//        aClient.printInfo();
//        aClient.purpose();
//
//        BankClerk clerk = new BankClerk("Ivanov", "Alex", "Sber");
//        clerk.printInfo();
//        clerk.purpose();

//        Child child = new Child();
//        child.printParentField();


        User user = new User();
        NewUser newUser = new NewUser();

        Scanner scanner = new Scanner(System.in);
        user.age = scanner.nextInt();
        newUser.name = scanner.next();
        user.userInfo();
        newUser.userInfo();


    }
}
