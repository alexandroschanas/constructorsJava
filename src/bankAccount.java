public class bankAccount {


    private String accountName = "ACCOUNTNAME01";
    private String customerName = "Unknown";
    private String email = "invalid@gmail.com";
    private String phoneNum = "6977445566";
    private int accountBalance = 0;

    public String getAccountName() {
        return accountName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void widthdraw(int widthdrawValue){

        if(widthdrawValue > accountBalance){

            System.out.println("Withdraw not available");

        }else{

            accountBalance -= widthdrawValue;
            System.out.println("Sucessfully withdrawn " + widthdrawValue + " current account balance => " + accountBalance);

        }

    }

    public void deposit(int depositValue){

        accountBalance += depositValue;

    }

    public void displayInfo(){

        System.out.println("Account name => " + accountName);
        System.out.println("Phone => " + phoneNum);
        System.out.println("Account Balance => " + accountBalance);
        System.out.println("Account email => " + email);

    }


}
