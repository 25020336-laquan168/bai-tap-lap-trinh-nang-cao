public class Solution {
    public int sumOfDigits(int n){
        int sum = 0;
        if (n < 0){
            n = n*(-1);
        }
        while (n != 0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
}
