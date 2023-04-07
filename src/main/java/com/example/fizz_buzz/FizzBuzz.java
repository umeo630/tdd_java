package com.example.fizz_buzz;

class FizzBuzz {
    static String execute(int i){
        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(i);
    }

    public static void main(String[] args){
        int input = Integer.parseInt(args[0]);
        FizzBuzz.execute(1);
        System.out.println();
    }
}