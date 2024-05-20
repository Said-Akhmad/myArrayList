import java.util.ArrayList;
import java.util.List;

public class MyArrayListApp {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();


        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
