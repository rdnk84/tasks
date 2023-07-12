package task7;

public class OuterClass {
    private int a;
    private int b;

    static String name = "Mike";

    void setParams(final int x, final  int y) {
        this.a = x;
        this.b = y;
    }

    class InnerClass {
        void sumAndPrint() {
            setParams(4, 6);
            System.out.println("sum = " + (a + b));
        }
    }

    public void innerMethodCall() {
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();  //те в этой записи мы обращаемся через внешний класс к внутреннему
//        InnerClass innerClass = new InnerClass();  //или вот так еще можно. будет одно и то же
        innerClass.sumAndPrint();
    }

    public static void main(String[] args) {

       OuterClass outerClass = new OuterClass();
        outerClass.innerMethodCall();

    }

    static class NestedStaticClass {
        void nestedStaticClassMethod() {
            System.out.println("Static nested");
            System.out.println(name);
//            System.out.println("sum = " + (a + b));   невозможно обратиться к нестатическим полям
        }
    }
}
