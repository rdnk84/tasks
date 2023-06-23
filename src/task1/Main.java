package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        //task 1.1
        System.out.println("я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");


//        //task 1.2
        double r1 = (46 + 10) * ((double) 10 / 3);
        short r2 = 29 * 4 * -15;
        System.out.println(r1);
        System.out.println(r2);

//        //task 1.3
        int number = 10500;
        int result = (number / 10) / 10;
        System.out.println(result);

//        //task 1.4
        double res = 3.6 * 4.1 * 5.9;
//        System.out.println(res);

//        //task 1.5
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);

        //task 1.6
        int b = scanner.nextInt();

        if (b % 2 == 0 && b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else if (b % 2 == 0) {
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }

    }
}