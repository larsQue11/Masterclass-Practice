public class FirstLastDigitSum {

    public static void main(String[] args) {
//        System.out.println("252 should be 4: " + sumFirstAndLastDigit(252));
//        System.out.println("257 should be 9: " + sumFirstAndLastDigit(257));
//        System.out.println("0 should be 0: " + sumFirstAndLastDigit(0));
//        System.out.println("5 should be 10: " + sumFirstAndLastDigit(5));
        System.out.println("-10 should be -1: " + sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number){

        int sum = number % 10;

        if (number < 10 && number >= 0)
            return sum * 2;

        if (number >= 10){
            int digit = 0;

            while (number >= 10){
                sum -= digit;
                number /= 10;
                digit = number % 10;
                sum += digit;
            }
            return sum;
        }   //endif

        else
            return -1;

    }

}
