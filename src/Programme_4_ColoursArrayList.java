import java.util.ArrayList;

public class Programme_4_ColoursArrayList {
    public static void main(String[] args) {
        ArrayList<String> colorsList = new ArrayList<>();
        colorsList.add("Red");
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Yellow");
        colorsList.add("Black");
        colorsList.add("White");
        colorsList.add("Orange");
        colorsList.add("Purple");
        colorsList.add("Cyan");

        for (String colourList : colorsList){
            System.out.println(colourList + ",");
        }
    }
}
