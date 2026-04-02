abstract class Employee {
    protected String name;
    protected String dob = "16/08/2007";
    protected String id;
    public Employee(String _name){
        name = _name;
    }
    public String getName(){
        return name;
    }
    abstract double tinhluong();
    abstract String type();

}
