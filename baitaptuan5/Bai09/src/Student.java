import java.io.Serializable;

public class Student implements Serializable {
    String id;
    String name;
    double gpa;

    public Student(String _id, String _name, double _gpa){
        id = _id;
        name = _name;
        gpa = _gpa;
    }

    public String toString(){
        return id + " - " + name + " - " + gpa;
    }
}
