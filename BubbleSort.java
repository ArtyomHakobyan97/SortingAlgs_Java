public class BubbleSort
{
    static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        int temp = 0;
        for(int k = 0; k < n-1; k++) {
            for (int i = 0; i < (n - 1); ++i) {
                for (int j = 1; j < n; ++j) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }
    }
}