import java.util.*;

public class Main {


    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int i = 0; i < (n-1); ++i)
        {
            for(int j = 1; j < n; ++j)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void bubbleSortMy(int arr[])
    {
        for(int i = 0; i < arr.length-1; ++i)
        {
            for(int j = 1; j < arr.length; ++j)
            {
                if(arr[i] > arr[j])
                {
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5};

        int n = arr.length;



        // Quick Sort and Print
        QuickSort quickSobj = new QuickSort();
//        quickSobj.sort(arr, 0, n-1);
//        System.out.println("sorted array \n");
//        quickSobj.printArray(arr);



        // Bubble Sort and Print
//        int[] arr2= {10, 7, 8, 9, 1, 5};
//        BubbleSort bubOb = new BubbleSort();
//        n = arr2.length;
//
//        bubOb.bubbleSort(arr2);
//        System.out.println("sorted array \n");
//        quickSobj.printArray(arr2);
//



//        // Selection Sort and Print
//        int[] arr3= {10, 5, 9, 8, 1, 7};
//        SelectionSort selObj = new SelectionSort();
//        selObj.selectSort(arr3);
//        quickSobj.printArray(arr3);
//
//

        // Merge Sort and Print
        int[] arr4= {10, 5, 9, 8, 1, 7};
        MergeSort mergeObj = new MergeSort();
        mergeObj.sort(arr4);
        quickSobj.printArray(arr4);




    }
}
