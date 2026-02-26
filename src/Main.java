//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        bankAccount myAccount = new bankAccount();
        myAccount.setAccountName("Alex");
        myAccount.setAccountBalance(10000);
        myAccount.widthdraw(10);
        myAccount.displayInfo();

        }
    }
