public class Main {
    public static void main(String[] args) {
        Account acc = new Account("16082007", 100);
        acc.addTransaction(new Transaction("T01", "150", "8/3/2026"));
        acc.addTransaction(new Transaction("T02", "250", "9/3/2026"));
        acc.addTransaction(new Transaction("T03", "350", "10/3/2026"));
        System.out.println("mang ben trong tai khoan goc ban dau:");
        acc.showgiaodich();
        Transaction[] hacker = acc.getHistory();
        hacker[0] = new Transaction("T01", "9999999", "8/3/2026");
        hacker[1] = null;
        System.out.println("mang cua hacker sau khi hacker sua:");
        for (Transaction x : hacker){
            if (x == null) {
                System.out.println("giao dich da bi xoa");
            } else {
                x.show();
            }
        }
        System.out.println("mang ben trong acc goc sau khi hacker sua:");
        acc.showgiaodich();
    }
}
