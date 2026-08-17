import java.util.Scanner;

public class RestaurantBillingSystem {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int totalBill = 0;
        String orderedItems = "";

        while (true) {

            System.out.println("\n=================================");
            System.out.println("      WELCOME TO RESTAURANT");
            System.out.println("=================================");
            System.out.println("1. Drinks");
            System.out.println("2. Starters");
            System.out.println("3. Biryanis");
            System.out.println("4. Ice Creams");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");
            System.out.println("=================================");
            System.out.print("Enter Your Choice: ");

            int mainChoice = sc.nextInt();

            switch (mainChoice) {

                
                case 1:
                    System.out.println("\n----- DRINKS MENU -----");
                    System.out.println("1. Water Bottle - Rs.20");
                    System.out.println("2. Thums Up - Rs.40");
                    System.out.println("3. Coke - Rs.40");
                    System.out.print("Select Drink: ");

                    int drinkChoice = sc.nextInt();

                    switch (drinkChoice) {
                        case 1:
                            totalBill += 20;
                            orderedItems += "Water Bottle - Rs.20\n";
                            System.out.println("Water Bottle served successfully.");
                            break;

                        case 2:
                            totalBill += 40;
                            orderedItems += "Thums Up - Rs.40\n";
                            System.out.println("Thums Up served successfully.");
                            break;

                        case 3:
                            totalBill += 40;
                            orderedItems += "Coke - Rs.40\n";
                            System.out.println("Coke served successfully.");
                            break;

                        default:
                            System.out.println("Invalid Drink Choice!");
                    }
                    break;

                
                case 2:
                    System.out.println("\n----- STARTERS MENU -----");
                    System.out.println("1. Chicken 65 - Rs.180");
                    System.out.println("2. Chilli Chicken - Rs.200");
                    System.out.println("3. Dragon Chicken - Rs.220");
                    System.out.println("4. Paneer 65 - Rs.170");
                    System.out.println("5. Veg Manchuria - Rs.150");
                    System.out.println("6. Gobi Manchuria - Rs.140");
                    System.out.println("7. Chicken Lollipop - Rs.240");
                    System.out.println("8. Crispy Corn - Rs.160");
                    System.out.println("9. French Fries - Rs.120");
                    System.out.println("10. Mushroom Fry - Rs.180");
                    System.out.print("Select Starter: ");

                    int starterChoice = sc.nextInt();

                    switch (starterChoice) {
                        case 1:
                            totalBill += 180;
                            orderedItems += "Chicken 65 - Rs.180\n";
                            System.out.println("Chicken 65 delivered successfully.");
                            break;

                        case 2:
                            totalBill += 200;
                            orderedItems += "Chilli Chicken - Rs.200\n";
                            System.out.println("Chilli Chicken delivered successfully.");
                            break;

                        case 3:
                            totalBill += 220;
                            orderedItems += "Dragon Chicken - Rs.220\n";
                            System.out.println("Dragon Chicken delivered successfully.");
                            break;

                        case 4:
                            totalBill += 170;
                            orderedItems += "Paneer 65 - Rs.170\n";
                            System.out.println("Paneer 65 delivered successfully.");
                            break;

                        case 5:
                            totalBill += 150;
                            orderedItems += "Veg Manchuria - Rs.150\n";
                            System.out.println("Veg Manchuria delivered successfully.");
                            break;

                        case 6:
                            totalBill += 140;
                            orderedItems += "Gobi Manchuria - Rs.140\n";
                            System.out.println("Gobi Manchuria delivered successfully.");
                            break;

                        case 7:
                            totalBill += 240;
                            orderedItems += "Chicken Lollipop - Rs.240\n";
                            System.out.println("Chicken Lollipop delivered successfully.");
                            break;

                        case 8:
                            totalBill += 160;
                            orderedItems += "Crispy Corn - Rs.160\n";
                            System.out.println("Crispy Corn delivered successfully.");
                            break;

                        case 9:
                            totalBill += 120;
                            orderedItems += "French Fries - Rs.120\n";
                            System.out.println("French Fries delivered successfully.");
                            break;

                        case 10:
                            totalBill += 180;
                            orderedItems += "Mushroom Fry - Rs.180\n";
                            System.out.println("Mushroom Fry delivered successfully.");
                            break;

                        default:
                            System.out.println("Invalid Starter Choice!");
                    }
                    break;

                
                case 3:
                    System.out.println("\n----- BIRYANI MENU -----");
                    System.out.println("1. Chicken Dum Biryani - Rs.250");
                    System.out.println("2. Special Chicken Biryani - Rs.300");
                    System.out.println("3. Mutton Biryani - Rs.350");
                    System.out.println("4. Prawns Biryani - Rs.380");
                    System.out.println("5. Veg Biryani - Rs.200");
                    System.out.print("Select Biryani: ");

                    int biryaniChoice = sc.nextInt();

                    switch (biryaniChoice) {
                        case 1:
                            totalBill += 250;
                            orderedItems += "Chicken Dum Biryani - Rs.250\n";
                            System.out.println("Chicken Dum Biryani served successfully.");
                            break;

                        case 2:
                            totalBill += 300;
                            orderedItems += "Special Chicken Biryani - Rs.300\n";
                            System.out.println("Special Chicken Biryani served successfully.");
                            break;

                        case 3:
                            totalBill += 350;
                            orderedItems += "Mutton Biryani - Rs.350\n";
                            System.out.println("Mutton Biryani served successfully.");
                            break;

                        case 4:
                            totalBill += 380;
                            orderedItems += "Prawns Biryani - Rs.380\n";
                            System.out.println("Prawns Biryani served successfully.");
                            break;

                        case 5:
                            totalBill += 200;
                            orderedItems += "Veg Biryani - Rs.200\n";
                            System.out.println("Veg Biryani served successfully.");
                            break;

                        default:
                            System.out.println("Invalid Biryani Choice!");
                    }
                    break;


                case 4:
                    System.out.println("\n----- ICE CREAM MENU -----");
                    System.out.println("1. Vanilla - Rs.60");
                    System.out.println("2. Chocolate - Rs.80");
                    System.out.println("3. Strawberry - Rs.70");
                    System.out.println("4. Butterscotch - Rs.90");
                    System.out.println("5. Black Current - Rs.100");
                    System.out.print("Select Ice Cream: ");

                    int iceChoice = sc.nextInt();

                    switch (iceChoice) {
                        case 1:
                            totalBill += 60;
                            orderedItems += "Vanilla Ice Cream - Rs.60\n";
                            System.out.println("Vanilla Ice Cream served successfully.");
                            break;

                        case 2:
                            totalBill += 80;
                            orderedItems += "Chocolate Ice Cream - Rs.80\n";
                            System.out.println("Chocolate Ice Cream served successfully.");
                            break;

                        case 3:
                            totalBill += 70;
                            orderedItems += "Strawberry Ice Cream - Rs.70\n";
                            System.out.println("Strawberry Ice Cream served successfully.");
                            break;

                        case 4:
                            totalBill += 90;
                            orderedItems += "Butterscotch Ice Cream - Rs.90\n";
                            System.out.println("Butterscotch Ice Cream served successfully.");
                            break;

                        case 5:
                            totalBill += 100;
                            orderedItems += "Black Current Ice Cream - Rs.100\n";
                            System.out.println("Black Current Ice Cream served successfully.");
                            break;

                        default:
                            System.out.println("Invalid Ice Cream Choice!");
                    }
                    break;

               
                case 5:
                    System.out.println("\n========== BILL ==========");
                    System.out.println("Ordered Items:");
                    System.out.println(orderedItems);

                    System.out.println("Food Bill : Rs." + totalBill);

                    System.out.print("Enter Tip Amount: Rs.");
                    int tip = sc.nextInt();

                    int finalBill = totalBill + tip;

                    System.out.println("--------------------------");
                    System.out.println("Food Bill  : Rs." + totalBill);
                    System.out.println("Tip Amount : Rs." + tip);
                    System.out.println("Final Bill : Rs." + finalBill);
                    System.out.println("--------------------------");
                    System.out.println("Thank You! Visit Again.");
                    System.exit(0);
                    break;

                
                case 6:
                    System.out.println("Thank You! Visit Again.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        }
    }
}