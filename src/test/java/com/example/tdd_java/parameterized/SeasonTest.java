package com.example.tdd_java.parameterized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("季節を判定するクラス")
class SeasonTest {
    Season season;
    @BeforeEach
    public void setUp() {
        season = new Season();
    }

    @DisplayName("3~5月の場合、春を返すか")
    @ParameterizedTest
    @ValueSource(ints = {3, 4, 5})
    public void testGetSeasonReturnsSpringForMarchToMay(int month) {
        assertEquals("春", season.getSeason(month));
    }

    @DisplayName("6~8月の場合、夏を返すか")
    @ParameterizedTest
    @ValueSource(ints = {6, 7, 8})
    public void testGetSeasonReturnsSummerForJuneToAugust(int month) {
        assertEquals("夏", season.getSeason(month));
    }

    @DisplayName("9~11月の場合、秋を返すか")
    @ParameterizedTest
    @ValueSource(ints = {9, 10, 11})
    public void testGetSeasonReturnsAutumnForSeptemberToNovember(int month) {
        assertEquals("秋", season.getSeason(month));
    }

    @DisplayName("12~2月の場合、冬を返すか")
    @ParameterizedTest
    @ValueSource(ints = {12, 1, 2})
    public void testGetSeasonReturnsWinterForDecemberToFebruary(int month) {
        assertEquals("冬", season.getSeason(month));
    }

    @DisplayName("不正な値の場合、`不正な値です`を返すか")
    @ParameterizedTest
    @ValueSource(ints = {0, 13})
    public void testGetSeasonReturnsInvalidValueForInvalidValue(int month) {
        assertEquals("不正な値です", season.getSeason(month));
    }
}