public class QuickSort {
    private static int count = 0;

/** Quick Sort method
*@param list The array that will be sorted
*/
  public static void quickSort(int[] list) {
    quickSort(list, 0, list.length - 1);
    System.out.println("\nQuick Swaps: " + count);
    for (int i = 0; i < list.length; i++)
    System.out.print(list[i] + " ");
  }
/** Overloaded Quick Sort method
* @param list The array that will be sorted
* @param first The first value of list
* @param last The last value of list
*/
  public static void quickSort(int[] list, int first, int last) {
    if (last > first) {
      int pivotIndex = partition(list, first, last);
      quickSort(list, first, pivotIndex - 1);
      quickSort(list, pivotIndex + 1, last);


    }

  }

/** Partition method
*@param list The array that will be sorted
*@param first The first value of list
*@param last The last value of list
*@return high The last value of the array
*@return first The first value of the array
*/
  public static int partition(int[] list, int first, int last) {

/** In this case, the pivot is hard coded to be the first value of the array
*	The low value is set to the second value of the array
*	The high value is set to the last value of the array
*
*	These values are incremented/decremented based on their comparisons and will
*	change the value of pivot since it will use high and low as its index during the sorting process
*/
    int pivot = list[first];
    int low = first + 1;
    int high = last;

    while (high > low) {

      while (low <= high && list[low] <= pivot)
        low++;

      while (low <= high && list[high] > pivot)
        high--;

      if (high > low) {
        int temp = list[high];
        list[high] = list[low];
        list[low] = temp;
        count++;
      }

    }

    while (high > first && list[high] >= pivot)
      high--;

  /** @param high The last value in the array */
    if (pivot > list[high]) {
      list[first] = list[high];
      list[high] = pivot;
      count++;
      return high;

    }
    /** @param first The first value in the array */
    else {
      return first;
    }

  }

}