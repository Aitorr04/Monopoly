package edu.ncsu.monopoly;

import java.security.SecureRandom;

public class Die {
    private static final SecureRandom random = new SecureRandom();

    public int getRoll() {
        return random.nextInt(6) + 1;
    }
}