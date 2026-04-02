public class Main {
    public static void main(String[] args) {

        CustomerQueue customerQueue = new CustomerQueue();
        MessageHistory messageHistory = new MessageHistory();

        Customer A = new Customer("01", "Tam");
        Customer B = new Customer("02", "Son");

        customerQueue.themkhach(A);
        customerQueue.themkhach(B);
        System.out.println();

        if (customerQueue.xulykhach() != null){
            MessageHistory messA = new MessageHistory();

            messA.reply(new Message("1", "Em chào anh chị!"));
            messA.reply(new Message("2", "Anh chi muốn mua vé phim nào ạ?"));
            messA.reply(new Message("3", "dog"));

            messA.viewlast();
            messA.undo();
            messA.viewlast();

            Ticket veA = new Ticket("01", "phim Mua Do", "20:00");
        } else {
            System.out.println("Không còn khách hàng nào nữa!");
        }

        System.out.println();

        if (customerQueue.xulykhach() != null){
            MessageHistory messB = new MessageHistory();
            messB.reply(new Message("1", "Em chào anh chị!"));
            messB.reply(new Message("2", "Anh chi muốn mua vé phim nào ạ?"));
            messB.reply(new Message("3", "Hiện tại phim Thỏ ơi đang rất hot, anh chị có thể cân nhắc ạ!"));

            System.out.println();
            messB.showall();
        } else {
            System.out.println("Không còn khách hàng nào nữa!");
        }
    }
}
