public class MAX_HEAPFIY {
    // in this function we use heapify method in which used to bulid max heap
    /**\
     * is the key to maintain the max-heap property
     * @param array in which elements entred by user
     * @param n size of the array
     * @param i index of the node chosen by user
     * */
    public void heapfiy(int [] array ,int n ,int i)
    {
        // in which i is the index of the node chosen by user
        // in which n size of array
        // in which array is the array entred by user
        int largest = i;
        int l = 2*i;
        int r = 2*i+1;
        // then we get the left child for i in which is 2*i
        // and we get right child which is 2*i+1

        int temp;
        if (l < n && array[l] > array[largest]){
            largest = l;
        }
        // check if l smaller than size and element of l is larger than element of the largest
        if (r < n && array[r] > array[largest]){
            largest = r;
        }
        // check if r smaller than size and element of r is larger than element of the largest
        if (largest != i){
             temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;
            heapfiy(array,n,largest);
        }
        // and then we swap between element if is not the largest and then call function of heapfiy again

    }

}
