 class SelectionSort {
    static void selectionSort(int [] arr){
        for(int i = 0; i< arr.length-1 ;i++ ){
            int idx  = i;
            for (int j = i +1 ; j < arr.length ; j++){
                if(arr[j] < arr[idx]){
                idx = j;

            }
        }
        int smallVal = arr[idx];
        arr[idx] = arr[i];
        arr[i] = smallVal;

    }
}

     public static void main(String[] args) {
         int array[] = {9,14,3,2,43,11,58,22};
         System.out.println("Before selection sort : ");
         for(int i : array){
             System.out.println(i + "  ");

         }
         selectionSort(array);
         System.out.println("After selection sort :");
         for(int i : array){
             System.out.println(i + "  ");
         }
     }
}
