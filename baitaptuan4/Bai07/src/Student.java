public class Student {
    private String id;
    private String name;
    private double gpa;

    public Student(String _id, String _name, double _gpa){
        id = _id;
        name = _name;
        gpa = _gpa;
    }

    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }

    public String getInfo(){
        return id + " " + name + " " + gpa;
    }
}
