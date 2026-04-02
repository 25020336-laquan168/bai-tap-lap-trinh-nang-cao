public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        ((CanSwim) h).swim();
        h.fight();
//        ((CanFight) h).fight();
    }
}
