package task3;

public class Tree {

    public Integer age;
    public Boolean isAlive;
    public String name;

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }
}

class showTree {
    public static void main(String[] args) {
        Tree emptyTree = new Tree();
        Tree roseTree = new Tree(3, "Rose");
        Tree fullTree = new Tree(15, true, "Oak");
    }
}
