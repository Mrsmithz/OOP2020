public class Main {
    public static void main(String[] args) {
        third();
    }
    public static void first(){
        Account a1 = new Account(50000, "61070033");
        a1.showAccount();
        a1.deposit(500);
        a1.showAccount();
        a1.withdraw(40000);
        a1.showAccount();
    }
    public static void second(){
        CheckingAccount a1 = new CheckingAccount(50000, "61070033", 5000);
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(40000.0);
        System.out.println(a1.toString());
    }
    public static void third(){
        CheckingAccount a1 = new CheckingAccount();
        a1.showAccount();
        a1.deposit(500);
        System.out.println(a1);
        a1.withdraw(40000.0);
        System.out.println(a1.toString());
    }
    // public static void fourth(){
    //     Account a1 = new CheckAccount();
    //     a1.setCredit(1000);
    //     System.out.println(a1);
    // }
    public static void fifth(){
        Account a1 = new CheckingAccount();
        System.out.println(a1);
        ((CheckingAccount)a1).setCredit(1000);
        System.out.println(a1);
    }
    public static void sixth(){
        CheckingAccount a1 = new CheckingAccount(1000, "62070033", 500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("harry", "potter");
        Customer c3 = new Customer("harry", "potter", a1);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
    public static void seventh(){
        CheckingAccount a1 = new CheckingAccount(1000, "62070033", 500);
        Customer c1 = new Customer();
        Customer c2 = new Customer("harry", "potter");
        Customer c3 = new Customer("harry", "potter", a1);
        System.out.println(c1.equals(c2));
        System.out.println(c3.equals(c2));
    }
}
