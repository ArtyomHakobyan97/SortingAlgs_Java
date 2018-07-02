public class MergeSort
{
    private int[]array;
    private int[]tempMergeArray;
    private int length;

    public void sort(int[] inputArr)
    {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArray = new int[length];
        doMergeSort(0, length-1);
    }

    private void doMergeSort(int lowerIndex, int higherIndex)
    {
        if(lowerIndex < higherIndex)
        {
            int middleIndex = (higherIndex + lowerIndex)/2;
            doMergeSort(lowerIndex, middleIndex);
            doMergeSort(middleIndex + 1, higherIndex);

            //merge them
            mergeParts(lowerIndex, middleIndex, higherIndex);
        }
    }

    private void mergeParts(int lowerIndex, int middleIndex, int higherIndex)
    {
        for(int i = lowerIndex; i <= higherIndex; ++i)
        {
            tempMergeArray[i] = array[i];
        }

        int i = lowerIndex;
        int k = lowerIndex;
        int j = middleIndex+1;

        while(i <= middleIndex && j <= higherIndex)
        {
            if(tempMergeArray[i] <= tempMergeArray[j])
            {
                array[k] = tempMergeArray[i];
                ++i;
            }
            else
            {
                array[k] = tempMergeArray[j];
                ++j;
            }
            ++k;
        }


        while (i <= middleIndex)
        {
            array[k] = tempMergeArray[i];
            i++;
            k++;
        }

        while(j <= higherIndex)
        {
            array[k] = tempMergeArray[j];
            ++j;
            ++k;
        }
    }
}
