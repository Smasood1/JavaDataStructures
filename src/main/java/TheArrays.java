import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {
        String [] colors = new String [5];
        //add color to index positions in array
        colors[0] = "purple";
        colors[1] = "blue";
        colors[2] = "Yellow";
        //see contents of the array
        System.out.println(colors);
        //this prints out the location not the contents

        //arrays have built in mehtods like to string to print the string of the array
        System.out.println(Arrays.toString(colors));
        //this prints full array including null elements

        //print out the element at a certain index position
        System.out.println(colors[1]);

//        int [] numbers = new int [2];
//
//        numbers[0] = 100;
//        numbers[1] = 200;

        //or

        int [] numbers = {100,200};

        //print the elements in the array


        for(int i = 0; i < colors.length; i++){
            System.out.println(colors[i]);
        }
        // loop through arrays backwards
        for(int i = colors.length - 1; i >= 0; i++){
            System.out.println(colors[i]);
        }

        //enhanced for loop
        for(String x : colors){
            System.out.println(x);
        }

        //arrays stream to print array
        Arrays.stream(colors).forEach(System.out::println);




    }
}
