public class HEAP_EXTRACT_MAX
{
    private int size;
    /**\
     * return maximum element in the heap in order o(logn)
     * @param size size of the array
     * @param array in which elements entered by user
     * @return maximum element in heap
     * */
    public Integer heapExtractMax(int size, int[] array)
    {
        //if the element in the array is less than we output that there is underflow
        if(size < 1)
        {
            System.out.println("Heap underflow");
            return null;
        }
        //We get the maximum element in the root
        int max = array[0];
        array[0] = array[size -1];
        this.size = size - 1;
        new MAX_HEAPFIY().heapfiy(array, size, 0);
        return max;
    }
    /**\
     * return size of array given after perfroming operation on it
     * @return size of the array given
     * */
    public int getSize()
    {
        return this.size;
    }
}
