package com.example.fizz_buzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,         1",
            "2,         2",
            "3,      Fizz",
            "4,         4",
            "5,      Buzz",
            "6,      Fizz",
            "9,      Fizz",
            "10,     Buzz",
            "15, FizzBuzz",
            "18,     Fizz",
            "20,     Buzz",
            "30, FizzBuzz",
    })
    void test_fizzBuzz(int input, String output) {
        String result = FizzBuzz.execute(input);
        assertThat(result, is(output));
    }
}