public class customer {

    private String name;
    private int credit_limit;
    private String email;

    public String getName() {
        return name;
    }

    public int getCredit_limit() {
        return credit_limit;
    }

    public String getEmail() {
        return email;
    }

    public customer(String name,int credit,String email){
        this.name = name;
        this.credit_limit = credit;
        this.email = email;
    }

    public customer(){
        this("Test",5000,"test@test.gr");
    }

    public customer(String name,String email){
        this(name,0,email);
    }

}
