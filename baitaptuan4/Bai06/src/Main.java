public class Main {
    public static void main(String[] args) {
        Integer[] arr1 = {5, 1, 3, 2};
        ArrayUtils.sort(arr1);
        for (Integer x : arr1){
            System.out.print(x + " ");
        }

        System.out.println();

        String[] arr2 = {"Java", "C++", "Python"};
        ArrayUtils.sort(arr2);
        for (String x : arr2){
            System.out.print(x + " ");
        }

        System.out.println();

//        Student hs1 = new Student("Tam", 3.6);
//        Student hs2 = new Student("Quan", 3.8);
//        Student hs3 = new Student("Son", 4.0);
//
//        Student[] arr3 = {hs3, hs2, hs1};
//
//        for (Student x : arr3){
//            x.getInfo();
//        }
//
//        ArrayUtils.sort(arr3);
//        for (Student x : arr3){
//            x.getInfo();
//        }
    }
}
