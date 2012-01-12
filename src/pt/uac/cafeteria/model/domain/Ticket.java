
package pt.uac.cafeteria.model.domain;

/**
 * A type of transaction used when a student buys a meal ticket.
 */
public class Ticket extends Transaction {

    /** Serialization version. */
    private static final long serialVersionUID = 1L;

    /** The meal being bought. */
    private final Meal meal;

    /**
     * Creates a new Ticket instance.
     *
     * @param meal the meal being bought.
     * @param price the total price of the meal.
     */
    public Ticket(Meal meal, double price) {
        super(price);
        this.meal = meal;
    }

    /** Gets the meal bought. */
    public Meal getMeal() {
        return meal;
    }

    @Override
    public String toString() {
        return "\n    Ticket {"
            + "\n      date = " + getDate()
            + "\n      amount = " + getAmount()
            + "\n      meal = " + getMeal()
            + "\n    }";
    }
    
    @Override
    public String print() {
        return "Senha           " + getDate() +
                "          " + getAmount() +
                "€          " + getMeal().getTime() +
                "          " + getMeal().getType();
    }
}
