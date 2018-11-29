package week2;

public class BankAccountDemo {

    public static void main (String[] args) {

        BankAccount bruces= new BankAccount("535353223","Bruce Abraham",false);
        System.out.println("bruces = " + bruces  );
        System.out.println("Depositing 3000\n"+bruces.deposit(3000.0));   //testing deposit method
        System.out.println("Depositing -300\n"+bruces.deposit(-300.0));   //up, with negative amount
        System.out.println("New Balance is:  "+bruces.getBalance());
        System.out.println("Withdrawing 700\n"+bruces.withdraw(700.0));      //testing withdraw method
        System.out.println("Withdrawing -500\n"+bruces.withdraw(-500.0));      //up, with negative amount
        System.out.println("Withdrawing 7000\n"+bruces.withdraw(7000.0));     //up, without overdraft permission
        System.out.println("New Balance is:  "+bruces.getBalance());
        System.out.println("Adding 5% Interests\n"+bruces.addInterest(5));    // testing addInterest method
        System.out.println("Adding -5% Interests\n"+bruces.addInterest(-5));  //up, with negative amount
        System.out.println("bruces = " + bruces+"\nSetting Overdraft");
        bruces.setHasOverdraft(true);
        System.out.println("Withdrawing 7000\n"+bruces.withdraw(7000.0));     /* testing withdraw method
                                                                                         with overdraft permission */
        System.out.println("Adding 10% Interests\n"+bruces.addInterest(10));    /*testing addInterest with
                                                                                                 negative balance*/
        System.out.println("Final Balance is:  "+bruces.getBalance());

    }
}



