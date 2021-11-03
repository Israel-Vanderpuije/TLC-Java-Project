import java.util.ArrayList;
import java.util.List;

public class Bag <T> {

    List<T> bag = new ArrayList<T>();

    // Add to generic bag
    public void add(T t){
        bag.add(t);
    }

    // Remove from generic bag
    public void remove(T t){
        bag.remove(t);
    }

    // Clear from generic bag
    public void clear(){
        bag.clear();
    }

}
