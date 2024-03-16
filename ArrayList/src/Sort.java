import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        arrayList.add(4);
        arrayList.add(7);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(6);

        System.out.print("Before Sorting : "   + arrayList + ", ");

        Collections.sort(arrayList);

        System.out.print("After Sorting : "  + arrayList   + ", ");
    }
}
