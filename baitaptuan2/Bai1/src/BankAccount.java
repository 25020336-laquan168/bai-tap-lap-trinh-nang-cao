public class BankAccount {
    final String accountNumber;
    private double balance;
    String name;
    //constructor 2 tham so.
    public BankAccount(String _number, String _name){
        accountNumber = _number;
        name = _name;
        balance = 0;
    }
    //constructor 3 tham so
    public BankAccount(String _number, String _name, double _balance){
        accountNumber = _number;
        name = _name;
        if (_balance < 0){
            balance = 0;
            System.out.println("so du nhap vao khong hop le");
        } else {
            balance = _balance;
        }
    }
    //nap tien
    public void deposit(double amount){
        if (amount <= 0){
            System.out.println("so tien nhap vao khong hop le");
        } else {
            balance += amount;
        }
    }
    //rut tien
    public void withdraw(double amount){
        if (amount < 0){
            System.out.println("false");
        } else {
            if (balance < amount){
                System.out.println("false");
            } else {
                System.out.println("true");
                balance -= amount;
            }
        }
    }
    //show so du
    public double getBalance(){
        return balance;
    }

}
