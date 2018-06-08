public class AreaCalculator {

    public static void main(String[] args) {


    }   //end of main

    public static double area(double radius){
        if (radius >= 0.0){
            return radius * radius * 3.14159;
        } else {
            return -1.0;
        }
    }   //end of area

    public static double area(double x, double y){
        if (x >= 0.0 && y >= 0.0){
            return x * y;
        } else {
            return -1.0;
        }
    }   //end of area
}   //end of classdef
