public class InsertionSort{

/** Insertion Sort Method
@param list The array that will be sorted
*/
    public static void insertionSort(int [] list) {
        int count = 0;
        for(int i = 1; i < list.length; i++){
            /** Insert list [i] into a sorted sublist list [0..i-1] is sorted. */
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >= 0 && list[k] > currentElement; k--)
            {
                list[k+1] = list[k];
                count++;
            }

            /** Insert the current element into list[k+1] */
            list[k + 1] = currentElement;
        }
        /** Prints the amount of swaps and the sorted array */
        System.out.println("Insertion Swaps: " + count);

        for(int i = 0; i < list.length; i++)
        System.out.print(list[i] + " ");
    }
}