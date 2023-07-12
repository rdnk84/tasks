package task7;

public class Main {

    public static void main(String[] args) {
        SomeInterface someObject = new SomeInterface() {
            @Override
            public void print() {
                System.out.println("show all info");
            }

            @Override
            public void showSpecificInfo() {
                System.out.println("show details");
            }
        };
        someObject.print();
    }
}
