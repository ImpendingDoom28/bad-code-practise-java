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
    public void testAddIngredientOnCheese() throws PizzaException {
        pizza.addIngredient(cheese, 1);
        int result = pizza.getIngredients().get(cheese);
        assertEquals(1, result);
    }

    @Test
    public void testRemoveIngredientOnCheese() throws PizzaException {
        Ingredient cheese = new Ingredient("Cheese");
        pizza.removeIngredient(cheese, 1);
        Integer result = pizza.getIngredients().get(cheese);
        assertNull(result);
    }
}
