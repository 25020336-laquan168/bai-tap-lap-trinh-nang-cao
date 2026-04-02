public class DataManager implements IData{
//    void show(){
    public void show(){
        //nếu không có public ở đây thì java mặc định để mức độ truy cập default (package - private), thì sẽ báo lỗi vì ta không thể giảm mức độ truy cập.
        System.out.printf("Show Data");
    }
}
