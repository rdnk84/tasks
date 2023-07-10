package task6;

public class BankClerk extends Human{

   private String bankName;

    public BankClerk(String lastName, String fullName, String bankName) {
        super(lastName, fullName);
        this.bankName = bankName;
    }


    @Override
    public void printInfo() {
        System.out.println("Это " + this.getClass().getSimpleName() + " " + "\nмое имя " + this.getFirstName()  + "\nфамилия " + this.getLastName() + "\nбанк " + bankName);
    }

    @Override
    public void purpose() {
        System.out.println("Иду в банк, потому что там работаю");
    }
}
