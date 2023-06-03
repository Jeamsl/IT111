package package_preson_homework;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[] args) {
        Scanner yourInformation = new Scanner(System.in);
        PersonInformation firstPerson;
        PersonInformation secondPerson;
        PersonInformation thirdPerson;

        firstPerson = new PersonInformation();
        secondPerson = new PersonInformation();
        thirdPerson = new PersonInformation();

        firstPerson.name = "Cathy Jones";
        firstPerson.age = 33;
        firstPerson.car = 2010;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall Black";
        secondPerson.age = 22;
        secondPerson.car = 2019;
        secondPerson.violations = true;
        secondPerson.creditScore = 570;

        double monthlyRate = 0;
        double adjustedRate = 0;

        System.out.println();
        firstPerson.display();
        System.out.println(firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate) +" dollars");
        System.out.println();

        secondPerson.display();
        System.out.println(secondPerson.getRate(monthlyRate) + secondPerson.assumeGender(adjustedRate) +" dollars");
        System.out.println();

        System.out.println("*****************************************************************************************");
        System.out.println("Do you want to enter information to check rates(yes/no): ");
        String data = yourInformation.next();
        if (data.equals("yes")) {
            System.out.println("Please enter your name: ");
            thirdPerson.name = yourInformation.next();
            System.out.println("Please enter your age: ");
            thirdPerson.age = yourInformation.nextInt();
            System.out.println("Please enter the year of your car: ");
            thirdPerson.car = yourInformation.nextInt();
            System.out.println("Do you have violations(true/false): ");
            thirdPerson.violations = yourInformation.nextBoolean();
            System.out.println("Your credit scores are: ");
            thirdPerson.creditScore = yourInformation.nextDouble();
            thirdPerson.display();
            System.out.println(firstPerson.getRate(monthlyRate) + firstPerson.assumeGender(adjustedRate) +" dollars");
        }else {
            System.out.println("Thank you!!!");
        }

    }
}
