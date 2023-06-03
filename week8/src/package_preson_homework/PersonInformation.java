package package_preson_homework;

public class PersonInformation {
    public String name;

    public int age;

    public int car;

    public boolean violations;

    public double creditScore;

    public void display() {
        System.out.println("Your name: " +name);
        System.out.println("Your Age: " +age);
        System.out.println("Your Car: " +car);
        System.out.println("Your Violations: " +violations);
        System.out.println("Your Credit Score: " +creditScore);
    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {
        if (car > 2010) {
            adjustedRate = 300;
        } else {
            adjustedRate = 100;
        }
        return adjustedRate;
    }
}
