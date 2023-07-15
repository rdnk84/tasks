package task4;

import java.util.Arrays;
import java.util.Scanner;

public class SortArrays {

    public static void main(String[] args) {

        int[] numbers = {-2, -1, 28, 2, 333, 7, 19, 100, 1018, 3, 27, 30};
        int[] sortedNumbers = {5, 15, 38, 42, 53, 67, 119, 200, 1043, 1563, 1827, 3000};
        int[] someArray = {2, 7, 18,  8, 4};
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
//        findUniqueElement(someArray2);

        int[] someArray3 = {8, 7, 9, 5};
//        sortBubble(someArray3);

        int[] longArray = {44, 231, 23, 34, 54, 55, 435, 76, 87, 2, 3};
      int[] result = mergeSort(someArray);
        System.out.println("sorted array: " + Arrays.toString(result));
    }


    public static void sortBubble(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int aj = array[j];
                    int ai = array[i];

                    array[j] = ai;
                    array[i] = aj;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] mergeSort(int[] unsorted) {
        System.out.println("original unsorted array: " + Arrays.toString(unsorted));

        //условие выхода из рекурсии. Когда длина массива меньше двух - нет смысла дальше его делить пополам
        if (unsorted.length < 2) {
            return unsorted;
        }

        int mid = unsorted.length / 2;
        int[] left = new int[mid];
        int[] right;

        //здесь мы смотрим, если в массиве было нечетное кол-во эл-тов, то тогда вторая половина должна быть больше на один
        if (unsorted.length % 2 == 0) {
            right = new int[mid];
        } else {
            right = new int[mid + 1];
        }

        //далее - заполняем левый и правый массивы
        for (int i = 0; i < left.length; i++) {
            left[i] = unsorted[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = unsorted[mid + i];
        }
        //а здесь будем рекурсивно вызывать сами себя mergeSort();
        left = mergeSort(left);
        System.out.println("left: " + Arrays.toString(left));
        right = mergeSort(right);
        System.out.println("right: " + Arrays.toString(right));

//        int[] result = mergeParts(left, right);

        return mergeParts(left, right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer < left.length || rightPointer < right.length) {//т.е в каком-то из массивов мы уже можемвыйти за пределы. но пока в другом массиве еще нет -продолжаем цикл
            if (leftPointer < left.length && rightPointer < right.length) {//а здесь условие-что в обоих массивах мы еще не вышли за пределы
                if (left[leftPointer] < right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else if (rightPointer < right.length) {
                result[resultPointer++] = right[rightPointer++];
            }
        }
        return result;
    }


    public static void showOdd() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void divideOn() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + ": делится на 3 и на 5");
            }
            if (i % 15 == 0) {
                System.out.println(i + ": делится на 15");
            } else if (i % 5 == 0) {
                System.out.println(i + ": делится на 5");
            } else if (i % 3 == 0) {
                System.out.println(i + ": делится на 3");
            }
        }
//        for (int i = 1; i < 101; i++) {
//            if (i % 5 == 0) {
//                System.out.println(i + ": делится на 5");
//            }
//        }
//        for (int i = 1; i < 101; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println(i + ": делится на 3 и на 5");
//            }
//        }

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

        System.out.print("Array 1: " + Arrays.toString(numbers));
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        numbers[0] = lastElement;
        numbers[numbers.length - 1] = firstElement;
        System.out.print("Array 2: " + Arrays.toString(numbers));
        return numbers;
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
