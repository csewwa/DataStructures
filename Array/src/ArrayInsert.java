public class ArrayInsert {
    static int addElement(int arr[], int n, int element, int volume) {
        if (n >= volume) {
            return n;
        } else {
            arr[n] = element;
            return (n + 1);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int volume = 20;
        int n = 6;
        int element = 26;
        System.out.print("Before Insert : ");
        for (int i = 0; i < n; i++) {

            System.out.print(arr[i]  + ", ");
        }
        n = addElement(arr, n, element, volume);
        System.out.print("\n after Insert : ");
        for (int i = 0; i < n; i++) {

            System.out.print( arr[i]  + ", ");

        }
    }

}
