public class ForLoopStatement {
    public static void main(String[] args) {

        double salary = 100.00;

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateMethod(salary, rate);
            System.out.println("Interest of " + (salary) + " at " + rate + "% is " + interestAmount);

        }
    }

    public static double calculateMethod(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
