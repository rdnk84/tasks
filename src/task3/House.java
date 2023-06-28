package task3;

public class House {

    public Integer floors;
    public Integer constructionYear;
    public String name;

    //но по сути - это альтернатива конструктору?
    public void setAllData(Integer floors, Integer constructionYear, String name) {
        this.floors = floors;
        this.constructionYear = constructionYear;
        this.name = name;
    }

    public void showAllData() {
        System.out.println("кол-во этажей в доме:" + this.floors + ", " + "год постройки: " + this.constructionYear + ", " + "название: " + this.name);
    }

    public Integer ageCount(Integer currentYear) {
        return (currentYear - this.constructionYear);
    }

}

class MainHouse{

    public static void main(String[] args) {

        Integer currentYear = 2023;
        House cityHouse = new House();
        cityHouse.setAllData(78, 2015, "new Complex");
        cityHouse.showAllData();
        System.out.println("Комплексу " + cityHouse.ageCount(currentYear) + " лет");

        House countryHouse = new House();
        countryHouse.setAllData(2, 1948, "Selpo");
        countryHouse.showAllData();
        System.out.println("Постройке " + countryHouse.ageCount(currentYear) + " лет");


    }
}