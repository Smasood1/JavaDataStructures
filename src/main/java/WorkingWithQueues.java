
import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueues {

   //FIFO First in first out

    public static void main(String[] args) {
        Queue<String> superMarket = new LinkedList<>();

        superMarket.add("Coke");
        superMarket.add("Chips");
        superMarket.add("Chocalate");

        System.out.println(superMarket.peek());
        System.out.println(superMarket.size());
        System.out.println(superMarket);

        System.out.println(superMarket.add("Water"));
        System.out.println(superMarket);

        System.out.println(superMarket.peek());

    }


}
