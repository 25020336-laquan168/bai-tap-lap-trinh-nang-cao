public class Message {
    String id;
    String content;

    public Message(String _id, String _content){
        id = _id;
        content = _content;
    }

    public String getContent(){
        return content;
    }
}
