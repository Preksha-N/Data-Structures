import java.util.Arrays;

class InsertionSort {

    void insertionSort(int array[]) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

        
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
  }


  public static void main(String args[]) {
    int[] data = { 8,9,2, 5, 1, 4, 6,3,7 };
    System.out.println(Arrays.toString(data));
    InsertionSort is = new InsertionSort();
    is.insertionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}