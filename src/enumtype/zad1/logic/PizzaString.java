package enumtype.zad1.logic;

public enum PizzaString {
    MARGHERITA("sos pomidorowy + ser"),
    CAPRICIOSA("sos pomidorowy + ser + pieczarki"),
    PROSCIUTTO ("sos pomidorowy + ser + szynka");


    private String description;

    PizzaString(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + " (" + description + ").";
    }
}
