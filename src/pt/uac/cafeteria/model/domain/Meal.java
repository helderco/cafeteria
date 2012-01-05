
package pt.uac.cafeteria.model.domain;

import java.util.Calendar;

/**
 * Meal that can be bought for a certain day, at lunch or dinner,
 * and of a choice of main course types (meat, fish or vegetarian).
 */
public class Meal implements java.io.Serializable {

    /** Serialization version. */
    private static final long serialVersionUID = 1L;

    /** Enumerates meal time of day. */
    public enum Time {
        LUNCH  { @Override public String toString() { return "Almoco"; } },
        DINNER { @Override public String toString() { return "Jantar"; } };
    }

    /** Enumerates dish types. */
    public enum Type {
        MEAT  { @Override public String toString() { return "Carne"; } },
        FISH { @Override public String toString() { return "Peixe"; } },
        VEGETARIAN { @Override public String toString() { return "Vegetariano"; } };
    }

    /** The day the meal is served. */
    private final Calendar day;

    /** The time of day the meal is served. */
    private final Time time;

    /** Type of meal. */
    private final Type type;

    /** The name of the soup. */
    private final String soup;

    /** The name of the main course dish. */
    private final String mainCourse;

    /** The name of the dessert. */
    private final String dessert;

    /**
     * Creates a new <code>Meal</code> instance.
     *
     * @param day the day of the meal.
     * @param time the time of day.
     * @param type the type of meal.
     * @param soup the name of the soup.
     * @param mainCourse the name of the main course dish.
     * @param dessert the name of the dessert.
     */
    public Meal(Calendar day, Time time, Type type, String soup, String mainCourse, String dessert) {
        this.day = day;
        this.time = time;
        this.type = type;
        this.soup = soup;
        this.mainCourse = mainCourse;
        this.dessert = dessert;
    }

    /** Gets the day of the meal. */
    public Calendar getDay() {
        return this.day;
    }

    /** Gets the time of the day (lunch or dinner). */
    public Time getTime() {
        return this.time;
    }

    /** Gets the type of the meal. */
    public Type getType() {
        return this.type;
    }

    /** Gets the name of the soup. */
    public String getSoup() {
        return this.soup;
    }

    /** Gets the name of the main course dish. */
    public String getMainCourse() {
        return this.mainCourse;
    }

    /** Gets the name of the dessert. */
    public String getDessert() {
        return this.dessert;
    }
}