public class CountNUm {
    public static void main(String[] args) {
        System.out.println( "Counting occurences of a digit in a number");
        int n = 219382;
        int count = 0;
        while (n>0){
            int rem = n % 10;
            if ( rem == 2){
                count++;
            }
            n = n / 10 ;
        }
        System.out.println(count);
    }
}
