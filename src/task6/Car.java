package task6;

public class Car {

    public int weight;
    public String model;
    public char color;
    public float speed;

    public void output() {
        System.out.println("Вес " + model + " составляет " + weight + "" + " кг");
        System.out.println("Цвет машины " + color + " и ее скорость - " + speed);
    }

    public Car(int weight, String model, char color, float speed) {
        this.weight = weight;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public Car() {
    }
}
