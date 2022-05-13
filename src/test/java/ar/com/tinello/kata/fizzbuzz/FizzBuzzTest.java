package ar.com.tinello.kata.fizzbuzz;

import org.assertj.core.api.SoftAssertions;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;
    String result;
    int playNumber;

    @Before
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void play_1_return_1() {
        // given
        given_a_play_number_1();
        // when
        when_play(playNumber);
        // Then
        final SoftAssertions softly = new SoftAssertions();
        softly.assertThat(result).isEqualTo("1");
        softly.assertThat(result).isEqualTo("1");
        softly.assertThat(result).isEqualTo("2");
        softly.assertThat(result).isEqualTo("1");
        softly.assertThat(result).isEqualTo("3");
        softly.assertAll();

    }

    private void given_a_play_number_1() {
        playNumber = 1;
    }

    private void when_play(int playNumber) {
        result  = play(playNumber);
    }

    private String play(int playNumber) {
        return fizzBuzz.play(playNumber);
    }

    @Test
    public void play_2_return_2() {
        final int playNumber = 2;
        final String result = play(playNumber);
        assertThat(result).isEqualTo("2");
    }

    @Test
    public void play_3_return_FIZZ() {
        final int playNumber = 3;
        final String result = play(playNumber);
        assertThat(result).isEqualTo("FIZZ");
    }

    @Test
    public void play_5_return_BUZZ() {
        final int playNumber = 5;
        final String result = play(playNumber);
        assertThat(result).isEqualTo("BUZZ");
    }

    @Test
    public void play_6_return_FIZZ() {
        final int playNumber = 6;
        final String result = play(playNumber);
        assertThat(result).isEqualTo("FIZZ");
    }

    @Test
    public void play_10_return_BUZZ() {
        final int playNumber = 10;
        final String result = play(playNumber);
        assertThat(result).isEqualTo("BUZZ");
    }

    @Test
    public void play_15_return_FIZZBUZZ() {
        final int playNumber = 15;
        final String result = play(playNumber);
        assertThat(result).isEqualTo("FIZZBUZZ");
    }

}
