import java.util.ArrayList;

public class Add {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("umesha");
        al.add("Lahiru");
        al.add("Ometh");
        al.add("Chathurika");

        System.out.println("Name  :" + al);
        // access -search element get();
        String s = al.get(3); // get(Index)
        System.out.println("Index 3 Name is : " + s );

        //change or update elements - set();
        al.set(2 , "punchimalith"); // set(index, value)
        System.out.println("Modified Name : " + al);

        //remove or delete elements - remove()
        String sl = al.remove(2);//remove(index)


        System.out.println("Update  Array : " + al);
        System.out.println("Remove Name is : " + sl);

    }
}
