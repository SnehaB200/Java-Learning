
package OOPs.Bank;


public class accountant {
    //access modifier is public
    public String name;

    //default access modifier
    String address;

    //protected access modifier
    protected String emailID;

    //private access modifier
    private String passWord;

    public void printInfo(){
        System.out.println(name);
        System.out.println(address);
        System.out.println(emailID);
        System.out.println(passWord);
    }
    //to use password outside the class we need to create a getter method and a setter method

    public String getPassWord() {
        return this.passWord;
    }
    public String setPassWord() {
        return this.passWord = "pass";
    }
    public static void main(String[] args) {
        accountant account1 =new accountant();
        account1.name = "Snehangi Behera";
        account1.address = "Surada";
        account1.emailID = "snehabehera200@gmail.com";
        account1.passWord = "Snehangi@123";
        account1.printInfo();
    }
}
