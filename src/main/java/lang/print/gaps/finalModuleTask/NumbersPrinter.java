package lang.print.gaps.finalModuleTask;

public class NumbersPrinter {
    public void printIsPositive(int number) {
        if (number>0){
            System.out.println(true);
        }else if (number<1) {
            System.out.println(false);
        }else {
            System.out.println("?");
        }
    }
}
