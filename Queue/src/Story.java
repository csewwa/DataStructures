import java.util.LinkedList;
import java.util.Queue;

public class Story {
    public static void main(String[] args) {
        Queue<Integer> id = new LinkedList<>();
        id.offer(25);
        id.offer(26);
        id.offer(27);
        id.offer(28);

        System.out.println("Student Id:" +id);

        int removedId = id.poll();

        System.out.println("Removed student id :" +removedId);
        System.out.println("Updated Student id :" +id);
    }
}
