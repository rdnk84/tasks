package task3;

public class Main {

    public static void main(String[] args) {

        //task 3.1
        Study study = new Study("Изучение Java - это просто!");
        System.out.println(study.printCourse());

        //task 3.2
        Car carMercedes = new Car();
        carMercedes.color = "red";
        carMercedes.name = "Mercedes";
        carMercedes.weight = 1000;

        Car carLada = new Car();
        carLada.color = "white";
        carLada.name = "Lada";
        carLada.weight = 500;

        carMercedes.showData();
        carLada.showData();

        //task 3.3
        Integer currentYear = 2023;
        House cityHouse = new House();
        cityHouse.setAllData(78, 2015, "new Complex");
        cityHouse.showAllData();
        System.out.println("Комплексу " + cityHouse.ageCount(currentYear) + " лет");

        House countryHouse = new House();
        countryHouse.setAllData(2, 1948, "Selpo");
        countryHouse.showAllData();
        System.out.println("Постройке " + countryHouse.ageCount(currentYear) + " лет");

        //task 3.4
        Tree emptyTree = new Tree();
        Tree roseTree = new Tree(3, "Rose");
        Tree fullTree = new Tree(15, true, "Oak");
    }
}
