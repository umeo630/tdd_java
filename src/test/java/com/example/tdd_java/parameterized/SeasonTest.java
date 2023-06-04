package com.example.tdd_java.parameterized;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("季節を判定するクラス")
class SeasonTest {
    Season season;
    @BeforeEach
    public void setUp() {
        season = new Season();
    }

    @DisplayName("3~5月の場合、春を返すか")
    @Test
    public void testGetSeasonReturnsSpringForMarchToMay() {
        assertEquals("春", season.getSeason(3));
        assertEquals("春", season.getSeason(4));
        assertEquals("春", season.getSeason(5));
    }

    @DisplayName("6~8月の場合、夏を返すか")
    @Test
    public void testGetSeasonReturnsSummerForJuneToAugust() {
        assertEquals("夏", season.getSeason(6));
        assertEquals("夏", season.getSeason(7));
        assertEquals("夏", season.getSeason(8));
    }

    @DisplayName("9~11月の場合、秋を返すか")
    @Test
    public void testGetSeasonReturnsAutumnForSeptemberToNovember() {
        assertEquals("秋", season.getSeason(9));
        assertEquals("秋", season.getSeason(10));
        assertEquals("秋", season.getSeason(11));
    }

    @DisplayName("12~2月の場合、冬を返すか")
    @Test
    public void testGetSeasonReturnsWinterForDecemberToFebruary() {
        assertEquals("冬", season.getSeason(12));
        assertEquals("冬", season.getSeason(1));
        assertEquals("冬", season.getSeason(2));
    }

    @DisplayName("不正な値の場合、`不正な値です`を返すか")
    @Test
    public void testGetSeasonReturnsInvalidValueForInvalidValue() {
        assertEquals("不正な値です", season.getSeason(0));
        assertEquals("不正な値です", season.getSeason(13));
    }
}