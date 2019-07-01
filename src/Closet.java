import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;


public class Closet {

    Random rand = new Random();
    ArrayList closet;


    public Closet() {

        Items item = new Items();
        closet = new ArrayList<>();

        closet.add("\n\bJacket: " + item.getMyJackets().get(getRand()));
        closet.add("\nPants :" + item.getMyPants().get(getRand()));
        closet.add("\nShirts :" + item.getMyShirts().get(getRand()));
        closet.add("\nShoes :" + item.getMyShoes().get(getRand()));


    }

    //Random generator method
    public int getRand() {
        int j = rand.nextInt(3);
        return j;
    }

    //Method to print closet instance
    @Override
    public String toString() {
        return closet.toString().replaceAll("]", "").replaceAll(",", " ").replace('[', ' ');
    }


}








//        Items item = new Items();
//
//        closet = new ArrayList<>();
//
//        int j = rand.nextInt((3) + 1);
//
//
//        closet.add(0, "Jacket: " + item.getMyJackets());
//
//
//
//
//
//        j = rand.nextInt((3) + 1);
//        closet.add(1, "Pants: " + item.getMyPants().toString().substring(j));
//        j = rand.nextInt((3) + 1);
//        closet.add(2, "Shirts :" + item.getMyShirts().toString().substring(j));
//        j = rand.nextInt((3) + 1);
//        closet.add(3, "Shoes :" + item.getMyShoes().toString().substring(j));
//    }







//    public ArrayList<String> getCloset() {
//        return closet;
//    }
//
//    public void setCloset(ArrayList<String> closet) {
//        this.closet = closet;
//    }








/**********getters/setters**********/

//
//    public ArrayList<Closet> getClosetOne() {
//        return closetOne;
//    }
//
//    public void setClosetOne(ArrayList<Closet> closetOne) {
//        this.closetOne = closetOne;
//    }
//
//    public ArrayList<Closet> getClosetTwo() {
//        return closetTwo;
//    }
//
//    public void setClosetTwo(ArrayList<Closet> closetTwo) {
//        this.closetTwo = closetTwo;
//    }
//
//    public ArrayList<Closet> getClosetThree() {
//        return closetThree;
//    }
//
//    public void setClosetThree(ArrayList<Closet> closetThree) {
//        this.closetThree = closetThree;
//    }











//    public Closet(){
//        myJackets = new ArrayList<>();
//        myShirts = new ArrayList<>();
//
//        Jacket jacketOne = new Jacket("Windbreaker", "Synthetic", "Red", true, "Hiking,Snowboarding");
//        Jacket jacketTwo = new Jacket("Parka", "Wool", "Black", true, "Leisure");
//        Jacket jacketThree = new Jacket("North Face", "Cotton/Synthetic", "Hot Pink", false, "Hiking,Leisure");
//        Collections.addAll(myJackets, jacketOne, jacketTwo, jacketThree);
//    }