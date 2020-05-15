public class BubbleSort {
  /** Bubble Sort method
  * @param list The array that will be sorted
  */
  public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    int count = 0;

    for (int k = 1; k < list.length && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < list.length - k; i++) {
        if (list[i] > list[i + 1]) {
          // Swap list[i] with list[i + 1]
          /** Swaps the target value and the item to the right of it */
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;

          needNextPass = true;
          count++;
        }
      }
    }
    /** Prints the amount of swaps and the sorted array */
    System.out.println("\nBubble Swaps: " + count);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }

}