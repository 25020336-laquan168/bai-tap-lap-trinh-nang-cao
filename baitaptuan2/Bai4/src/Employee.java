public class Employee {
    String name;
    MyDate birthday;
    //contructor binh thuong
    public Employee(String _name, MyDate bd){
        name = _name;
        birthday = bd;
    }
    //copy constructor
    public Employee(Employee khac){
        this.name = khac.name;
        //String pool, neu co 2 xau giong nhau, no se duoc tro thang den cung gia tri.
        this.birthday = new MyDate(khac.birthday); //deep copy
    }
    //doi ngay sinh
    public void changebirthday(MyDate newDate){
        birthday = newDate;
    }
    //show ngay sinh
    public void showbirthday(){
        System.out.println("ngay sinh cua " + name + " la:" + birthday.day + "/" + birthday.month + "/" + birthday.year);
    }
}
