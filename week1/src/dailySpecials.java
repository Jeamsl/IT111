import java.util.Scanner;
import java.util.concurrent.SubmissionPublisher;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class dailySpecials {

    public static void main(String[] args) {
        String specials = " ";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week exluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee;
        double price;
        int allPrice;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }

        switch (specials) {
            case "Monday":
                coffee = "Latter";
                price = 4.95;
                System.out
                        .println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
                allPrice = input.nextInt();
                switch (allPrice) {
                    case 0:
                        System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
                    case 1:
                        System.out
                                .println("Looks like you will be ordering only " + allPrice + " " + coffee + " today!");
                    default:
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(
                                allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");

                }
                break;

            case "Tuesday":
                coffee = "Frapp";
                price = 5.95;
                System.out
                        .println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
                allPrice = input.nextInt();
                switch (allPrice) {
                    case 0:
                        System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
                    case 1:
                        System.out
                                .println("Looks like you will be ordering only " + allPrice + " " + coffee + " today!");
                    default:
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(
                                allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");

                }
                break;

            case "Wendesday":
                coffee = "Cappucino";
                price = 4.35;
                System.out
                        .println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
                allPrice = input.nextInt();
                switch (allPrice) {
                    case 0:
                        System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
                    case 1:
                        System.out
                                .println("Looks like you will be ordering only " + allPrice + " " + coffee + " today!");
                    default:
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(
                                allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");

                }
                break;

            case "Thursday":
                coffee = "Reguly Joe";
                price = 2.95;
                System.out
                        .println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
                allPrice = input.nextInt();
                switch (allPrice) {
                    case 0:
                        System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
                    case 1:
                        System.out
                                .println("Looks like you will be ordering only " + allPrice + " " + coffee + " today!");
                    default:
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(
                                allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");

                }
                break;

            case "Friday":
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out
                        .println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many " + coffee + " would you like to order?");
                allPrice = input.nextInt();
                switch (allPrice) {
                    case 0:
                        System.out.println("Looks like you don't like " + coffee + "! So sad!!!");
                    case 1:
                        System.out
                                .println("Looks like you will be ordering only " + allPrice + " " + coffee + " today!");
                    default:
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(
                                allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");

                }
                break;
        }

    }
}