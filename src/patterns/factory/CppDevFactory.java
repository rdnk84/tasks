package patterns.factory;

public class CppDevFactory implements DeveloperFactory{

    @Override
    public Developer developerCreator() {
        return new CppDev();
    }
}
