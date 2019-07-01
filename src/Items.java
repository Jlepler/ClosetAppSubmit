import java.util.*;
import java.util.ArrayList;

public class Items {

    private ArrayList<ArrayList> myJackets;
    private ArrayList<ArrayList> myShirts;
    private ArrayList<ArrayList> myPants;
    private ArrayList<ArrayList> myShoes;

    public Items() {

        myJackets = new ArrayList<>();
        myShirts = new ArrayList<>();
        myPants = new ArrayList<>();
        myShoes = new ArrayList<>();

        Jacket jacketOne = new Jacket("Windbreaker", "Synthetic", "Red", true, "Hiking,Snowboarding");
        Jacket jacketTwo = new Jacket("Parka", "Wool", "Black", true, "Leisure");
        Jacket jacketThree = new Jacket("North Face", "Cotton/Synthetic", "Hot Pink", false, "Hiking,Leisure");
        Collections.addAll(myJackets, jacketOne.jArray(), jacketTwo.jArray(), jacketThree.jArray());

        Shirt shirtOne = new Shirt("Button", "Synthetic Blend", "Blue", "Long-Sleeve");
        Shirt shirtTwo = new Shirt("Polo", "Polyester", "White", "Short-Sleeve");
        Shirt shirtThree = new Shirt("Active Wear", "Lycra", "Black", "Short-Sleeve");
        Collections.addAll(myShirts, shirtOne.sArray(), shirtTwo.sArray(), shirtThree.sArray());

        Shoes shoesOne = new Shoes("Running", "Blue", false);
        Shoes shoesTwo = new Shoes("Dress", "Black", false);
        Shoes shoesThree = new Shoes("Flip Flop", "Green", false);
        Collections.addAll(myShoes, shoesOne.shArray(), shoesTwo.shArray(), shoesThree.shArray());

        Pants pantsOne = new Pants("Cotton", "Black", "Dress", "Long");
        Pants pantsTwo = new Pants("Synthetic", "Yellow", "Active Wear", "Short");
        Pants pantsThree = new Pants("Fabric Blend", "Brown", "Hiking", "Long");
        Collections.addAll(myPants, pantsOne.pArray(), pantsTwo.pArray(), pantsThree.pArray());

    }

//    public void addItemsArray(Jacket type, Jacket material, Jacket color, Jacket waterProof, Jacket activity){
//        Jacket shirt = new Jacket;
//        Collections.addAll(myJackets,);
//
//    }






    @Override
    public String toString(){

        return myJackets.toString() + myPants + myShirts + myShoes;
    }















    /************getters/setters**************/

    public ArrayList<ArrayList> getMyJackets() {
        return myJackets;
    }

    public void setMyJackets(ArrayList<ArrayList> myJackets) {
        this.myJackets = myJackets;
    }

    public ArrayList<ArrayList> getMyShirts() {
        return myShirts;
    }

    public void setMyShirts(ArrayList<ArrayList> myShirts) {
        this.myShirts = myShirts;
    }

    public ArrayList<ArrayList> getMyPants() {
        return myPants;
    }

    public void setMyPants(ArrayList<ArrayList> myPants) {
        this.myPants = myPants;
    }

    public ArrayList<ArrayList> getMyShoes() {
        return myShoes;
    }

    public void setMyShoes(ArrayList<ArrayList> myShoes) {
        this.myShoes = myShoes;
    }
}