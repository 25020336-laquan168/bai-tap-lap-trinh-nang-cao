public class Solution {
    public Solution(){
    }
    public long fib(long n){
        long f0 = 0;
        long f1 = 1;
        if (n < 0){
            return -1;
        } else if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else if (n > 92){
            return Long.MAX_VALUE; //vuot qua gioi han cua kieu long
        }
        while (n > 1){
            long tmp = f1;
            f1 = f1 + f0;
            f0 = tmp;
            n--;
        }
        return f1;
    }
}
