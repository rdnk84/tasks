package patterns.factory;

public class JavaDevFactory implements DeveloperFactory{


    @Override
    public Developer developerCreator() {
        return new JavaDev();
    }
}
