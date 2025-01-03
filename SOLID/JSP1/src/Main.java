import java.util.*;

public class Main {
    public static void main(String[] args) {

        Collection myData = new LinkedList();
        myData.add(1);
        myData.add(2);
        System.out.println(myData);
        myData = new Stack();
        myData.add(3);
        myData.add(4);
        System.out.println(myData);
    }
}