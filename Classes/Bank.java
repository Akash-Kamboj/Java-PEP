// create a class name bank account instanc var acc no. , owner , bal, methods diposit, widral , display acc details , blanace, using while loop
import java.util.*;
class bank_details
{
    int acc_no;
    String owner;
    double bal;

    bank_details(int acc_no,String owner,double bal)
    {
        this.acc_no=acc_no;
        this.owner=owner;
        this.bal=bal;
    }
    void deposit(double amt)
    {
        bal=bal+amt;
        System.out.println("your new balance is "+bal);
    }
    void withdraw(double amt)
    {
        bal=bal-amt;
        System.out.println("your new balance is "+bal);
    }
    void display()
    {
        System.out.println("acc no is "+acc_no);
        System.out.println("owner is "+owner);
        System.out.println("balance is "+bal);
    }
    void check_bal()
    {
        System.out.println("your balance is "+bal);
    }

}
public class Bank
{
    public static void main(String args[])
    {
        bank_details b1=new bank_details(123456789,"akash",10000);
    
        Scanner sc=new Scanner(System.in);
        int op;
        System.out.println("Enter the Option");
        op = sc.nextInt();

        while(op!=0)
        {
            switch(op)
            {
                case 1:
                    System.out.println("Enter the amount to deposit");
                    double amt=sc.nextDouble();
                    b1.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount to withdraw");
                    amt=sc.nextDouble();
                    b1.withdraw(amt);
                    break;
                case 3:
                    b1.display();
                    break;
                case 4:
                    b1.check_bal();
                    break;
                case 5:
                System.exit(0);
                default:
                System.out.println("Invalid Option");
            }
            System.out.println("Enter the Option");
            op = sc.nextInt();
        }
        // bank_details b1=new bank_details(123456789,"akash",10000);
        // b1.deposit(1000);
        // b1.withdraw(500);
        // b1.display();
        // b1.check_bal();
    }
}