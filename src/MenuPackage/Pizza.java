package MenuPackage;

import java.util.ArrayList;

public class Pizza extends MenuItem{

    private ArrayList<String> ingredients;

    public Pizza(int itemNumber, float price, String name, int... ingredientsIndex){
        super(itemNumber, price, name);

        //Tildeler ingredients et tomt ArrayListe
        ingredients = new ArrayList<>();

        for(int index : ingredientsIndex){
            if (index >= 0 && index < Ingredients.ingredientsList.length){
                ingredients.add(Ingredients.ingredientsList[index]);
            }
        }
        //Hver gang Pizza-klassen instantieres, tilføjes objektet til "menuItems" fra "Menu"-klassen
        Menu.addMenuItem(this);
    }

    @Override
    public void displayIngredients(){
        System.out.print(ingredients);
    }
    
    
    public ArrayList<String> getIngredients(){
        return ingredients;
    }
}
