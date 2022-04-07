package Logicadeprogramacao;

public class SalaryPercentage2 {
    public static void main(String[] args) {

        double salary = 5000;
        double firstPercentage = 30;
        double secondPercentage = 15;
        double thirdPercentage = 5;

        double resultePercentage = salary * firstPercentage / 100;
        System.out.println("30% = " + resultePercentage);

        resultePercentage = salary * secondPercentage /100;
        System.out.println("15% = " + resultePercentage);

        resultePercentage = salary * thirdPercentage /100;
        System.out.println("5% = " + resultePercentage);

    }
}
