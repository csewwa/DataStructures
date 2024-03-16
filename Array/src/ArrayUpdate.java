public class ArrayUpdate {

        static void updateElement(int arr[], int n, int x, int pos) {
            for (int i = n - 1; i >= pos; i--) {
                arr[i + 1] = arr[i];
               // arr[pos] = x;
            }
            arr[pos] = x;
        }
        public static void main(String[] args) {
            int arr[] = new int[10];
            arr[0] = 2;
            arr[1] = 8;
            arr[2] = 1;
            arr[3] = 16;
            arr[4] = 10;ou
            int n = 5;
            int x = 20;
            int pos = 2;
            System.out.print("Before Insertion :- ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + ", ");
            }
            updateElement(arr, n, x, pos);
            n += 1;
            System.out.print("\nAfter Insertion :- ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + ", ");
            }
        }
    }

