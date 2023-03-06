import java.util.*;
  
class BubbleSort {
    void Order(int arr[])
    {
        for (int i = 0; i < arr.length - 1; i++)
            for (int j = 0; j < arr.length - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int p = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = p;
                }
    }
  public static int[] randomArray(int arr[]){
      for (int i = 0; i < arr.length; ++i){
          arr[i]= (int)((Math.random()*10));
      }
      return arr;
      
  }
   public void print(int arr[])
    {
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort bubble = new BubbleSort();
        int [] arr= new int [10];
        randomArray(arr);
        System.out.println("Your original array:");
        bubble.print(arr);
        bubble.Order(arr);
        System.out.println("Your Bubble Sorted array:");
        bubble.print(arr);
    }
}
