public class InsertionSort {
    static void insertionSort(int arr[]){
        for (int i=1; i < arr.length; i ++){
            int key = arr[i];
            int j = i -1;
            while ((j > -1) && (arr[j] > key)){
                arr[j + 1] =arr[j];
                j--;
            }
            arr[j +1] = key;

        }
    }

    public static void main(String[] args) {

        int[] array = { 25,15,35,57,123,14,8,6,345,1};
        System.out.println("Before Insertion sort : ");
        for(int i : array){
            System.out.println(i + "  ");

        }
        insertionSort(array);
        System.out.println("After Insertion sort :");
        for(int i : array){
            System.out.println(i + "  ");
        }
    }
}
