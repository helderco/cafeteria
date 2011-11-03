
package pt.uac.cafeteria.model;

import java.util.Calendar;

/**
 *
 * Represents a debit transaction
 *
 */

public class Debit extends Transaction {

    /** Enumerated type with the type of a meal */
    public enum MealType {
        LUNCH  { @Override public String toString() { return "Lunch"; } },
        DINNER { @Override public String toString() { return "Dinner"; } };
    }
    /** The date of the meal */
    private Calendar mealDate;

    /** The type of the meal */
    private MealType mealType;

    /**
     * Default Constructor
     *
     * @param mealDate  the date that is defined as the date of the meal
     * @param mealType  the type of the meal that is defined
     */
    public Debit(Calendar mealDate, MealType mealType) {
        super.setDate(Calendar.getInstance());
        this.mealDate = mealDate;
        this.mealType = mealType;
    }

    /** Returns the date of the meal */
    public Calendar getMealDate() {
        return mealDate;
    }

    /** Returns the type of the meal */
    public MealType getMealType() {
        return mealType;
    }
}