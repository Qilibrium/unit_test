import java.util.Scanner;

public class SumCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PUT IN THE NUMBER:");
        System.out.println("SUM OF  NUMBERS = " + new SumCalculator().sum(scanner.nextInt()));

    }

    public  int sum(int n) {
        if(n<=0){
            throw new IllegalArgumentException("Input should be >=0");
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }


}


