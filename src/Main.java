import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Items item = new Items();

        Scanner scan = new Scanner(System.in);

        String answer;

        Closet closetOne = new Closet();
        Closet closetTwo = new Closet();
        Closet closetThree = new Closet();


        System.out.println("Closet One: " + closetOne.toString() + "\n");
        System.out.println("Closet Two: " + closetTwo.toString() + "\n");
        System.out.println("Closet Three: " + closetThree.toString() + "\n");

        System.out.println("Which closet will you take from?");
        answer = scan.nextLine().replaceAll(" ", "");

        if (answer.equalsIgnoreCase("closetone")) {
            System.out.println("You chose closet one: " + closetOne.toString());
        } else if (answer.equalsIgnoreCase("closettwo")) {
            System.out.println("You chose closet two " + closetTwo.toString());
        } else if (answer.equalsIgnoreCase("closetthree")) {
            System.out.println("You chose closet three " + closetThree.toString());
        }


    }



}