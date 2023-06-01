package com.example.tdd_java.parameterized;

public class Season {
    public String getSeason(int month) {
        // 3~5月は春、6~8月は夏、9~11月は秋、12~2月は冬
        if (month >= 3 && month <= 5) {
            return "春";
        } else if (month >= 6 && month <= 8) {
            return "夏";
        } else if (month >= 9 && month <= 11) {
            return "秋";
        } else if (month == 12 || month == 1 || month == 2) {
            return "冬";
        } else {
            return "不正な値です";
        }
    }
}
