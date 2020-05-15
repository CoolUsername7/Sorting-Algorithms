/**
 * AlgorithmSortDemo
 *
 * This class will create and demonstrate 4 common sorting algorithms on 4 identical arrays and show the number of swaps in each
 *
 * @author Justin Delgado
 */

public class AlgorithmSortDemo{
    public static void main(String [] args){

        /** Each array is 20 integers and are named with respect to the sorting algorithm which will be used to sort it */
        int [] insertion = {5,15,6,4,8,7,3,2,3,9,-5,-4,10,12,4,1,-7,6,11,7};
        int [] bubble = {5,15,6,4,8,7,3,2,3,9,-5,-4,10,12,4,1,-7,6,11,7};
        int [] merge = {5,15,6,4,8,7,3,2,3,9,-5,-4,10,12,4,1,-7,6,11,7};
        int [] quick = {5,15,6,4,8,7,3,2,3,9,-5,-4,10,12,4,1,-7,6,11,7};

        InsertionSort array1 = new InsertionSort();
        array1.insertionSort(insertion);

        BubbleSort array2 = new BubbleSort();
        array2.bubbleSort(bubble);

        MergeSort array3 = new MergeSort();
		array3.mergeSort(merge);
		System.out.println("\nMerge Swaps: " + array3.getCount());
		for (int i = 0; i < merge.length; i++)
        System.out.print(merge[i] + " ");

        QuickSort array4 = new QuickSort();
        array4.quickSort(quick);

        System.out.println();








    }
}