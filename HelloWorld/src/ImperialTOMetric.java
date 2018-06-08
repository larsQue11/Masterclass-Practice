public class ImperialTOMetric {

    public static void main(String[] args) {
        System.out.println(calcFeetAndInchesToCentimeters(8,4));
        System.out.println(calcFeetAndInchesToCentimeters(100));
        System.out.println(calcFeetAndInchesToCentimeters(6,0));
        System.out.println(calcFeetAndInchesToCentimeters(0,13));


    }   //end of psvm

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet >= 0 && (inches >= 0 && inches < 12 )){
            double centi = 2.54 * ((feet * 12) + inches);
            return centi;
        } else {
            return -1;
        }
    } //end

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches >= 0){
            int tempFeet = inches / 12;
            int tempInches = inches % 12;
            return calcFeetAndInchesToCentimeters(tempFeet,tempInches);
        } else {
            return -1;
        }
    }

}
