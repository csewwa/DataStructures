import java.util.LinkedList;

public class list1 {
    public static void main(String[] args) {
        LinkedList <String> names = new LinkedList<String>();
        names.add("punchi malith");
        names.add("Sasa");
        names.add("Umesha");
        names.add("lahiru");
        names.add("Kalana");
        names.add("Chathurika");

        System.out.println("Names : " + names);

        names.add(3,"Gawesh");

        System.out.println("Update Name :" + names);

        String s = names.get(5);

        System.out.println("Name  at Index :" +5);

        names.set(1 ,"SAsadara Gamhewa : " + names);

        System.out.println("Update Name :" + names);

        String g =  names.remove(3);

        System.out.println("Removed name : " + g );

        System.out.println("Updated Names : " + names);
    }
}
