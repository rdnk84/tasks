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

class ShowCar {
    public static void main(String[] args) {

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

    }
}
