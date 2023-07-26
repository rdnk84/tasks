package patterns.factory;

public class Main {
    public static void main(String[] args) {
//        JavaDeveloper javaDeveloper = new JavaDeveloper();
//        javaDeveloper.writeCode();
//
//        CppDeveloper cppDeveloper = new CppDeveloper();
//        cppDeveloper.writeCode();

//        Developer developer = new JavaDev();
//       developer.writeCode();

//        DeveloperFactory developerFactory = new CppDevFactory();
//        Developer developer = developerFactory.developerCreator();
//        developer.writeCode();

        DeveloperFactory developerFactory = devFactoryBySpecialty("Java");
        Developer developer = developerFactory.developerCreator();
        developer.writeCode();
    }

    static DeveloperFactory devFactoryBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDevFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDevFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown");
        }
    }
}
