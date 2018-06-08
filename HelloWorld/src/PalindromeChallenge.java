public class PalindromeChallenge {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1234554321));
    }   //end main

    public static boolean isPalindrome (int number){

        if (number < 0)
            number *= -1;

        int digit = 0, reverse = 0, tempNumber = number;

        while (tempNumber >= 1){
            reverse *= 10;
            digit = tempNumber % 10;
            reverse += digit;
            tempNumber /= 10;
        }

        if ( number == reverse) {
            return true;
        }
        else {
            return false;
        }
    }

}   //end classdef
