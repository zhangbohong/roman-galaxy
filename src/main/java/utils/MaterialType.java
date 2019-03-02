package utils;

import java.util.Arrays;

public enum MaterialType {
    Silver("Silver"), Gold("Gold"), Iron("Iron");

    String material;

    MaterialType(String material) {

    }

    public String getMaterial() {
        return material;
    }

    public static Boolean contains(String name) {
        for (MaterialType type : MaterialType.values()) {
            if (type.name().equals(name))
                return true;
        }
        return false;
    }

    public static MaterialType findAny(String string) {
        return Arrays.stream(MaterialType.values())
                .filter(s -> s.name().equals(string))
                .findAny().orElse(null);
    }

}
