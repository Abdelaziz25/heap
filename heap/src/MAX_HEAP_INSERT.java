public class MAX_HEAP_INSERT
{
    private int size;
    /**\
     * It inserts element in the heap in order o(logn)
     * @param size size of the array
     * @param array in which elements entered by user
     * @param x elements to be entered in array
     * */
    public void maxHeapInsert(int size, int[] array, int x)
    {
        this.size = size;
        int temp = size;
        int parent = (size % 2 == 0)? (size / 2 - 1): (size / 2);
        array[size] = x;
        size++;
        while(parent >= 0)
        {
            if(array[temp] > array[parent])
            {
                int h = array[temp];
                array[temp] = array[parent];
                array[parent] = h;
                temp = parent;
                parent = (temp % 2 == 0)? (temp / 2 - 1) : (temp / 2);
            }
            else
            {
                break;
            }
        }
    }
    /**\
     * return size of array given after performing operation on it
     * @return size of the array given
     * */
    public int getSize()
    {
        return this.size;
    }
}
