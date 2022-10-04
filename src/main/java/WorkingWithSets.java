import java.util.HashSet;
import java.util.Set;

public class WorkingWithSets {


    //sets contain no duplicates
    //we dont know whats inside the set, no order is guaranteed
    //sets containt no pair of elemnts that equal each other
    //one null


    public static void main(String[] args) {
        Set<String> balls = new HashSet<>();

        balls.add("Yellow Ball");
        balls.add("Blue Ball");
        balls.add("Green Ball");
        balls.add("Purple Ball");
        balls.add("Red Ball");
        balls.add("Red Ball"); //Sets dont repeat so this wont print out
        System.out.println(balls.size());
        System.out.println(balls);
    }
}
