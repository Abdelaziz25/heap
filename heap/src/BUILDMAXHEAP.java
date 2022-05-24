public class BUILDMAXHEAP {
    // this function is used to build Max heap linearly by passing the index and array entred by user and the size of the array
    /**\
     * Bulid Max heap
     * @param array in which elements entred by user
     * @param n size of the array
     * */
    public void bulid(int[]array,int n)
    {
        MAX_HEAPFIY heapfiy = new MAX_HEAPFIY();
        for(int i =(int) Math.floor(n/2) - 1; i >= 0;i--){
            heapfiy.heapfiy(array,n,i);
        }
    }
}
