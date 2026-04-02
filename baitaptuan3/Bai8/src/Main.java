import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Robot[] robots = new Robot[n];

        for(int i = 0; i < n; i++){
            String line = sc.nextLine().trim();
            String[] conlai = line.split(" ");
            String type = conlai[0];
            int id =  Integer.parseInt(conlai[1]);
            String name = conlai[2];

            if (type.equals("DR")){
                robots[i] = new DroneRobot(id, name);
            } else if (type.equals("FR")){
                robots[i] = new FishRobot(id, name);
            } else {
                robots[i] = new AmphibiousRobot(id, name);
            }
        }

        for (Robot x : robots){
            x.performMaintask();

            if (x instanceof Flyable){
                ((Flyable) x).fly();
            }
            if (x instanceof GPS){
                ((GPS) x).getCoordinates();
            }
            if (x instanceof Swimmable){
                ((Swimmable) x).swim();
            }
        }
    }
}

// cau hoi 1: khong the goi duoc ham fly(), vi no co kieu Robot va trong class Robot khong co method fly.
//            muon goi thi phai castdown xuong class DroneRobot hoac castdown xuong Flyable.
//cau hoi 2:  neu ke thua thi khong duoc vi java chi cho phep ke thua 1 class.
//            con neu cho no la interface thi co the duoc.
