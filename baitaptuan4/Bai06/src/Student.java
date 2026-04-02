public class Student implements Comparable<Student>{
    protected String name;
    protected Double gpa;

    public Student(String _name, double _gpa){
        name = _name;
        gpa = _gpa;
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public int compareTo(Student other){
        return gpa.compareTo(other.getGpa());
    }

    public void getInfo(){
        System.out.println(name + " - " + gpa);
    }
}
