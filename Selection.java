class Selection{
    static void sort(int[] a) {
        
        for (int i = 0; i < a.length - 1; i++){
            int min_idx = i;

            for (int j = i+1; j < a.length; j++){
                if (a[j] < a[min_idx]){
                    min_idx = j;
                }
            

            }

            int temp_idx = a[i];    
            a[i] = a[min_idx];
            a[min_idx] = temp_idx;
        }//end of sub-array loop
    }//end of void sort

    void printArray(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i] + " ");
            
        }
        System.out.println();
    }//end of printArray

    public static void main(String[] args) {
        Selection obj = new Selection();
        int[] a = {65,22,47,-1,19};
        obj.sort(a);
        System.out.println("Sorted Array is: ");
        obj.printArray(a);
        
    }

}//end of class

