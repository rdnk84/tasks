package task4;

import java.util.Scanner;

public class SortArrays {

    public static void main(String[] args) {

        int[] numbers = {-2, -1, 28, 2, 333, 7, 19, 100, 1018, 3, 27, 30};
        int[] sortedNumbers = {5, 15, 38, 42, 53, 67, 119, 200, 1043, 1563, 1827, 3000};
        int[] someArray = {2, 7, 8, 4};
//        showOdd();
//        divideOn();
//        checkSum();
//        checkNumber();
//        checkNumberInArray(numbers);
//        containsANumber(numbers);
//        ifSortedAsc(sortedNumbers);
//        refillArray();
//        changeElements(someArray);
        int[] someArray2 = {2, 7, 8, 15, 7, 8};
        findUniqueElement(someArray2);
    }


    public static void showOdd() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void divideOn() {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i + ": делится на 3");
            }
        }
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println(i + ": делится на 5");
            }
        }
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": делится на 3 и на 5");
            }
        }

    }

    public static boolean checkSum() {
        boolean result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int n1 = scanner.nextInt();
        System.out.println("введите второе число");
        int n2 = scanner.nextInt();
        System.out.println("введите третье число");
        int n3 = scanner.nextInt();

        int sum = n1 + n2;
        if (sum == n3) {
            System.out.println("true");
            result = true;
        } else {
            result = false;
            System.out.println("false");
        }
        return result;
    }

    public static boolean checkNumber() {
        boolean result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите первое число");
        int n1 = scanner.nextInt();
        System.out.println("введите второе число");
        int n2 = scanner.nextInt();
        System.out.println("введите третье число");
        int n3 = scanner.nextInt();

        if (n2 > n1 && n3 > n2) {
            System.out.println("true");
            result = true;
        } else {
            result = false;
            System.out.println("false");
        }
        return result;
    }

    public static boolean checkNumberInArray(int[] numbers) {
        boolean result = false;
        int lastElement = numbers.length - 1;
        if (numbers[0] == 3 || lastElement == 3) {
            System.out.println("true");
            result = true;
        }
        return result;
    }

    public static boolean containsANumber(int[] numbers) {
        boolean result = false;
        for (int number : numbers) {
            if (number == 1 || number == 3) {
                System.out.println("true");
                result = true;
            }
        }
        return result;
    }

    public static boolean ifSortedAsc(int[] numbers) {
        boolean result = false;
        for (int i = 0, j = 1; i < numbers.length - 2 && j < numbers.length - 1; i++, j++) {
            if (numbers[i] > numbers[j]) {
                System.out.println("try again");
                return false;
            }
            result = true;
        }
        System.out.println("OK");
        return result;
    }

    public static void refillArray() {
        int length = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("задайте длину массива");
        length = scanner.nextInt();
        System.out.println("Array length: " + length);
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int enteredNumber = scanner.nextInt();
            array[i] = enteredNumber;
        }
        System.out.print("result: " + "[");
        for (int number : array) {
            System.out.print(number + ", ");
        }
        System.out.println("]");
    }

    public static int[] changeElements(int[] numbers) {
        int[] newArray = new int[numbers.length];

        newArray[0] = numbers[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        newArray[numbers.length - 1] = numbers[0];
        System.out.print("Array 1: " + "[");
        for (int number : numbers) {
            System.out.print(number + ", ");
        }
        System.out.println("]");
        System.out.print("Array 2: " + "[");
        for (int number : newArray) {
            System.out.print(number + ", ");
        }
        System.out.println("]");
        return newArray;
    }

    public static int findUniqueElement(int[] nums) {
        int uniqueNum = nums[0];
        int doubleNum = 0;

        for (int i = 0; i < nums.length; i++) {
            uniqueNum = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    uniqueNum = 0;
                }
            }
            if (uniqueNum != 0) {
                break;
            }
        }

        System.out.println(uniqueNum);
        return uniqueNum;
    }


}
