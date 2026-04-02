public class Main {
    public static void main(String[] args) {
        Student me = new Student();
        Student me2 = new Student("16082007", "La Quan");
        Student me3 = new Student("16082007", "Duc Tam", "nguyenductam@gmail.com", 1.0);
        Student me4 = new Student(me3);
        me2.setGpa(-1);
        System.out.println("GPA cua ban la " + me2.getGpa());
        me2.setGpa(3.6);
        System.out.println("GPA cua ban la " + me2.getGpa());
        System.out.println("-------------------");
        me.setName("Thai Son");
        me.setId("03092007");
        me.setGmail("thaisoncute@gmail.com");
        me.setGpa(4.0);
        System.out.println(me.getName() + " " + me.getId() + " " + me.getGmail() + " " + me.getGpa());
    }
}
