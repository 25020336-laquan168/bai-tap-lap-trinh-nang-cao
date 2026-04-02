public class MyDate {
    int day;
    int month;
    int year;
    public MyDate(int _day, int _month, int _year){
        day = _day;
        month = _month;
        year = _year;
    }
    public MyDate(MyDate khac){
        this.day = khac.day;
        this.month = khac.month;
        this.year = khac.year;
    }
}
