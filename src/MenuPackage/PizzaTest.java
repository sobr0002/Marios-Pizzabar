package MenuPackage;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaTest {

    @BeforeAll
    public static void setUpIngredients() {
        // Laver en array af Strings, der indeholder ingredienser.
        String[] ingredientsList = new String[]{"Cheese", "Tomato", "Pepperoni", "Mushroom", "Onion"};
    }

    @Test
    public void testPizzaInitialization() {
        //Opretter objekt af pizza og tester at itemNumber, price og name er korrekte

        Pizza pizza = new Pizza(1, 9.99f, "Margherita");

        assertEquals(1, pizza.getItemNumber());
        assertEquals(9.99f, pizza.getPrice());
        assertEquals("Margherita", pizza.getName());
    }

    @Test
    public void testPizzaWithValidIngredientsIndices() {
        // Tester at alle ingredienser er korrekte
        Pizza pizza = new Pizza(2, 12.99f, "Veggie Special", 0, 1, 3); // Cheese, Tomato, Mushroom
        ArrayList<String> ingredients = pizza.getIngredients();

        assertEquals(3, ingredients.size());
        assertTrue(ingredients.contains("Cheese"));
        assertTrue(ingredients.contains("Tomato"));
        assertTrue(ingredients.contains("Mushroom"));
    }

    @Test
    public void testPizzaWithInvalidIngredientsIndices() {
        // Tester med indexes der er invalid
        Pizza pizza = new Pizza(3, 14.99f, "Custom Pizza", 0, 5, -1); // Cheese, invalid index, invalid index
        ArrayList<String> ingredients = pizza.getIngredients();

        assertEquals(1, ingredients.size());
        assertTrue(ingredients.contains("Cheese"));
    }
    

    @Test
    public void testDisplayIngredients() {
        Pizza pizza = new Pizza(5, 11.99f, "Mixed", 0, 2, 4); // Cheese, Pepperoni, Onion
        String expectedOutput = "Menu.Ingredients: [Cheese, Pepperoni, Onion]";

        assertEquals(expectedOutput, pizza.displayIngredients());
    }
}