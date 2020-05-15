public class MergeSort {
  /** The private field count represents the number of swaps */
    private static int count;

    /** This method will set the count field to a specified int value, in this case it will be used to take the value of the incrementinng count integer after the swaps have occured
     * @param c The integer which represents the amount of swaps that were performed
     */
    public static void setCount(int c){
        count = c;
    }

/** This method will return the value of the count field. In this case, it will be used in the driver class to display the number of swaps that were performed
	@return count Represents the number of swaps made
*/
    public int getCount(){
        return count;
    }

    /** The method for sorting the numbers
     * @param list The array that is going to be sorted
    */
  public static void mergeSort(int[] list) {
    if (list.length > 1) {
      /** The first half of the array is sorted using the mergeSort method recursively */
      int[] firstHalf = new int[list.length / 2];
      System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
      mergeSort(firstHalf);

      /** The second half of the array is sorted using the mergeSort method recursively */
      int secondHalfLength = list.length - list.length / 2;
      int[] secondHalf = new int[secondHalfLength];
      System.arraycopy(list, list.length / 2,
        secondHalf, 0, secondHalfLength);
      mergeSort(secondHalf);

      /**The sorted halves are combined into one array, list, using the merge method */
      merge(firstHalf, secondHalf, list);
    }


  }

  /** This method takes two arrays and combines them into one, in this case, it is used during the mergeSort method to combine two halves of an array and bring them together after they are sorted
   * @param list1 The first half
   * @param list2 The second half
   * @param temp Temporary  array used to swap values
  */
  public static void merge(int[] list1, int[] list2, int[] temp) {
      int count = 0;
    int current1 = 0;
    int current2 = 0;
    int current3 = 0;

    while (current1 < list1.length && current2 < list2.length) {
      if (list1[current1] < list2[current2])
      {
        temp[current3++] = list1[current1++];
        count++;
        setCount(count);
      }
      else
        temp[current3++] = list2[current2++];
        count++;
        setCount(count);
    }

    while (current1 < list1.length)
      temp[current3++] = list1[current1++];
      count++;
      setCount(count);

    while (current2 < list2.length){
      temp[current3++] = list2[current2++];
      count++;
      setCount(count);
    }


  }


}