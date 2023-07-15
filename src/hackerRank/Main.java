package hackerRank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> randomElements = fillArr();
//        System.out.println(Arrays.toString(new ArrayList[]{fillArr()}));


        ArrayList<Integer> oddElements = showOdd(randomElements);

    }

    public static ArrayList<Integer> fillArr() {
        ArrayList<Integer> newArray = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            Integer element = random.nextInt(100);
            newArray.add(element);
            builder.append(element).append(", ");
        }
        String array = builder.toString();
        System.out.println("старый массив: " + array);
        return newArray;
    }

//    public static ArrayList<Integer> showOdd(ArrayList<Integer> arr) {
////        ArrayList<Integer> newArr = new ArrayList<>();
//        StringBuilder builder = new StringBuilder();
//        int arrSize = arr.size();
//        for (int i = 0; i < arrSize; i++) {
//            if (arr.get(i) % 2 == 0) {
////                arr.set(i, 0);
//                arr.remove(i);
//                arrSize--;
//                i--;
//            } else {
////                newArr.add(arr.get(i));
//                builder.append(arr.get(i)).append(", ");
//            }
//        }
//        String array = builder.toString();
//        System.out.println("массив из только нечета: " + array);
//        return arr;
//    }

    public static ArrayList<Integer> showOdd(ArrayList<Integer> arr) {
        Iterator<Integer> findOdd = arr.iterator();
        while(findOdd.hasNext()) {
            Integer element = findOdd.next();
            if (element  % 2 == 0) {
                findOdd.remove();
            } else {
//                System.out.println(element + " - нечётный");
            }
        }
        for(Integer el : arr) {
            System.out.println(el);
        }
        return arr;
    }

    public static ArrayList<Integer> showOddWithException(ArrayList<Integer> arr) {

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
//                arr.set(i, 0);
                arr.remove(i);
                arr.size();
                i--;
            } else {
//                newArr.add(arr.get(i));
                builder.append(arr.get(i)).append(", ");
            }
        }
        String array = builder.toString();
        System.out.println("массив из только нечета: " + array);
        return arr;
    }
}
