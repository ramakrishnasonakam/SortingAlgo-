class InsertionSort{
    static void Sort(int[] a, int n){
        int key;
        int j;
        for (int i = 0; i < n; i++){
            key = a[i];
            j = i - 1;

            while (j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j = j - 1;
            }
            a[j+1] = key;
        }//end of for loop
    }// end of Sort

    static void printArray(int[] a, int n){
        for (int x = 0; x < n; x++){
            System.out.print(a[x] + " ");
            System.out.print(" ");            
        }
        
    }// end of printArray

    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            Thread.sleep(60);
      }
        // finding the time after the operation is executed
        long end = System.currentTimeMillis();
        //finding the time difference and converting it into seconds
        float sec = (end - start) / 1000F; System.out.println(sec + " seconds");


        int[] a  = {5, 2, 4, 1, 6, 3};
        int n = a.length;
        System.out.println("Unsorted Array: ");
        Sort(a, n);
        System.out.println("Sorted Array: ");
        printArray(a, n);
    }// end of void main
}//end of class