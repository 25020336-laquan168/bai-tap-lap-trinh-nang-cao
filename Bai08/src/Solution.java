public class Solution {
    public boolean isPalindrome(int n){
        int tmp = n;
        if (n < 0) return false;
        if (n % 10 == 0 && n != 0) return false;
        long res = 0;
        while (n != 0){
            res = res * 10 + (n%10);
            n /= 10;
        }
        return res == tmp;
    }
}
