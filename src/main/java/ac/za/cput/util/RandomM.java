package ac.za.cput.util;

import java.util.UUID;

public class RandomM {

    public static String generateId() {
        return java.util.UUID.randomUUID().toString();
    }
}
