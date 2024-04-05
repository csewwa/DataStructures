import java.util.LinkedList;
import java.util.Queue;

public class Enqueu {
    public static void main(String[] args) {
        Queue<String> KoreanStory= new LinkedList<>();
        KoreanStory.add("sujatha diyani");
        KoreanStory.add("abeetha diyani");
        KoreanStory.add("Isiwara wedaduru");

        System.out.println("KoreanStory :" +KoreanStory);

        String top_element = KoreanStory.peek();
        System.out.println("KoreanStory in the List :" +top_element);

        String removed_value = KoreanStory.poll();
        System.out.println("Removed KoreanStory in the list :" +removed_value);
        System.out.println("Update KoreanStory in the list: " +KoreanStory);

        KoreanStory.offer("Sirimeti siththarawi");
        System.out.println("Updated KoreanStory list :" +KoreanStory);
    }
}
