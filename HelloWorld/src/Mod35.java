public class Mod35 {
    public static void main(String[] args) {

        int count = 0, sum = 0;

        for(int i=1; i<=100; i++){
            if((i%3 == 0) && (i%5 == 0)){
                System.out.println("This number is divisible by 3 and 5 " + i);
                count++;
                sum += i;
            }

            if(count == 5)
                break;
        }

        System.out.println("The sum of Mod35 numbers is " + sum);
    }
}
