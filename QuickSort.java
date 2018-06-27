public class QuickSort
{
    int partition(int arr[], int low, int high)
    {
        int pivotVal = arr[high];
        int edge = low-1;

        for(int j = low; j < high; ++j)
        {
            if(arr[j] <= pivotVal)
            {
                ++edge;

                // swap edgeVal and jVal
                int temp = arr[edge];
                arr[edge] = arr[j];
                arr[j] = temp;
            }

        }

        //swap arr[high] and arr[edge+1]
        int temp = arr[edge+1];
        arr[edge+1] = arr[high];
        arr[high]= temp;

        /// NEEDS TO CHANGE
        return edge+1;
    }


    void sort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int partitVal = partition(arr, low, high);

            // sort right and left sides
            sort(arr, low, partitVal-1);
            sort(arr, partitVal+1, high);
        }

    }

    static void printArray(int [] arr)
    {
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; ++i)
        {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int arr[] = {10, 7, 8, 9, 1, 5};

        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n-1);

        System.out.println("sorted array \n");
        ob.printArray(arr);
    }

}
