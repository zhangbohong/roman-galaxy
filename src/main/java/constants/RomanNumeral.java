package constants;

public enum RomanNumeral {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    Integer value;

    RomanNumeral(int theValue) {
        this.value = theValue;
    }

    public int getValue() {
        return value;
    }


    public static boolean contains(String numeral) {
        for (RomanNumeral romanNumeral : RomanNumeral.values()) {
            if (romanNumeral.name().equals(numeral)) {
                return true;
            }
        }
        return false;
    }
}
