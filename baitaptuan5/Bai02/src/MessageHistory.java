import java.util.Stack;

public class MessageHistory {
    Stack<Message> stack = new Stack<Message>();
    public void reply(Message x){
        stack.push(x);
        System.out.println("Đã nhắn cho khách hàng: " + x.getContent());
    }

    public void undo(){
        if (stack.isEmpty()){
            System.out.println("Lỗi!");
        } else {
            Message remo = stack.pop();
            System.out.println("Đã xoá tin nhắn: " + remo.getContent());
        }
    }

    public void viewlast(){
        System.out.println("Tin nhắn gần nhất: " + stack.peek().getContent());
    }

    public void showall(){
        for (Message x : stack){
            System.out.println(x.getContent());
        }
    }

}
