import java.util.*;
class Details{
   private long AccountNumber;
    private int Balance;
    private int Password;

    public long getNumber(){
        return AccountNumber;
    }
    public void setNumber(long AccountNumber){
        this.AccountNumber=AccountNumber;
    }
    public int getbalance(){
        return Balance;
    }
    public void setbalance(int Balance){
        if(Balance>0){
        this.Balance=Balance;
        }else{
            System.out.println("Invalid balance");
        }
    }
    public int getPassword(){
        return Password;
    }
    public void setPassword(int Password){
        this.Password=Password;
    }
}
class Mybank{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Details d=new Details();
        System.out.println("Enter the account number");
        d.setNumber(s.nextLong());
        System.out.println("Enter your Account Balance");
        d.setbalance(s.nextInt());
        System.out.println("Enter your account password");
        d.setPassword(s.nextInt());
        System.out.println("Your Account Details ");
        System.out.println("Accont number is "+d.getNumber()+"\n the password is "+d.getPassword()+"\nYour Balance is "+d.getbalance());
        s.close();
    }
}
