package test;

import model.Ingredient;
import model.Pizza;
import model.PizzaException;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaTest {

    private static Pizza pizza;
    private static Ingredient cheese;

    @BeforeClass
    public static void setUp() {
        pizza = new Pizza();
        cheese = new Ingredient("Cheese");
    }

    @Test
    public void testAddIngredientOnCheese() {
        try {
            pizza.addIngredient(cheese, 1);
        } catch (PizzaException e) {
            e.printStackTrace();
        }
        int result = pizza.getIngredients().get(cheese);
        assertEquals(1, result);
    }

    @Test
    public void testRemoveIngredientOnCheese() {
        Ingredient cheese = new Ingredient("Cheese");
        try {
            pizza.removeIngredient(cheese, 1);
        } catch (PizzaException e) {
            e.printStackTrace();
        }
        Integer result = pizza.getIngredients().get(cheese);
        assertNull(result);
    }
}
