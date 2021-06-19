class QuickSort {
    static int partition(int[] a, int l, int h){
        int pivot = a[l];
        int i = l;
        int j = h;
        while (i < j){
            while(a[i] <= pivot){
                i++;
            }
            
            while(a[j] > pivot){
                j--;
            }

            if (i < j){
                swap(a, i, j);
            }
        }
       swap(a, l, j);
       return j;
    }//end of partition

    static void swap(int[] a, int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }//end of swap

    static void Sort(int[] a, int l, int h){
        if (l < h){
            int j = partition(a, l, h);
            Sort(a, l, j);
            Sort(a, j+1, h);
        }// end of if loop
    }// end of sort

    static void printArray(int[] a, int n){
        for (int x = 0; x < n; x++){
            System.out.print(a[x] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        int[] a = {10, 6, 8, 12, 9, 11, 13, 15, 5, 7};
        int n = a.length;
        int l = 0;
        int h = n-1;
        System.out.println("Unsorted Array: ");
        printArray(a, n);
        Sort(a, l, h);
        System.out.println("Sorted Array: ");
        printArray(a, n);

    }//end of void main

}//end of class