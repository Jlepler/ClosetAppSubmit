import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shirt {

    private String material;
    private String color;
    private String type;
    private String length;

    public Shirt(){
    }

    public Shirt(String type, String material, String color, String length) {
        this.type = type;
        this.material = material;
        this.color = color;
        this.length = length;
    }

    //Places attributes into array
    public ArrayList sArray() {

        ArrayList<String> shirtArray = new ArrayList<>();
        List<String> tempList = new ArrayList<String>(Arrays.asList(type, material, color, length.toString()));
        shirtArray.addAll(tempList);
        return shirtArray;
    }

    /*******getters/setters******/

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

    public String getType() {
        return type;
    }

    public void setType(String activity) {
        this.type = type;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }
}