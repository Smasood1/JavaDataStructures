import java.util.LinkedList;

public class LinkedLIsts {
    public static void main(String[] args) {


        LinkedList<String> names = new LinkedList<>();
        names.add("Saad");
        names.add("Tom");
        names.add("Tim");

        System.out.println(names);

        names.addFirst("Joe");
        System.out.println(names);

        System.out.println(names.peek());
    }





}
