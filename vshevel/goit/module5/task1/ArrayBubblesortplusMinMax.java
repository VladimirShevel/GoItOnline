package vshevel.goit.module5.task1;

public class ArrayBubblesortplusMinMax {
        private static int arr[] = new int[10];

    public  static  void randomArrayInit(){
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
    }

    public static void printArray(){
        for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + "  ");
        }
    }

    public static void bubbleSort(int[] arr){
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){
                 if( arr[j] > arr[j+1] ){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
            }
        }
    }
}

    public static int max(int[] arr) {
        int a = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if ( a < arr[i]) a = arr[i];
        }
        return a;
    }

    public static int min(int[] arr) {
        /* int a = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if ( a > arr[i]) a = arr[i];
        } */
        return arr[0];
    }

    public static void main(String[] args) {
        System.out.print("Unsorted array is: ");
        randomArrayInit();
        printArray();
        System.out.print("\n");
        bubbleSort(arr);
        System.out.print("Sorted  array  is: ");
        printArray();
        System.out.print("\n");
        System.out.println("Min is: " + min(arr));
        System.out.println("Max is: " + max(arr));
    }
}
