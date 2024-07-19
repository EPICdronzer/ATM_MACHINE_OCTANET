import java.util.Scanner;
class atm
{
    float balance;
    int pin=5689;
    public void check()
    {
        System.out.println("Enter your pin: ");
        Scanner obj=new Scanner(System.in);
        int p=obj.nextInt();
        
        if (p==pin) {
            menu();
        }
        else{
            System.out.println("--Enter a Valid Pin--");   
            check();
        }
    }
    void menu()
    {
        System.out.println("ENTER THE OPTION:\n1. Check Balance\n2. Withdraw Amount\n3. Deposit Money\n4. Exit");
        Scanner sc=new Scanner(System.in);
        int option=sc.nextInt();
        if(option==1){
            checkBalance();
        }
        else if(option==2)
        {
            withdraw();
        }
        else if(option==3){
            deposit();
        }
        else if(option==4)
        {
            return;
        }
        else
        {
            System.out.println("Entera valic option!");
        }
        
    }
    private void checkBalance()
    {
        System.out.println("Current Balance: "+balance);
        menu();
    }
    private void withdraw(){
        System.out.println("Enter amount: ");
        Scanner obj=new Scanner(System.in);
        float amt=obj.nextInt();
        if(amt>balance)
        {
            System.out.println("Insufficient Funds");
        }else if (amt<=balance) {
            balance-=amt;
            System.out.println("Money Withdrawn Successfully");
        }
        menu();
    }
    private void deposit(){
        System.out.println("Enter amount: ");
        Scanner obj=new Scanner(System.in);
        float amt=obj.nextInt();
        balance+=amt;
        System.out.println("Money Deposited Successfully");
        menu();
    }
    
}
class atmMACHINE
{
    public static void main(String args[])
    {
        atm object=new atm();
        object.check();
    }
}