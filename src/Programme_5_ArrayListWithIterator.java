import java.util.ArrayList;
import java.util.ListIterator;

public class Programme_5_ArrayListWithIterator {

    public static void main(String[] args) {
        ArrayList<String> fruitlist = new ArrayList<>();
        fruitlist.add("APPLE");
        fruitlist.add("BANANA");
        fruitlist.add("GRAPE");
        fruitlist.add("MANGO");
        fruitlist.add("KIWI");
        fruitlist.add("ORGANGE");
        fruitlist.add("BLACKBERRY");
        fruitlist.add("STRAWBERRY");
        fruitlist.add("CHERRY");

        ListIterator<String> iterate = fruitlist.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next() + ",");
        }
    }
}
