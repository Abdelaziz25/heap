public class HEAPSORT {
    // this function is used to sort heap in o(nlgn)
    // in which everytime we swap between element and then call heapify to bulid the heap
    int temp;
    MAX_HEAPFIY heapfiy = new MAX_HEAPFIY();
    /**\
     * sort the heap in order o(n logn)
     * @param array in which elements entered by user
     * @param n size of the array
     * */
    public void heapsort(int[]array,int n)
    {
        for(int i = n-1 ; i >= 0;i--){
            temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapfiy.heapfiy(array,i,0);
        }
    }
}
