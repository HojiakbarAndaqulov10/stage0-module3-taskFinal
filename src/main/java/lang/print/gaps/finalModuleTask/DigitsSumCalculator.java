package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int sum=0;
        for (int i = number; i !=0; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println(sum);
    }
}
