package task9;

import javax.jws.soap.SOAPBinding;
import java.util.*;

public class Main {

    public static void main(String[] args) {

//       ArrayList<Integer> bigArrList = new ArrayList<>(listCreator());
//        System.out.println(arrList);
        LinkedList<Integer> bigLinkedList = new LinkedList<>(listCreator());
//        System.out.println(linkedList);

//        ArrayList<Integer> someArrayList = new ArrayList<>(Arrays.asList(111, 14, 85, 48, 14, 115, 111, 32, 85, 115, 14, 55, 1067, 3));
//        ArrayList<Integer> someArrayList1 = new ArrayList<>(Arrays.asList(111, 14, 85, 48, 115, 32, 55, 1067, 3));
//        findElement(bigLinkedList);
//        System.out.println(someArrayList);
//        setOfElements(someArrayList);

        Map<User, Integer> users = new HashMap<>();
        users.put(new User("Ivan"), 17);
        users.put(new User("Valentin"), 16);
        users.put(new User("Kirill"), 100);
        users.put(new User("Svetlana"), 57);
        users.put(new User("Konstantin"), 156);
        users.put(new User("Peter"), 62);
//        for (Map.Entry<User, Integer> pair : users.entrySet()) {
//            System.out.println(pair.getKey().getName() + " " + pair.getValue());
//        }

        showScore(users);

    }

    public static List<Integer> listCreator() {
        Random random = new Random();
        ArrayList<Integer> arrList = new ArrayList<>();
//        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 1000001; i++) {
            int aNumber = random.nextInt(100);
            arrList.add(aNumber);
//            System.out.println("element is " + aNumber);
//            linkedList.add(aNumber)
        }
//        System.out.println(arrList);
        return arrList;
    }

    public static Set<Integer> setOfElements(List<Integer> originalList) {
        Set<Integer> withoutDuplicates = new HashSet<>(originalList);
        System.out.println(withoutDuplicates);
        return withoutDuplicates;
    }

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
