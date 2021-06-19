class MergeSort{
    void merge(int[] a, int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for (int x = 0; x < n1; x++){
            left[x] = a[l + x];
        }

        for (int y = 0; y < n2; y++){
            right[y] = a[m + y + 1];
        }

        int i = 0;
        int j = 0;
        int k = l;
        
        while (i<n1 && j<n2) {
            if (left[i] <= right[j]){
                a[k] = left[i];
                i++;
            }
            else{
                a[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            a[k] = left[i];
            i++;
            k++;
        }
        while(j < n2){
            a[k] = right[j];
            j++;
            k++;
        }
    }//end of merge()

    void divideArray(int[]a, int l, int r) {
        if (l < r){
            int m = (l+r)/2;
            divideArray(a, l, m);
            divideArray(a, m + 1, r);       
            merge(a, l, m, r);
        }
    }//end of void divideArray()

    public void printArray(int[] a){
        int n = a.length;
        for (int x = 0; x < n ; x++){
            System.out.print(a[x] + " ");
        }
        System.out.println();
    }//end of printArray

    public static void main(String[] args){
        int[] a = {2, 4, 1, 6, 3, 7, 5, 8};
        MergeSort ms = new MergeSort();
        System.out.println("Unsorted Array: ");
        ms.printArray(a);
        
        ms.divideArray(a, 0, a.length-1);
        System.out.println("Sorted Array: ");
        
        ms.printArray(a);
    }

}//end of class