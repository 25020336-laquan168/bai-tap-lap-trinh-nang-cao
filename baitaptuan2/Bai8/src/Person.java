public class Person {
    private String name;
    private Person me;
    public Person(String _name){
        name = _name;
    }
    public void setMe(Person khac){
        me = khac;
    }
    public Person getMe(){
        return me;
    }
    public String getName(){
        return name;
    }
}