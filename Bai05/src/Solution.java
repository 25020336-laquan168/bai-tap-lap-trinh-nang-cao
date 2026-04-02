import java.util.Scanner;

public class Solution {
    public int gcd(int a , int b){
        while(b != 0){
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return (a > 0) ? a : -a;
    }
}
