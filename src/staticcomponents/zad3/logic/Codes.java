package staticcomponents.zad3.logic;

public enum Codes {
    ALL_OK(100),
    ERROR_CHECK_ENGINE(200),
    ERROR_NO_FUEL(300),
    WARNING_FUEL_FLAP_OPEN(400),
    WARNING_DOORS_OPEN(500);


    private int value;

    Codes(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
