public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(-125));
        System.out.println(sumDigits(4));
        System.out.println(sumDigits(32123));

    }   //end main

    public static int sumDigits(int number){

        int sum = 0;
        if (number >= 10){

            while(number >= 1){
                int digit = number % 10;
                sum += digit;
                number = number / 10;
            }

            return sum;

        }   //endif

        if (number <= 10 && number >= 0){
            return number;
        }

        else
            return -1;
    }   //end sumDigits

}   //end classdef
