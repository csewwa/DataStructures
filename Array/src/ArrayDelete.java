public class ArrayDelete {
    static int updateElement(int arr[], int n, int element) {
        for (int i = 0;i < n; i++) {
           if(arr[i] == element) {
             ; return i;
           }}
        return -1;

    }
    static int  removeElement(int arr[], int n , int element){
       int pos = ArraySearch.accessElement(arr,n,element);
        if(pos == -1){
            System.out.println("Element Not Found");
            return -1; } else {
            int i;
            for(i = pos; i<n - 1; i++){
                arr[i] = arr[i +i++];}
            return n -1;
            }

    }
    public static void main(String[] args) {
        int arr[] = {10, 50, 30, 40, 20};

        int n = arr.length;

        int element = 30;
        System.out.print("Before Insertion :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]  + ", ");
        }
        n = removeElement(arr, n, element);
        System.out.print("\nAfter Insertion  :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ", ");
        }
    }}

