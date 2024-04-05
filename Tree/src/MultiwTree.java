import java.util.ArrayList;
import java.util.List;
public class MultiwTree <T>{

    T data;
    List<MultiwTree<T>> child;
    public MultiwTree(T data){
        this.data = data;
        this.child = new ArrayList<>();}
    public  void addChild(MultiwTree<T> child) {
        this.child.add(child);
    }
    public T getData(){
        return data;
    }
    public List <MultiwTree<T>> getChild() {
        return child;
    }
    public static void main(String[] args) {
        MultiwTree<String> root = new MultiwTree<>(("Root"));
        root.addChild(root);
        MultiwTree<String> c1 = new MultiwTree<>("Child1");
        MultiwTree<String> c2 = new MultiwTree<>("Child2");
        MultiwTree<String> c3 = new MultiwTree<>("Child3");
        root.addChild(c1);
        root.addChild(c2);
        root.addChild(c3);
        MultiwTree<String> c11= new MultiwTree<>("Child11");
        MultiwTree<String> c12 = new MultiwTree<>("Child12");
        root.addChild(c11);
        root.addChild(c12);
        List<MultiwTree<String>> rootchild = root.getChild();
        for(MultiwTree<String> child : rootchild){
            System.out.println(child.getData());
        }
    }
    }




