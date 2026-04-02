import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        String file = "Bai10/src/input";
        BufferedReader bf;
        HashMap<String, String> map = new HashMap<>();

        try {
            FileReader fr = new FileReader(file);
            bf = new BufferedReader(fr);
            String line;

            while((line = bf.readLine()) != null){
                String[] arr = line.trim().split("=");
                String key = arr[0];
                String value = arr[1];
                map.put(key, value);
            }
            if (map.get("username") == null){
                throw new InvalidConfigException("Username not found");
            }
            if (map.get("timeout") == null){
                throw new InvalidConfigException("Timeout not found");
            } else {
                int timeout = Integer.parseInt(map.get("timeout"));
                if (timeout <= 0){
                    throw new InvalidConfigException("Invalid timeout value");
                }
            }
            if (map.get("maxConnections") != null){
                int cn = Integer.parseInt(map.get("maxConnections"));
                if (cn < 1){
                    throw new InvalidConfigException("Invalid maxConnections value");
                }
            }

            for (String x : map.keySet()){
                System.out.println(x + " - " + map.get(x));
            }

            System.out.println("Config loaded successfully");
        }

        catch (FileNotFoundException e){
            System.out.println("Config not found");
        }
        catch (IOException e){
            System.out.println("I/O Error");
            e.printStackTrace();
        }
        catch (NumberFormatException e){
            System.out.println("Invalid Number Format");
        }
        catch (InvalidConfigException e){
            System.out.println("Invalid config: " + e.getMessage());
        }

        finally{
            System.out.println("Program Finished");
        }
    }
}
