public class SumOddRange {

    public static boolean isOdd(int n){
        if (n > 0){
            if (n%2 != 0){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        int sum = 0;

        if ((end >= start) && ((start > 0) && (end > 0))){
            for(int i=start; i<=end; i++){
                if(isOdd(i))
                    sum += i;
            }
            return sum;
        } else
            return -1;
    }

    public static void main(String[] args) {
        System.out.println(isOdd(0));
        System.out.println(isOdd(1));
        System.out.println(isOdd(2));
        System.out.println(isOdd(3));

        System.out.println(sumOdd(1,100));
        System.out.println(sumOdd(-1,100));
        System.out.println(sumOdd(100,100));
        System.out.println(sumOdd(100,-100));
        System.out.println(sumOdd(100,1000));


    }

}
