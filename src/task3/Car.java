package task3;

public class Car {

    public String name;
    public String color;
    public Integer weight;

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Integer weight) {
        this.color = color;
        this.weight = weight;
    }

    public Car() {
    }

    public void showData(){
        System.out.println("Car name: " + this.name +  "  color:" + this.color +  "  weight:" + this.weight);
    }
}



