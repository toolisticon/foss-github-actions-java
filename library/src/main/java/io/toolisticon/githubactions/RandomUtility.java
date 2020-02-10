package io.toolisticon.githubactions;

import java.util.Random;

/**
 * Example utility with useful methods.
 */
public class RandomUtility {
    /**
     * Returns a random number.
     *
     * @return random number.
     */
    public static Long getRandomNumber() {
        return new Random().nextLong();
    }
}
