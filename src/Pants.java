import java.util.ArrayList;
import java.util.*;

public class Pants {

    private String material;
    private String color;
    private String activity;
    private String length;

    public Pants(){
    }

    public Pants(String material, String color, String activity, String length) {
        this.material = material;
        this.color = color;
        this.activity = activity;
        this.length = length;
    }

    //Places attributes into array
    public ArrayList pArray() {

        ArrayList<String> pantArray = new ArrayList<>();
        List<String> tempList = new ArrayList<String>(Arrays.asList(material, color, activity, length.toString()));
        pantArray.addAll(tempList);
        return pantArray;
    }

    @Override
    public String toString() {
        return material + ", " + color + ", " + activity + ", " + length;
    }




    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}