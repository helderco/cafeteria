
package pt.uac.cafeteria.model.domain;

import java.util.List;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import org.junit.Test;
import static org.junit.Assert.*;

public class MenuTest {

    private final Calendar day = new GregorianCalendar(2011, 11, 11);
    private final Meal.Time time = Meal.Time.DINNER;

    private final String soup = "Vegetables";
    private final String dessert = "Cake";

    private Menu createMenu() {
        return new Menu.Builder(day, time)
                .setMeatCourse("Pork")
                .setFishCourse("Tuna")
                .setVeggieCourse("Soy")
                .setSoupAndDessert(soup, dessert)
                .build();
    }

    @Test
    public void canCreateMenu() {
        Menu menu = createMenu();

        Meal meat_expected = new Meal(day, time, Meal.Type.MEAT, soup, "Pork", dessert);
        Meal fish_expected = new Meal(day, time, Meal.Type.FISH, soup, "Tuna", dessert);
        Meal veggie_expected = new Meal(day, time, Meal.Type.VEGETARIAN, soup, "Soy", dessert);

        Meal meat_actual = menu.getMeatMeal();
        Meal fish_actual = menu.getFishMeal();
        Meal veggie_actual = menu.getVeggieMeal();

        assertEquals("menu must generate correct meat meal", meat_expected, meat_actual);
        assertEquals("menu must generate correct fish meal", fish_expected, fish_actual);
        assertEquals("menu must generate correct veggie meal", veggie_expected, veggie_actual);
    }

    @Test(expected=IllegalStateException.class)
    public void mustHaveMainCourse() {
        new Menu.Builder(day, time)
                .setSoupAndDessert(soup, dessert)
                .build();
    }

    @Test(expected=IllegalStateException.class)
    public void mustHaveSoupAndDessert() {
        new Menu.Builder(day, time)
                .setMeatCourse("Pork")
                .build();
    }

    @Test
    public void canGetChoices() {
        Menu menu = createMenu();

        List<String[]> expected = Arrays.asList(new String[][] {
            {Meal.Type.MEAT.toString(), "Pork"},
            {Meal.Type.FISH.toString(), "Tuna"},
            {Meal.Type.VEGETARIAN.toString(), "Soy"}
        });

        assertEquals(expected, menu.getMainCourses());
    }
}