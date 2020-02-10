package io.toolisticon.githubactions.example;

import io.toolisticon.githubactions.RandomUtility;

/**
 * Example client.
 */
public class ExampleClient {

    /**
     * Starts the program.
     * @param args CLI params.
     */
    public static void main(String[] args) {
        System.out.println(new ExampleClient().getRandomNumberMessage());
    }

    /**
     * Retrieves the message printed to console.
     * @return string message.
     */
    public String getRandomNumberMessage() {
        return String.format("Random number is %d", RandomUtility.getRandomNumber());
    }
}
