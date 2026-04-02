public class Transaction {
    private final String transactionid;
    private final String amount;
    private final String timestamp;
    public Transaction(String _transactionid, String _amount, String _timestamp){
        transactionid = _transactionid;
        amount = _amount;
        timestamp = _timestamp;
    }

    public Transaction(Transaction khac){
        this.transactionid = khac.transactionid;
        this.amount = khac.amount;
        this.timestamp = khac.timestamp;
    }

    public void show(){
        System.out.println("Giao dich " + transactionid + " vao ngay " + timestamp + " tri gia " + amount);
    }

}
