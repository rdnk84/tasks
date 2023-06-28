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
