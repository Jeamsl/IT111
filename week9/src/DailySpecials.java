import java.util.Scanner;

public class DailySpecials {

    public static void main(String[] args) {
        String specials = " ";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week exluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee;
        double price;
        double finalPrice;
        int allPrice;
        boolean weekend = true;

        while (weekend) {
            switch (specials) {
                case "Monday":
                    weekend = false;
                    coffee = "Latter";
                    price = 4.95;
                    System.out.println(specials + "'s coffee of the day is a " +coffee+ " and the price will be $" + price);
                    System.out.println("How many " +coffee+ " would you like to order?");
                    allPrice = input.nextInt();
                    if (allPrice == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                    } else if (allPrice >=1 && allPrice <=4) {
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");
                    } else if (allPrice >=5 && allPrice <= 10){
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("Look like you qualify for a group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.9;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    } else {
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("A bigger group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.8;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    }
                    break;

                case "Tuesday":
                    weekend = false;
                    coffee = "Frapp";
                    price = 5.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + " would you like to order?");
                    allPrice = input.nextInt();
                    if (allPrice == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                    } else if (allPrice >=1 && allPrice <=4) {
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");
                    } else if (allPrice >=5 && allPrice <= 10){
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("Look like you qualify for a group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.9;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    } else {
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("A bigger group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.8;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    }
                    break;

                case "Wendesday":
                    weekend = false;
                    coffee = "Cappucino";
                    price = 4.35;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + " would you like to order?");
                    allPrice = input.nextInt();
                    if (allPrice == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                    } else if (allPrice >=1 && allPrice <=4) {
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");
                    } else if (allPrice >=5 && allPrice <= 10){
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("Look like you qualify for a group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.9;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    } else {
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("A bigger group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.8;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    }
                    break;

                case "Thursday":
                    weekend = false;
                    coffee = "Reguly Joe";
                    price = 2.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + " would you like to order?");
                    allPrice = input.nextInt();
                    if (allPrice == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                    } else if (allPrice >=1 && allPrice <=4) {
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");
                    } else if (allPrice >=5 && allPrice <= 10){
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("Look like you qualify for a group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.9;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    } else {
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("A bigger group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.8;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    }
                    break;

                case "Friday":
                    weekend = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be $" + price);
                    System.out.println("How many " + coffee + " would you like to order?");
                    allPrice = input.nextInt();
                    if (allPrice == 0) {
                        System.out.println("Looks like you don't like " +coffee+ "! So sad!!!");
                    } else if (allPrice >=1 && allPrice <=4) {
                        price = allPrice * price;
                        String str = String.format("%.2f", price);
                        System.out.println(allPrice + " " + coffee + " have been ordered totalling $" + str + " dollars!");
                    } else if (allPrice >=5 && allPrice <= 10){
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("Look like you qualify for a group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.9;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    } else {
                        price = allPrice * price;
                        String str1 = String.format("%.2f", price);
                        System.out.println("A bigger group discount! Your regular price is " +str1+ " dollars!");
                        finalPrice = price * 0.8;
                        String str2 = String.format("%.2f", finalPrice);
                        System.out.println("You have ordered " +allPrice+ " " +coffee+ " but will be only charged $" + str2);
                    }
                    break;
                case "Saturday":
                case "Sunday":
                    System.out.println("Please enter a weekday, not weekend!!!");
                    specials = input.next();
                    break;
                default:
                    System.out.println("The day of the week you entered are not correct!!!");
                    specials = input.next();
                    break;
            }
        }

    }
}