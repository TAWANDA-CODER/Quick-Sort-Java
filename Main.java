public class Main {
    public static void main(String args[])
    {
        System.out.println("--------------------");
        System.out.println("Quick Sort");
        System.out.println("--------------------");
        QuickSort oh = new QuickSort();
        System.out.println("Given array: ");

        int[] arr_quick = { 10, 7, 8, 9, 1, 5 };
        for (int i = 0;i < arr_quick.length;i++ ) 
        {
            System.out.print(arr_quick[i]+" ");    
        }
        System.out.println();
        int n_quick = arr_quick.length; 
        oh.quickSort(arr_quick, 0, n_quick - 1);
        System.out.println();
        System.out.println("Sorted array: ");
        oh.printArray(arr_quick, n_quick);
        System.out.println();
    }
}