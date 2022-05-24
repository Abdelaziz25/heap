public class SelectionSort
{
    /**\
     * sort the array using selection sort in order o(n^2)
     * @param array in which elements entered by user
     * @param size the size of array
     * */
    public void sort(int array[], int size)
    {
        for (int i = 0; i < size - 1; i++)
        {
            //Find the minimum element in unsorted array
            int min = i;
            for (int j = i + 1; j < size; j++)
            {
                if (array[j] < array[min])
                {
                    min = j;
                }
            }
            //Swap the found minimum element with the first
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
