import java.util.ArrayList;
import java.util.List;

public class MultyT <T>{
    T data;
    List<MultyT<T>> child;
    public MultyT(T data){
        this.data = data;
        this.child = new ArrayList<>();}
    public  void addChild(MultyT<T> child) {
        this.child.add(child);
    }
    public T getData(){
        return data;
    }
    public List <MultyT<T>> getChild() {
        return child;
    }
    public static void main(String[] args) {
        MultyT<String> root = new MultyT<>(("Root Gawesh"));
        root.addChild(root);
        MultyT<String> c1 = new MultyT<>("Child umesha");
        MultyT<String> c2 = new MultyT<>("Child kalana");
        MultyT<String> c3 = new MultyT<>("Child Rasanjali");
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);
        MultyT<String> c11= new MultyT<>("Child umesha - sasa");
        MultyT<String> c21 = new MultyT<>("Child kalana - punchiMalith ");
        MultyT<String> c22 = new MultyT<>("Child kalana - umesha ");
        MultyT<String> c31 = new MultyT<>("Child Rasanjali - Rasa ");

        root.addChild(c11);
        root.addChild(c21);
        root.addChild(c22);
        root.addChild(c31);

        List<MultyT<String>> rootchild = root.getChild();
        for(MultyT<String> child : rootchild){
            System.out.println(child.getData());
        }
    }
}






