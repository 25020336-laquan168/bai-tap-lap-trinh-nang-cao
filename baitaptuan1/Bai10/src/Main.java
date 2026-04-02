public class Main {
    public static void main(String[] args){
      Solution x = new Solution();
      int[] arr = {1, 2, 3, 4, 5, 6};
      int[] arr2 = {1, 5, 2, 4, 7 , 8};
      int[] arr3 = {9, 9, 9, 8};
      int[] arr4 = {2};
      System.out.println(x.secondlargest(arr));
      System.out.println(x.secondlargest(arr2));
      System.out.println(x.secondlargest(arr3));
      System.out.println(x.secondlargest(arr4));
    }
}
