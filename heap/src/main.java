import com.sun.tools.javac.Main;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        // Taking the size of the heap from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of heap");
        int size=sc.nextInt();
        int []array=new int [size];
        Scanner sc3 = new Scanner(System.in);
        // Taking elements from the user separted by space
        System.out.println("Enter elements to bulid-MAX-heap");
        String[] speartedbyspace;
        speartedbyspace = sc3.nextLine().split(" ");
        Display display=new Display();
        BUILDMAXHEAP heapfiy = new BUILDMAXHEAP();
        for(int i =0 ;i < speartedbyspace.length;i++){
            array[i]= Integer.parseInt(speartedbyspace[i]);
        }
        //Creating array for every sort
        int[] heapSortArr = new int[size];
        int[] mergeSortArr = new int[size];
        int[] selectionSortArr = new int[size];
        Copy copy = new Copy();
        copy.copyArr(heapSortArr, array, size);
        copy.copyArr(mergeSortArr, array, size);
        copy.copyArr(selectionSortArr, array, size);
        //Building max Heap
        heapfiy.bulid(array,size);
        System.out.println("Building MAX-heap");
        display.display(array);
        //Getting maximum element
        HEAP_EXTRACT_MAX HEAPEXTRACTMAX = new HEAP_EXTRACT_MAX();
        System.out.println("Maximum element: " + HEAPEXTRACTMAX.heapExtractMax(size, array));
        size = HEAPEXTRACTMAX.getSize();
        System.out.println("size: " + size);
        //Inserting element in array
        MAX_HEAP_INSERT mhi = new MAX_HEAP_INSERT();
        System.out.print("Enter the number to be inserted: ");
        int x = sc.nextInt();
        mhi.maxHeapInsert(size, array, x);
        System.out.print("After insertion: ");
        display.display(array);
        size = mhi.getSize();
        System.out.println("size: " + size);
        //Testing heap sort
        HEAPSORT sort =new HEAPSORT();
        int heapTime = (int) System.currentTimeMillis();
        sort.heapsort(heapSortArr,size);
        System.out.println("heapsort:\n\tTime to sort: " + ((int)System.currentTimeMillis() - heapTime));
        System.out.print("\tSorted: \n\t");
        display.display(heapSortArr);
        //Testing merge sort
        MergeSort MS =new MergeSort();
        int mergeTime = (int) System.currentTimeMillis();
        MS.sort(mergeSortArr, 0, size - 1);
        System.out.println("MergeSort:\n\tTime to sort: " + ((int)System.currentTimeMillis() - mergeTime));
        System.out.print("\tSorted: \n\t");
        display.display(mergeSortArr);
        //Testing selection sort
        SelectionSort SS =new SelectionSort();
        int selectionTime = (int) System.currentTimeMillis();
        SS.sort(selectionSortArr, size);
        System.out.println("SelectionSort:\n\tTime to sort: " + ((int)System.currentTimeMillis() - selectionTime));
        System.out.print("\tSorted: \n\t");
        display.display(selectionSortArr);
    }
}
