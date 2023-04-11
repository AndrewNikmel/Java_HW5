public class hw5 {

    public static void main(String[] args) {

        task1 task1 = new task1();
        task1.phoneBook();

        task2 task2 = new task2();
        task2.main(args);

        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
        task3 task3 = new task3();
        task3.sort(arr);
        System.out.println("Sorted array is");
        task3.printArray(arr);

        task4 task4 = new task4();
        task4.main(args);
        
    }
}