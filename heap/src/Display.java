
// printing elements of the heap
public class Display {
    /**\
     * it is used to print elements of array
     * @param array in which elements entred by user
     * */
    public void display(int [] array)
    {
        System.out.print("[");
        for(int i=0;i<array.length;i++)
        {

            System.out.print(array[i]);
            if(i!=array.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
}
