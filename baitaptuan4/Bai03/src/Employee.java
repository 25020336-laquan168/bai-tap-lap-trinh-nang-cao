abstract public class Employee implements IWorkable{
    protected String id;
    protected String name;
    protected double baseSalary;

    abstract double caculatePay();
}
