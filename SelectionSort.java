public class SelectionSort
{
    public void selectSort(int[] arr)
    {
        int edge = -1;
        int len = arr.length;
        for(int currMin = 0; currMin < len; ++currMin)
        {
            for(int temp = currMin+1; temp < len; ++temp)
            {
                if(arr[temp] < arr[currMin])
                {
                  currMin = temp;
                }
            }
            edge++;

            //swap edgeVar with currMinVar
            int temp = arr[edge];
            arr[edge] = arr[currMin];
            arr[currMin] = temp;
        }

    }
}
