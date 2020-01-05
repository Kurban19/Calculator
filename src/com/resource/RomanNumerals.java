package com.resource;


public class RomanNumerals {
    private int num;

    private static int[] numbers = {1000, 900, 500, 400, 100, 90,
            50, 40, 10, 9, 5, 4, 1};

    private static String[] letters = {"M", "CM", "D", "CD", "C", "XC",
            "L", "XL", "X", "IX", "V", "IV", "I"};

    public RomanNumerals(String roman) {

        if (roman.length() == 0)
            throw new NumberFormatException("Вы ввели пустую строку");

        if(Character.isDigit(roman.charAt(0))){
            throw new IllegalArgumentException();
        }


        roman = roman.toUpperCase();

        int i = 0;
        int arabic = 0;

        while (i < roman.length()) {

            char letter = roman.charAt(i);
            int number = letterToNumber(letter);

            if (number < 0)
                break;

            i++;

            if (i == roman.length()) {
                arabic += number;
            } else {
                int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) {
                    arabic += (nextNumber - number);
                    i++;
                } else {
                    arabic += number;
                }
            }

        }

        if (arabic > 3999)
            throw new NumberFormatException("Больше 4000");

        num = arabic;

    }
    public RomanNumerals(String roman, int start) {

        if (roman.length() == 0)
            throw new NumberFormatException("Вы ввели пустую строку");


        if(Character.isDigit(roman.charAt(3))){
            throw new IllegalArgumentException();
        }


        roman = roman.toUpperCase();

        int i = start;
        int arabic = 0;

        while (i < roman.length()) {

            char letter = roman.charAt(i);
            int number = letterToNumber(letter);

            if (number < 0)
                break;

            i++;

            if (i == roman.length()) {
                arabic += number;
            } else {
                int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) {
                    arabic += (nextNumber - number);
                    i++;
                } else {
                    arabic += number;
                }
            }

        }

        if (arabic > 3999)
            throw new NumberFormatException("Больше 4000");

        num = arabic;

    }


    private int letterToNumber(char letter) {
        switch (letter) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }
    public int length(){
        String roman = "";
        int N = num;
        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman += letters[i];
                N -= numbers[i];
            }
        }
        return roman.length();
    }
        public String toString () {
            String roman = "";
            int N = num;
            for (int i = 0; i < numbers.length; i++) {
                while (N >= numbers[i]) {
                    roman += letters[i];
                    N -= numbers[i];
                }
            }
            return roman;
        }
        public int toInt(){
            return num;
        }
    public boolean isNumber(String str) {
        if (str == null || str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) return false;
        }
        return true;
    }
}


