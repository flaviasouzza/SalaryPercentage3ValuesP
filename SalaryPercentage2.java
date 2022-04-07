package Logicadeprogramacao;

public class SalaryPercentage2 {
    public static void main(String[] args) {

        double salary = 5000;
        double firstpercentage = 30;
        double secondpercentage = 15;
        double thirdpercentage = 5;

        double resultepercentage = salary * firstpercentage / 100;
        System.out.println("30% = " + resultepercentage);

        resultepercentage = salary * secondpercentage /100;
        System.out.println("15% = " + resultepercentage);

        resultepercentage = salary * thirdpercentage /100;
        System.out.println("5% = " + resultepercentage);

    }
}
