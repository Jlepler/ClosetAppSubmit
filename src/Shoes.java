import java.util.*;

public class Shoes {

    private String type;
    private String color;
    private Boolean waterproof;

    public Shoes (){
    }

    public Shoes(String type, String color, Boolean waterproof) {
        this.type = type;
        this.color = color;
        this.waterproof = waterproof;
    }

    //Places attributes into array
    public ArrayList shArray() {

        ArrayList<String> shoeArray = new ArrayList<>();
        List<String> tempList = new ArrayList<String>(Arrays.asList(type, color, waterproof.toString().replaceAll("false","Not waterproof").replaceAll("true","Waterproof")));
        shoeArray.addAll(tempList);
        return shoeArray;
    }

    /*********getters/setters************/

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getWaterproof() {
        return waterproof;
    }

    public void setWaterproof(Boolean waterproof) {
        this.waterproof = waterproof;
    }
}