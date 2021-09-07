package accessspecifiers.zad1.logic;

public enum Shift {
    ADD_X("RIGHT"), MINUS_X("LEFT"), ADD_Y("UP"), MINUS_Y("DOWN");

    private final String description;

    Shift(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Shift shiftFromDescription(String description) {
        if (description.isBlank() || description.isEmpty()) {
            throw new IllegalArgumentException("Description is invalid");
        }
        Shift[] values = values();
        for (Shift shift : values) {
            if (shift.getDescription().equals(description)) {
                return shift;
            }
        }
        return null;
    }
}
