public class MergeSort
{
    //merge two sorted subarrays
    private void merge(int array[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
        // Create arrays for two halves
        int leftHalf[] = new int[n1];
        int rightHalf[] = new int[n2];
        for (int i = 0; i < n1; ++i)
        {
            leftHalf[i] = array[l + i];
        }
        for (int j = 0; j < n2; ++j)
        {
            rightHalf[j] = array[m + 1 + j];
        }
        //Merge the two  halves
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2)
        {
            if (leftHalf[i] <= rightHalf[j])
            {
                array[k] = leftHalf[i];
                i++;
            }
            else
            {
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        //Copy remaining elements
        while (i < n1)
        {
            array[k] = leftHalf[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            array[k] = rightHalf[j];
            j++;
            k++;
        }
    }
    /**\
     * sort the array using merge sort in order o(n * log(n))
     * @param array in which elements entered by user
     * @param l leftmost index of subarray
     * @param r righmost index  of subarray
     * */
    public void sort(int array[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int m =l+ (r-l)/2;
            // Sort first and second halves
            sort(array, l, m);
            sort(array, m + 1, r);
            // Merge the sorted halves
            merge(array, l, m, r);
        }
    }
}
