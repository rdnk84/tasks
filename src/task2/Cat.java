package task2;

public class Cat {

    private String name;
    private Double age;
    private Boolean hasPassport;
    private Breed breed;
    private String saySmth;

    public Cat(){

    }

    public Cat(String name, Double age, Boolean hasPassport, Breed breed, String saySmth) {
        this.name = name;
        this.age = age;
        this.hasPassport = hasPassport;
        this.breed = breed;
        this.saySmth = saySmth;
    }

    public Cat(String name, Double age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hasPassport=" + hasPassport +
                ", breed=" + breed +
                ", saySmth='" + saySmth + '\'' +
                '}';
    }
}
