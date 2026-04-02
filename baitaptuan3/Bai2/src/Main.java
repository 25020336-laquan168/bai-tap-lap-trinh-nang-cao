public class Main {
    public static void main(String[] args) {
        Animal[] zoo = new Animal[4];
        zoo[0] = new Dog();
        zoo[1] = new Cat();
        zoo[2] = new Duck();
        zoo[3] = new Dog();
        for (int i = 0; i < 4; i++){
            zoo[i].makeSound();
        }
        // con vịt sẽ in ra "Animal sound" bởi vì nó không ghi đè phương thức makeSound bên trong class Duck, nên nó sẽ sử dụng phương thức makeSound của lớp cha.
    }
}
