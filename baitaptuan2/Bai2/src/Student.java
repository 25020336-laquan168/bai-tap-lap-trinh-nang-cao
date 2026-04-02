public class Student {
    private String id;
    private String name;
    private String gmail;
    private double gpa;
    //constructor khong chua tham so
    public Student(){
    }
    //constructor chua 2 tham so id va name
    public Student(String _id, String _name){
        id = _id;
        name = _name;
    }
    //constructor chua day du 4 tham so
    public Student(String _id, String _name, String _gmail, double _gpa){
        id = _id;
        name = _name;
        gmail = _gmail;
        gpa = _gpa;
    }
    //copy constructor
    public Student(Student khac){
        this.id = khac.id;
        this.name = khac.name;
        this.gmail = khac.gmail;
        this.gpa = khac.gpa;
    }
    //set/get gpa
    public void setGpa(double _gpa){
        if (_gpa <= 4 && _gpa >= 0){
            gpa = _gpa;
        } else {
            System.out.println("gpa nhap vao khong hop le");
        }
    }
    public double getGpa(){
        return gpa;
    }
    //set/get name
    public void setName(String newName){
        this.name = newName;
    }
    public String getName(){
        return name;
    }
    //set/get gmail
    public void setGmail(String newGmail){
        this.gmail = newGmail;
    }
    public String getGmail(){
        return gmail;
    }
    //set/get id
    public void setId(String newId){
        this.id = newId;
    }
    public String getId(){
        return id;
    }
}
