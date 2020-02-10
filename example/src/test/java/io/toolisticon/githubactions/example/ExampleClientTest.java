package io.toolisticon.githubactions.example;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Tests the integration.
 */
public class ExampleClientTest {

    private ExampleClient client;

    @Before
    public void setup() {
        client = new ExampleClient();
    }

    @Test
    public void getRandomNumberMessage() {
        assertThat(client.getRandomNumberMessage()).startsWith("Random number is ");
    }
}