package encapsulation.zad2.model;

public enum AgeRequired {
    SIXTEEN(16);

    private int value;

    AgeRequired(int value) {
        this.value = value;
    }

    public int getDescription() {
        return value;
    }
}

