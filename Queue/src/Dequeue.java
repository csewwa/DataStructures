import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {
    public static void main(String[] args) {
        Deque<String>  car= new LinkedList<>();

        car.add("Audi A8");
        System.out.println("car list :" +car);

        car.addFirst("Audi A6");
        System.out.println("Updated car List :" + car);

        car.addLast("Audi A3");
        System.out.println("Updated car :"+car);

        car.removeFirst();
        System.out.println("Updated car :"+car);

        car.removeLast();
        System.out.println("Updated car :"+car);
    }
}
