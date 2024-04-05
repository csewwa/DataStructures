import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int array[] , int element, int low ,int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == element)
                return mid;

            if (array[mid] < element)
                low = mid + 1;
            else
                high = mid - 1;

        }
            return -1;

        }

    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int arrary[] = {3,4,5,6,7,8,9};
        int n = arrary.length;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to search :");
        int element = s.nextInt();
        s.close();
        int result = b.binarySearch(arrary,element,0,n -1);
        if(result == -1)
            System.out.println("Not Found");
            else
            System.out.println("Element Found at Index:" +result);

    }
}
