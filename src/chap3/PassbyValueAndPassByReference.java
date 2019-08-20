
package chap3;

class Account{
private int accountID;
private String accountName;

    public Account(int accountID, String accountName) {
        this.accountID = accountID;
        this.accountName = accountName;
    }

    public int getAccountID() {
        return accountID;
    }

    public String getAccountName() {
        return accountName;
    }


    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }


}//endclass


public class PassbyValueAndPassByReference {
    
    public static void changeDoubleValue(double newRate){
        newRate=3.75;
    }
    
    public static void changeObjectAttribute(Account actObj){
        actObj.setAccountName("Anny");
    }
    
    
    public static void main(String[] args) {
        double interestRate = 4.99;
        System.out.println("--Pass By Value--");
        System.out.println("Before calling method : interestRate = "+interestRate);
        changeDoubleValue(interestRate);  //passbyvalue
        System.out.println(" After calling method : interestRate = "+interestRate);
        
        System.out.println("--Pass by Reference--");
        Account actObj = new Account(105227,"No name");
        System.out.println(" Before calling Method : ");
        System.out.println(" actObj = "+ actObj);
        System.out.println("ID = "+ actObj.getAccountID());
        System.out.println(" Name = "+ actObj.getAccountName());
        
        changeObjectAttribute(actObj);
        System.out.println(" After calling Method : "); //pass by reference
        System.out.println(" actObj = "+ actObj);
        System.out.println("ID = "+ actObj.getAccountID());
        System.out.println(" Name = "+ actObj.getAccountName());
    }
}//endclass
