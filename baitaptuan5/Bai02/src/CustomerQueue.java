import java.util.LinkedList;

public class CustomerQueue {
    LinkedList<Customer> queue = new LinkedList<>();

    public void themkhach(Customer x){
        queue.add(x);
        System.out.println("Khách hàng " + x.getName() + " tới chơi!!");
    }

    public Customer xulykhach (){
        if (queue.isEmpty()){
            return null;
        } else {
            Customer cur = queue.poll();
            System.out.println("Đang xử lý khách hàng " + cur.getName() + " !!");
            return cur;
        }
    }
}
