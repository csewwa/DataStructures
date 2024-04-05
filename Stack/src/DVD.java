import java.util.Stack;

public class DVD {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Grfil");
        stack.push("Giripura eththo");
        stack.push("sutin matin");
        stack.push("surapappa");

        System.out.println("Catoon`s :" +stack);

        stack.pop();

        System.out.println("Catoon`s  :"+stack);

        System.out.println( "Top of the catoon : "+ stack.peek());

        System.out.println( " 0 Index :" +stack.search("Grfil"));
        System.out.println( " 2 Index :" +stack.search("sutin matin"));
        /*stack.clear();
        System.out.println( "catoon :"+ stack);*/

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("catoon :" +stack);
    }
}
