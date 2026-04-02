public class Account {
    String accountid;
    double balance;
    Transaction[] history = new Transaction[100005];
    int count = 0;
    public Account(String _accountid, double _balance){
        accountid = _accountid;
        balance = _balance;
    }

    public void addTransaction(Transaction a){
        if (count < history.length){
            history[count] = new Transaction(a);
            count ++;
        }
    }

    public Transaction[] getHistory(){
        Transaction[] clone = new Transaction[count];
        for (int i = 0; i < count; i++){
            clone[i] = new Transaction(history[i]);   //deep copy
        }
        return clone;
    }

    public void showgiaodich(){
        for (int i = 0; i < count; i++){
            if (history[i] == null) {
                System.out.println("giao dich da bi xoa");
            } else {
                history[i].show();
            }
        }
    }

}
