package com.example.tdd_java.parameterized;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeasonTest {
    @Test
    public void testGetSeason() {
        Season season = new Season();
        assertEquals("春", season.getSeason(3));
        assertEquals("春", season.getSeason(4));
        assertEquals("春", season.getSeason(5));
        assertEquals("夏", season.getSeason(6));
        assertEquals("夏", season.getSeason(7));
        assertEquals("夏", season.getSeason(8));
        assertEquals("秋", season.getSeason(9));
        assertEquals("秋", season.getSeason(10));
        assertEquals("秋", season.getSeason(11));
        assertEquals("冬", season.getSeason(12));
        assertEquals("冬", season.getSeason(1));
        assertEquals("冬", season.getSeason(2));
        assertEquals("不正な値です", season.getSeason(0));
        assertEquals("不正な値です", season.getSeason(13));
    }
}