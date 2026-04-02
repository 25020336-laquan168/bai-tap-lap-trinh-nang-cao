public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("16082007", "La Quan");
        acc.deposit(-100);
        System.out.println(acc.getBalance());
        acc.deposit(200);
        System.out.println(acc.getBalance());
        acc.withdraw(300);
        System.out.println(acc.getBalance());
        acc.withdraw(150);
        System.out.println(acc.getBalance());
    }
}
