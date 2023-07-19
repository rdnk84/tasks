package task9;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//       ArrayList<Integer> bigArrList = new ArrayList<>(listCreator());
//        System.out.println(bigArrList);
//        LinkedList<Integer> bigLinkedList = new LinkedList<>(listCreator());
//        System.out.println(linkedList);

//        ArrayList<Integer> someArrayList = new ArrayList<>(Arrays.asList(65, 4, 47, 60, 11, 66, 84, 65, 44, 36, 32, 73, 11, 38, 51, 3, 6, 12, 36, 52, 79, 38, 92, 36, 0, 64, 18, 16, 80, 38, 4, 75, 58, 25, 21, 13, 55, 63, 6, 86, 58, 1, 20, 79, 63, 24, 43, 61, 30, 50, 45, 63, 96, 47, 99, 5, 88, 52, 73, 15, 66, 11, 2, 39, 56, 45, 38, 56, 35, 85, 71, 60, 68, 95, 43, 25, 20, 65, 64, 44, 3, 17, 83, 10, 16, 52, 55, 72, 55, 75, 98, 11, 71, 25, 7, 50, 62, 65, 6, 80, 12));
//        System.out.println(someArrayList.size());

        LinkedList someLinkedList = new LinkedList(Arrays.asList(65, 4, 47, 60, 11, 66, 84, 65, 44, 36, 32, 73, 11, 38, 51, 3, 6, 12, 36, 52, 79, 38, 92, 36, 0, 64, 18, 16, 80, 38, 4, 75, 58, 25, 21, 13, 55, 63, 6, 86, 58, 1, 20, 79, 63, 24, 43, 61, 30, 50, 45, 63, 96, 47, 99, 5, 88, 52, 73, 15, 66, 11, 2, 39, 56, 45, 38, 56, 35, 85, 71, 60, 68, 95, 43, 25, 20, 65, 64, 44, 3, 17, 83, 10, 16, 52, 55, 72, 55, 75, 98, 11, 71, 25, 7, 50, 62, 65, 6, 80, 12));
        System.out.println(someLinkedList.size());
        //        ArrayList<Integer> someArrayList1 = new ArrayList<>(Arrays.asList(111, 14, 85, 48, 115, 32, 55, 1067, 3));

        findElement(someLinkedList);
//        System.out.println(someArrayList);
//        setOfElements(someArrayList);

//        Map<User, Integer> users = new HashMap<>();
//        users.put(new User("Ivan"), 17);
//        users.put(new User("Valentin"), 16);
//        users.put(new User("Kirill"), 100);
//        users.put(new User("Svetlana"), 57);
//        users.put(new User("Konstantin"), 156);
//        users.put(new User("Peter"), 62);
//        for (Map.Entry<User, Integer> pair : users.entrySet()) {
//            System.out.println(pair.getKey().getName() + " " + pair.getValue());
//        }

//        showScore(users);

    }

    public static List<Integer> listCreator() {
        Random random = new Random();
        List<Integer> aList = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000001; i++) {
            int aNumber = random.nextInt(100);
            aList.add(aNumber);
//            System.out.println("element is " + aNumber);
//            linkedList.add(aNumber)
        }
       System.out.println(aList);
        return aList;
    }

    public static Set<Integer> setOfElements(List<Integer> originalList) {
        Set<Integer> withoutDuplicates = new HashSet<>(originalList);
        System.out.println(withoutDuplicates);
        return withoutDuplicates;
    }

//    public static void findElement(List<Integer> list) {
//
//        int quantityDoubles1 = 0;
//        int quantityDoubles2 = 0;
//        int quantityDoubles3 = 0;
//        int quantityDoubles4 = 0;
//        int quantityDoubles5 = 0;
//        double start = System.currentTimeMillis();
//        System.out.println("for ArrayList");
//
//            for (Integer el : list) {
//                if (el == 55) {
//                    quantityDoubles1++;
//                } if(el == 18) {
//                    quantityDoubles2++;
//                } if(el == 12) {
//                    quantityDoubles3++;
//                } if(el == 92) {
//                    quantityDoubles4++;
//                } if(el == 79){
//                    quantityDoubles5++;
//                }
//            }
//        double finish = System.currentTimeMillis();
//        double elapsed = finish - start;
//        System.out.println("Прошло времени, мс: " + elapsed);
//        System.out.println("Element " + 55 + "is found " + quantityDoubles1 + " times");
//        System.out.println("Element " + 18 + "is found " + quantityDoubles2 + " times");
//        System.out.println("Element " + 12 + "is found " + quantityDoubles3 + " times");
//        System.out.println("Element " + 92 + "is found " + quantityDoubles4 + " times");
//        System.out.println("Element " + 79 + "is found " + quantityDoubles5 + " times");
//    }

    public static void findElement(List<Integer> list) {
        Random random = new Random();
        int quantityDoubles = 0;
        long start = System.currentTimeMillis();
        System.out.println("for LinkedList");
        for (int i = 0; i < 100001; i++) {
            int randomNumber = random.nextInt(100);
            for (Integer el : list) {
                if (el == randomNumber) {
                    quantityDoubles++;
                } else {
                }
            }
        }
        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println("Прошло времени, мс: " + elapsed);

//        for(Integer randomNumber : arrList1) {
//            int quantityDoubles = 0;
//            for(Integer el : arrList2){
//                if (el == randomNumber) {
//                    quantityDoubles++;
//                } else {
//                }
//            }
//            System.out.println("element " + randomNumber + " is found " + quantityDoubles + " times");
//        }
        System.out.println("random element is " + quantityDoubles + " times");
    }

    public static void showScore(Map<User, Integer> users){
        Scanner scanner = new Scanner(System.in);
       String aName = scanner.next();
        User aUser = new User(aName);
                for (Map.Entry<User, Integer> pair : users.entrySet()) {
                    if(pair.getKey().equals(aUser)) {
                        System.out.println("scoure for " + pair.getKey().getName() + " is " + pair.getValue());
                    }

        }
    }
}
