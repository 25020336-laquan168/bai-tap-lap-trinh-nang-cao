public class Solution {
    public int secondlargest(int[] arr){
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;
        boolean check = false;
        for (int i = 1; i < arr.length; i ++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i ++){
            if (arr[i] > max2 && arr[i] < max){
                max2 = arr[i];
                check = true;
            }
        }
        if (check == false) return -1;
        else return max2;
    }
}
