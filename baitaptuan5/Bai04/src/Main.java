public class Main {
    public static void main(String[] args) {
        WordCounter wc = new WordCounter();
        wc.analyze("Hello world. This is a java program. Hello java, hello world.");
        wc.displayResult();
    }
}
/*
Phân tích:
Độ phức tạp khi cho thêm 1 phần tử mới vào:
    1. ArrayList: O(1).
    2. HashMap: O(1).
Khi duyệt xem từ đó có chưa:
    1. ArrayList: O(n).
    2. HashMap: O(1).
 */
