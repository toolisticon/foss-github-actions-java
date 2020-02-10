package io.toolisticon.githubactions;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RandomUtilityTest {

    @Test
    public void should_deliver_a_number() {
        Long randomNumber = RandomUtility.getRandomNumber();
        assertThat(randomNumber).isNotNull();
    }

    @Test
    public void should_deliver_different_numbers() {
        Long randomNumber = RandomUtility.getRandomNumber();
        Long anotherRandomNumber = RandomUtility.getRandomNumber();
        assertThat(randomNumber).isNotEqualTo(anotherRandomNumber);
    }

}
