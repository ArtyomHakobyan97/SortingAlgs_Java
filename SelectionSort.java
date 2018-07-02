public class SelectionSort
{
    public static int[] selectSort(int[] arr)
    {
        int edge = -1;
        int len = arr.length;

        for(int currMin = 0; currMin < len; )
        {
            for(int temp = currMin+1; temp < len ; ++temp)
            {
                if(arr[temp] < arr[currMin])
                {
                  currMin = temp;
                }
            }
            ++edge;

            //swap edgeVar with currMinVar
            int temp = arr[edge];
            arr[edge] = arr[currMin];
            arr[currMin] = temp;
            currMin = edge+1;
        }

        return arr;

    }
}
