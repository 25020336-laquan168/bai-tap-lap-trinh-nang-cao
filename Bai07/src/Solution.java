public class Solution {
    public int reverse(int n){
        int tmp = n;
        if (n < 0) n = -n;
        long res = 0;
        while (n != 0){
            res = res * 10 + (n%10);
            n /= 10;
        }
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) return 0;
        if (tmp >= 0) return (int)res;
        else return (int)(-res);
    }
}