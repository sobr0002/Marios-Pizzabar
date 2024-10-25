import java.util.ArrayList;

public class Pizza extends MenuItem{

    private int itemNumber;
    private float price;
    private String name;
    private ArrayList<String> ingredients;

    public Pizza(int itemNumber, float price, String name, int... ingredientsIndex){
        super(itemNumber, price, name);

        ingredients = new ArrayList<>();
        for(int index : ingredientsIndex){
            if (index >= 0 && index < Ingredients.ingredientsList.length){
                ingredients.add(Ingredients.ingredientsList[index]);
            }
        }
    }

    public void displayIngredients(){
        System.out.println("Ingredients: " + ingredients);
    }
}
