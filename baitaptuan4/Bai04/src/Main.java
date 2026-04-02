public class Main {
    public static void main(String[] args) {
        DataManager m = new DataManager();
        m.show();
        // nếu ta không viết public ở hàm override lại interface, java sẽ tự nhận diện đó là phương thức có độ truy cập default, và mức truy cập này bé hơn mức truy cập trong method show trong interface
        // khi override thì lại không cho phép việc ta giảm mức độ truy cập, chỉ có thể duy trì mức truy cập đó hoặc tăng mức truy cập lên.
    }
}
