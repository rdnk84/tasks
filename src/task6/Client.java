package task6;

public class Client extends Human{

   private String bankName;

    public Client(String lastName, String firstName, String bankName) {
        super(lastName, firstName);
        this.bankName = bankName;
    }

    @Override
    public void printInfo() {
        System.out.println("Это " + this.getClass().getSimpleName() + " " + "\nмое имя " + this.getFirstName()  + "\nфамилия " + this.getLastName() + "\nбанк " + bankName);
    }

    @Override
    public void purpose() {
        System.out.println("Иду в банк, чтобы взять кредит");
    }
}
