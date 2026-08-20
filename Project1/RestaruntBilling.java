import java.util.*;

public class RestaruntBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBill = 0;

        ArrayList<String> orderedItems = new ArrayList<>();

        while (true) {


            System.out.println("\n=================================");
            System.out.println("      WELCOME TO RESTAURANT");
            System.out.println("=================================");
            System.out.println("1. Veg");
            System.out.println("2. Non-veg");
            System.out.println("3. Drinks");
            System.out.println("4. Desserts");
            System.out.println("5. Delete Item");
            System.out.println("6. Generate Bill");
            System.out.println("7. Exit");
            System.out.println("=================================");
            System.out.print("Enter Your Choice: ");

            int mainChoice = sc.nextInt();

            switch (mainChoice) {

                case 1:

                    System.out.println("\n========== VEG MENU ==========");
                    System.out.println("1. Biryani");
                    System.out.println("2. Fried Rice");
                    System.out.println("3. Starters");
                    System.out.print("Enter Your Choice: ");

                    int vegChoice = sc.nextInt();

                    switch (vegChoice) {

                        case 1:

                            System.out.println("\n========== VEG BIRYANI ==========");
                            System.out.println("1. Vegetable Biryani - ₹120");
                            System.out.println("2. Paneer Biryani - ₹150");
                            System.out.println("3. Mushroom Biryani - ₹140");
                            System.out.println("4. Corn Biryani - ₹130");
                            System.out.println("5. Soya Chunk Biryani - ₹120");
                            System.out.println("6. Cauliflower Biryani - ₹130");
                            System.out.println("7. Palak Biryani - ₹110");
                            System.out.println("8. Brinjal Biryani - ₹110");

                            System.out.print("Select Biryani: ");
                            int vegBiryani = sc.nextInt();

                            switch (vegBiryani) {

                                case 1:
                                    totalBill += 120;
                                    orderedItems.add("Vegetable Biryani - ₹120");
                                    System.out.println("Vegetable Biryani added successfully!");
                                    break;

                                case 2:
                                    totalBill += 150;
                                    orderedItems.add("Paneer Biryani - ₹150");
                                    System.out.println("Paneer Biryani added successfully!");
                                    break;

                                case 3:
                                    totalBill += 140;
                                    orderedItems.add("Mushroom Biryani - ₹140");
                                    System.out.println("Mushroom Biryani added successfully!");
                                    break;

                                case 4:
                                    totalBill += 130;
                                    orderedItems.add("Corn Biryani - ₹130");
                                    System.out.println("Corn Biryani added successfully!");
                                    break;

                                case 5:
                                    totalBill += 120;
                                    orderedItems.add("Soya Chunk Biryani - ₹120");
                                    System.out.println("Soya Chunk Biryani added successfully!");
                                    break;

                                case 6:
                                    totalBill += 130;
                                    orderedItems.add("Cauliflower Biryani - ₹130");
                                    System.out.println("Cauliflower Biryani added successfully!");
                                    break;

                                case 7:
                                    totalBill += 110;
                                    orderedItems.add("Palak Biryani - ₹110");
                                    System.out.println("Palak Biryani added successfully!");
                                    break;

                                case 8:
                                    totalBill += 110;
                                    orderedItems.add("Brinjal Biryani - ₹110");
                                    System.out.println("Brinjal Biryani added successfully!");
                                    break;

                                default:
                                    System.out.println("Invalid Biryani choice!");
                            }

                            break;

                        case 2:

                            System.out.println("\n========== VEG FRIED RICE ==========");
                            System.out.println("1. Vegetable Fried Rice - ₹110");
                            System.out.println("2. Paneer Fried Rice - ₹140");
                            System.out.println("3. Mushroom Fried Rice - ₹130");
                            System.out.println("4. Corn Fried Rice - ₹120");
                            System.out.println("5. Schezwan Fried Rice - ₹130");
                            System.out.println("6. Garlic Fried Rice - ₹120");
                            System.out.println("7. Manchurian Fried Rice - ₹140");
                            System.out.println("8. Cashew Fried Rice - ₹150");

                            System.out.print("Select Fried Rice: ");
                            int vegFriedRice = sc.nextInt();

                            switch (vegFriedRice) {

                                case 1:
                                    totalBill += 110;
                                    orderedItems.add("Vegetable Fried Rice - ₹110");
                                    System.out.println("Vegetable Fried Rice added successfully!");
                                    break;

                                case 2:
                                    totalBill += 140;
                                    orderedItems.add("Paneer Fried Rice - ₹140");
                                    System.out.println("Paneer Fried Rice added successfully!");
                                    break;

                                case 3:
                                    totalBill += 130;
                                    orderedItems.add("Mushroom Fried Rice - ₹130");
                                    System.out.println("Mushroom Fried Rice added successfully!");
                                    break;

                                case 4:
                                    totalBill += 120;
                                    orderedItems.add("Corn Fried Rice - ₹120");
                                    System.out.println("Corn Fried Rice added successfully!");
                                    break;

                                case 5:
                                    totalBill += 130;
                                    orderedItems.add("Schezwan Fried Rice - ₹130");
                                    System.out.println("Schezwan Fried Rice added successfully!");
                                    break;

                                case 6:
                                    totalBill += 120;
                                    orderedItems.add("Garlic Fried Rice - ₹120");
                                    System.out.println("Garlic Fried Rice added successfully!");
                                    break;

                                case 7:
                                    totalBill += 140;
                                    orderedItems.add("Manchurian Fried Rice - ₹140");
                                    System.out.println("Manchurian Fried Rice added successfully!");
                                    break;

                                case 8:
                                    totalBill += 150;
                                    orderedItems.add("Cashew Fried Rice - ₹150");
                                    System.out.println("Cashew Fried Rice added successfully!");
                                    break;

                                default:
                                    System.out.println("Invalid Fried Rice choice!");
                            }

                            break;

                        case 3:

                            System.out.println("\n========== VEG STARTERS ==========");
                            System.out.println("1. Gobi 65 - ₹100");
                            System.out.println("2. Paneer 65 - ₹140");
                            System.out.println("3. Gobi Manchurian - ₹120");
                            System.out.println("4. Paneer Manchurian - ₹150");
                            System.out.println("5. Mushroom 65 - ₹130");
                            System.out.println("6. Chilli Paneer - ₹150");
                            System.out.println("7. Chilli Mushroom - ₹140");
                            System.out.println("8. Baby Corn Manchurian - ₹130");
                            System.out.println("9. Crispy Corn - ₹120");
                            System.out.println("10. French Fries - ₹100");
                            System.out.println("11. Vegetable Spring Roll - ₹120");
                            System.out.println("12. Paneer Tikka - ₹160");
                            System.out.println("13. Mushroom Tikka - ₹150");
                            System.out.println("14. Crispy Gobi - ₹110");
                            System.out.println("15. Veg Cutlet - ₹90");

                            System.out.print("Select Starter: ");
                            int vegStarter = sc.nextInt();

                            switch (vegStarter) {

                                case 1:
                                    totalBill += 100;
                                    orderedItems.add("Gobi 65 - ₹100");
                                    System.out.println("Gobi 65 added successfully!");
                                    break;

                                case 2:
                                    totalBill += 140;
                                    orderedItems.add("Paneer 65 - ₹140");
                                    System.out.println("Paneer 65 added successfully!");
                                    break;

                                case 3:
                                    totalBill += 120;
                                    orderedItems.add("Gobi Manchurian - ₹120");
                                    System.out.println("Gobi Manchurian added successfully!");
                                    break;

                                case 4:
                                    totalBill += 150;
                                    orderedItems.add("Paneer Manchurian - ₹150");
                                    System.out.println("Paneer Manchurian added successfully!");
                                    break;

                                case 5:
                                    totalBill += 130;
                                    orderedItems.add("Mushroom 65 - ₹130");
                                    System.out.println("Mushroom 65 added successfully!");
                                    break;

                                case 6:
                                    totalBill += 150;
                                    orderedItems.add("Chilli Paneer - ₹150");
                                    System.out.println("Chilli Paneer added successfully!");
                                    break;

                                case 7:
                                    totalBill += 140;
                                    orderedItems.add("Chilli Mushroom - ₹140");
                                    System.out.println("Chilli Mushroom added successfully!");
                                    break;

                                case 8:
                                    totalBill += 130;
                                    orderedItems.add("Baby Corn Manchurian - ₹130");
                                    System.out.println("Baby Corn Manchurian added successfully!");
                                    break;

                                case 9:
                                    totalBill += 120;
                                    orderedItems.add("Crispy Corn - ₹120");
                                    System.out.println("Crispy Corn added successfully!");
                                    break;

                                case 10:
                                    totalBill += 100;
                                    orderedItems.add("French Fries - ₹100");
                                    System.out.println("French Fries added successfully!");
                                    break;

                                case 11:
                                    totalBill += 120;
                                    orderedItems.add("Vegetable Spring Roll - ₹120");
                                    System.out.println("Vegetable Spring Roll added successfully!");
                                    break;

                                case 12:
                                    totalBill += 160;
                                    orderedItems.add("Paneer Tikka - ₹160");
                                    System.out.println("Paneer Tikka added successfully!");
                                    break;

                                case 13:
                                    totalBill += 150;
                                    orderedItems.add("Mushroom Tikka - ₹150");
                                    System.out.println("Mushroom Tikka added successfully!");
                                    break;

                                case 14:
                                    totalBill += 110;
                                    orderedItems.add("Crispy Gobi - ₹110");
                                    System.out.println("Crispy Gobi added successfully!");
                                    break;

                                case 15:
                                    totalBill += 90;
                                    orderedItems.add("Veg Cutlet - ₹90");
                                    System.out.println("Veg Cutlet added successfully!");
                                    break;

                                default:
                                    System.out.println("Invalid Starter choice!");
                            }

                            break;

                        default:
                            System.out.println("Invalid Veg choice!");
                    }

                    break;

                case 2:

                    System.out.println("\n========== NON-VEG ==========");
                    System.out.println("1. Biryani");
                    System.out.println("2. Fried Rice");
                    System.out.println("3. Starters");

                    System.out.print("Enter Your Choice: ");
                    int nonVegChoice = sc.nextInt();

                    switch (nonVegChoice) {

                        case 1:

                            System.out.println("\n========== NON-VEG BIRYANI ==========");
                            System.out.println("1. Chicken Biryani - ₹180");
                            System.out.println("2. Chicken 65 Biryani - ₹200");
                            System.out.println("3. Mutton Biryani - ₹250");
                            System.out.println("4. Egg Biryani - ₹140");
                            System.out.println("5. Fish Biryani - ₹220");
                            System.out.println("6. Prawn Biryani - ₹240");
                            System.out.println("7. Chicken Tikka Biryani - ₹220");
                            System.out.println("8. Chicken Lollipop Biryani - ₹230");
                            System.out.println("9. Pepper Chicken Biryani - ₹210");
                            System.out.println("10. Andhra Chicken Biryani - ₹200");
                            System.out.println("11. Ambur Chicken Biryani - ₹190");
                            System.out.println("12. Hyderabadi Chicken Biryani - ₹220");

                            System.out.print("Select Biryani: ");
                            int nonVegBiryani = sc.nextInt();

                            switch (nonVegBiryani) {

                                case 1:
                                    totalBill += 180;
                                    orderedItems.add("Chicken Biryani - ₹180");
                                    System.out.println("Chicken Biryani added successfully!");
                                    break;

                                case 2:
                                    totalBill += 200;
                                    orderedItems.add("Chicken 65 Biryani - ₹200");
                                    System.out.println("Chicken 65 Biryani added successfully!");
                                    break;

                                case 3:
                                    totalBill += 250;
                                    orderedItems.add("Mutton Biryani - ₹250");
                                    System.out.println("Mutton Biryani added successfully!");
                                    break;

                                case 4:
                                    totalBill += 140;
                                    orderedItems.add("Egg Biryani - ₹140");
                                    System.out.println("Egg Biryani added successfully!");
                                    break;

                                case 5:
                                    totalBill += 220;
                                    orderedItems.add("Fish Biryani - ₹220");
                                    System.out.println("Fish Biryani added successfully!");
                                    break;

                                case 6:
                                    totalBill += 240;
                                    orderedItems.add("Prawn Biryani - ₹240");
                                    System.out.println("Prawn Biryani added successfully!");
                                    break;

                                case 7:
                                    totalBill += 220;
                                    orderedItems.add("Chicken Tikka Biryani - ₹220");
                                    System.out.println("Chicken Tikka Biryani added successfully!");
                                    break;

                                case 8:
                                    totalBill += 230;
                                    orderedItems.add("Chicken Lollipop Biryani - ₹230");
                                    System.out.println("Chicken Lollipop Biryani added successfully!");
                                    break;

                                case 9:
                                    totalBill += 210;
                                    orderedItems.add("Pepper Chicken Biryani - ₹210");
                                    System.out.println("Pepper Chicken Biryani added successfully!");
                                    break;

                                case 10:
                                    totalBill += 200;
                                    orderedItems.add("Andhra Chicken Biryani - ₹200");
                                    System.out.println("Andhra Chicken Biryani added successfully!");
                                    break;

                                case 11:
                                    totalBill += 190;
                                    orderedItems.add("Ambur Chicken Biryani - ₹190");
                                    System.out.println("Ambur Chicken Biryani added successfully!");
                                    break;

                                case 12:
                                    totalBill += 220;
                                    orderedItems.add("Hyderabadi Chicken Biryani - ₹220");
                                    System.out.println("Hyderabadi Chicken Biryani added successfully!");
                                    break;

                                default:
                                    System.out.println("Invalid Biryani choice!");
                            }

                            break;

                        case 2:

                            System.out.println("\n========== NON-VEG FRIED RICE ==========");
                            System.out.println("1. Chicken Fried Rice - ₹160");
                            System.out.println("2. Chicken Schezwan Fried Rice - ₹180");
                            System.out.println("3. Chicken 65 Fried Rice - ₹190");
                            System.out.println("4. Egg Fried Rice - ₹130");
                            System.out.println("5. Egg Schezwan Fried Rice - ₹150");
                            System.out.println("6. Chicken Manchurian Fried Rice - ₹180");
                            System.out.println("7. Chicken Garlic Fried Rice - ₹170");
                            System.out.println("8. Chicken Pepper Fried Rice - ₹170");
                            System.out.println("9. Chicken Chilli Fried Rice - ₹180");
                            System.out.println("10. Mixed Non-Veg Fried Rice - ₹220");
                            System.out.println("11. Prawn Fried Rice - ₹200");
                            System.out.println("12. Fish Fried Rice - ₹190");

                            System.out.print("Select Fried Rice: ");
                            int nonVegFriedRice = sc.nextInt();

                            switch (nonVegFriedRice) {

                                case 1:
                                    totalBill += 160;
                                    orderedItems.add("Chicken Fried Rice - ₹160");
                                    System.out.println("Chicken Fried Rice added successfully!");
                                    break;

                                case 2:
                                    totalBill += 180;
                                    orderedItems.add("Chicken Schezwan Fried Rice - ₹180");
                                    System.out.println("Chicken Schezwan Fried Rice added successfully!");
                                    break;

                                case 3:
                                    totalBill += 190;
                                    orderedItems.add("Chicken 65 Fried Rice - ₹190");
                                    System.out.println("Chicken 65 Fried Rice added successfully!");
                                    break;

                                case 4:
                                    totalBill += 130;
                                    orderedItems.add("Egg Fried Rice - ₹130");
                                    System.out.println("Egg Fried Rice added successfully!");
                                    break;

                                case 5:
                                    totalBill += 150;
                                    orderedItems.add("Egg Schezwan Fried Rice - ₹150");
                                    System.out.println("Egg Schezwan Fried Rice added successfully!");
                                    break;

                                case 6:
                                    totalBill += 180;
                                    orderedItems.add("Chicken Manchurian Fried Rice - ₹180");
                                    System.out.println("Chicken Manchurian Fried Rice added successfully!");
                                    break;

                                case 7:
                                    totalBill += 170;
                                    orderedItems.add("Chicken Garlic Fried Rice - ₹170");
                                    System.out.println("Chicken Garlic Fried Rice added successfully!");
                                    break;

                                case 8:
                                    totalBill += 170;
                                    orderedItems.add("Chicken Pepper Fried Rice - ₹170");
                                    System.out.println("Chicken Pepper Fried Rice added successfully!");
                                    break;

                                case 9:
                                    totalBill += 180;
                                    orderedItems.add("Chicken Chilli Fried Rice - ₹180");
                                    System.out.println("Chicken Chilli Fried Rice added successfully!");
                                    break;

                                case 10:
                                    totalBill += 220;
                                    orderedItems.add("Mixed Non-Veg Fried Rice - ₹220");
                                    System.out.println("Mixed Non-Veg Fried Rice added successfully!");
                                    break;

                                case 11:
                                    totalBill += 200;
                                    orderedItems.add("Prawn Fried Rice - ₹200");
                                    System.out.println("Prawn Fried Rice added successfully!");
                                    break;

                                case 12:
                                    totalBill += 190;
                                    orderedItems.add("Fish Fried Rice - ₹190");
                                    System.out.println("Fish Fried Rice added successfully!");
                                    break;

                                default:
                                    System.out.println("Invalid Fried Rice choice!");
                            }

                            break;

                        case 3:

                            System.out.println("\n========== NON-VEG STARTERS ==========");
                            System.out.println("1. Chicken 65 - ₹160");
                            System.out.println("2. Chicken 555 - ₹170");
                            System.out.println("3. Chilli Chicken - ₹170");
                            System.out.println("4. Chicken Manchurian - ₹180");
                            System.out.println("5. Chicken Lollipop - ₹200");
                            System.out.println("6. Chicken Wings - ₹190");
                            System.out.println("7. Chicken Tikka - ₹200");
                            System.out.println("8. Chicken Kebab - ₹180");
                            System.out.println("9. Pepper Chicken - ₹170");
                            System.out.println("10. Garlic Chicken - ₹180");
                            System.out.println("11. Chicken Majestic - ₹200");
                            System.out.println("12. Chicken Dragon - ₹190");
                            System.out.println("13. Chicken Pakora - ₹160");
                            System.out.println("14. Chicken Spring Roll - ₹170");
                            System.out.println("15. Fish Finger - ₹200");
                            System.out.println("16. Fish 65 - ₹190");
                            System.out.println("17. Chilli Fish - ₹200");
                            System.out.println("18. Prawn 65 - ₹220");
                            System.out.println("19. Chilli Prawn - ₹230");
                            System.out.println("20. Mutton Pepper Fry - ₹250");

                            System.out.print("Select Starter: ");
                            int nonVegStarter = sc.nextInt();

                            switch (nonVegStarter) {

                                case 1:
                                    totalBill += 160;
                                    orderedItems.add("Chicken 65 - ₹160");
                                    break;

                                case 2:
                                    totalBill += 170;
                                    orderedItems.add("Chicken 555 - ₹170");
                                    break;

                                case 3:
                                    totalBill += 170;
                                    orderedItems.add("Chilli Chicken - ₹170");
                                    break;

                                case 4:
                                    totalBill += 180;
                                    orderedItems.add("Chicken Manchurian - ₹180");
                                    break;

                                case 5:
                                    totalBill += 200;
                                    orderedItems.add("Chicken Lollipop - ₹200");
                                    break;

                                case 6:
                                    totalBill += 190;
                                    orderedItems.add("Chicken Wings - ₹190");
                                    break;

                                case 7:
                                    totalBill += 200;
                                    orderedItems.add("Chicken Tikka - ₹200");
                                    break;

                                case 8:
                                    totalBill += 180;
                                    orderedItems.add("Chicken Kebab - ₹180");
                                    break;

                                case 9:
                                    totalBill += 170;
                                    orderedItems.add("Pepper Chicken - ₹170");
                                    break;

                                case 10:
                                    totalBill += 180;
                                    orderedItems.add("Garlic Chicken - ₹180");
                                    break;

                                case 11:
                                    totalBill += 200;
                                    orderedItems.add("Chicken Majestic - ₹200");
                                    break;

                                case 12:
                                    totalBill += 190;
                                    orderedItems.add("Chicken Dragon - ₹190");
                                    break;

                                case 13:
                                    totalBill += 160;
                                    orderedItems.add("Chicken Pakora - ₹160");
                                    break;

                                case 14:
                                    totalBill += 170;
                                    orderedItems.add("Chicken Spring Roll - ₹170");
                                    break;

                                case 15:
                                    totalBill += 200;
                                    orderedItems.add("Fish Finger - ₹200");
                                    break;

                                case 16:
                                    totalBill += 190;
                                    orderedItems.add("Fish 65 - ₹190");
                                    break;

                                case 17:
                                    totalBill += 200;
                                    orderedItems.add("Chilli Fish - ₹200");
                                    break;

                                case 18:
                                    totalBill += 220;
                                    orderedItems.add("Prawn 65 - ₹220");
                                    break;

                                case 19:
                                    totalBill += 230;
                                    orderedItems.add("Chilli Prawn - ₹230");
                                    break;

                                case 20:
                                    totalBill += 250;
                                    orderedItems.add("Mutton Pepper Fry - ₹250");
                                    break;

                                default:
                                    System.out.println("Invalid Starter choice!");
                            }

                            System.out.println("Item added successfully!");
                            break;

                        default:
                            System.out.println("Invalid Non-Veg choice!");
                    }

                    break;

                case 3:

                    System.out.println("\n========== DRINKS ==========");
                    System.out.println("1. Coca Cola - ₹50");
                    System.out.println("2. Pepsi - ₹50");
                    System.out.println("3. Sprite - ₹50");
                    System.out.println("4. Fanta - ₹50");
                    System.out.println("5. 7 Up - ₹50");
                    System.out.println("6. Mountain Dew - ₹50");
                    System.out.println("7. Limca - ₹50");
                    System.out.println("8. Fresh Lime Soda - ₹60");
                    System.out.println("9. Fresh Lime Juice - ₹70");
                    System.out.println("10. Orange Juice - ₹80");
                    System.out.println("11. Mango Juice - ₹80");
                    System.out.println("12. Tea - ₹30");
                    System.out.println("13. Coffee - ₹40");
                    System.out.println("14. Cold Coffee - ₹90");
                    System.out.println("15. Milkshake - ₹100");

                    System.out.print("Select Drink: ");
                    int drinkChoice = sc.nextInt();

                    switch (drinkChoice) {

                        case 1:
                            totalBill += 50;
                            orderedItems.add("Coca Cola - ₹50");
                            break;

                        case 2:
                            totalBill += 50;
                            orderedItems.add("Pepsi - ₹50");
                            break;

                        case 3:
                            totalBill += 50;
                            orderedItems.add("Sprite - ₹50");
                            break;

                        case 4:
                            totalBill += 50;
                            orderedItems.add("Fanta - ₹50");
                            break;

                        case 5:
                            totalBill += 50;
                            orderedItems.add("7 Up - ₹50");
                            break;

                        case 6:
                            totalBill += 50;
                            orderedItems.add("Mountain Dew - ₹50");
                            break;

                        case 7:
                            totalBill += 50;
                            orderedItems.add("Limca - ₹50");
                            break;

                        case 8:
                            totalBill += 60;
                            orderedItems.add("Fresh Lime Soda - ₹60");
                            break;

                        case 9:
                            totalBill += 70;
                            orderedItems.add("Fresh Lime Juice - ₹70");
                            break;

                        case 10:
                            totalBill += 80;
                            orderedItems.add("Orange Juice - ₹80");
                            break;

                        case 11:
                            totalBill += 80;
                            orderedItems.add("Mango Juice - ₹80");
                            break;

                        case 12:
                            totalBill += 30;
                            orderedItems.add("Tea - ₹30");
                            break;

                        case 13:
                            totalBill += 40;
                            orderedItems.add("Coffee - ₹40");
                            break;

                        case 14:
                            totalBill += 90;
                            orderedItems.add("Cold Coffee - ₹90");
                            break;

                        case 15:
                            totalBill += 100;
                            orderedItems.add("Milkshake - ₹100");
                            break;

                        default:
                            System.out.println("Invalid Drink choice!");
                            continue;
                    }

                    System.out.println("Drink added successfully!");
                    break;

                case 4:

                    System.out.println("\n========== DESSERTS ==========");
                    System.out.println("1. Vanilla Ice Cream - ₹60");
                    System.out.println("2. Chocolate Ice Cream - ₹70");
                    System.out.println("3. Strawberry Ice Cream - ₹70");
                    System.out.println("4. Butterscotch Ice Cream - ₹80");
                    System.out.println("5. Black Currant Ice Cream - ₹80");
                    System.out.println("6. Chocolate Sundae - ₹100");
                    System.out.println("7. Brownie with Ice Cream - ₹120");
                    System.out.println("8. Gulab Jamun - ₹60");
                    System.out.println("9. Rasmalai - ₹80");
                    System.out.println("10. Gajar Halwa - ₹70");
                    System.out.println("11. Kulfi - ₹70");
                    System.out.println("12. Chocolate Cake - ₹100");
                    System.out.println("13. Black Forest Cake - ₹120");
                    System.out.println("14. Caramel Pudding - ₹90");
                    System.out.println("15. Fruit Salad with Ice Cream - ₹110");

                    System.out.print("Select Dessert: ");
                    int dessertChoice = sc.nextInt();

                    switch (dessertChoice) {

                        case 1:
                            totalBill += 60;
                            orderedItems.add("Vanilla Ice Cream - ₹60");
                            break;

                        case 2:
                            totalBill += 70;
                            orderedItems.add("Chocolate Ice Cream - ₹70");
                            break;

                        case 3:
                            totalBill += 70;
                            orderedItems.add("Strawberry Ice Cream - ₹70");
                            break;

                        case 4:
                            totalBill += 80;
                            orderedItems.add("Butterscotch Ice Cream - ₹80");
                            break;

                        case 5:
                            totalBill += 80;
                            orderedItems.add("Black Currant Ice Cream - ₹80");
                            break;

                        case 6:
                            totalBill += 100;
                            orderedItems.add("Chocolate Sundae - ₹100");
                            break;

                        case 7:
                            totalBill += 120;
                            orderedItems.add("Brownie with Ice Cream - ₹120");
                            break;

                        case 8:
                            totalBill += 60;
                            orderedItems.add("Gulab Jamun - ₹60");
                            break;

                        case 9:
                            totalBill += 80;
                            orderedItems.add("Rasmalai - ₹80");
                            break;

                        case 10:
                            totalBill += 70;
                            orderedItems.add("Gajar Halwa - ₹70");
                            break;

                        case 11:
                            totalBill += 70;
                            orderedItems.add("Kulfi - ₹70");
                            break;

                        case 12:
                            totalBill += 100;
                            orderedItems.add("Chocolate Cake - ₹100");
                            break;

                        case 13:
                            totalBill += 120;
                            orderedItems.add("Black Forest Cake - ₹120");
                            break;

                        case 14:
                            totalBill += 90;
                            orderedItems.add("Caramel Pudding - ₹90");
                            break;

                        case 15:
                            totalBill += 110;
                            orderedItems.add("Fruit Salad with Ice Cream - ₹110");
                            break;

                        default:
                            System.out.println("Invalid Dessert choice!");
                            continue;
                    }

                    System.out.println("Dessert added successfully!");
                    break;

                case 5:

                    System.out.println("\n=================================");
                    System.out.println("          DELETE ITEM");
                    System.out.println("=================================");

                    if (orderedItems.isEmpty()) {

                        System.out.println("No items ordered.");
                        System.out.println("=================================");

                    } else {

                        System.out.println("Your Ordered Items:");
                        System.out.println("---------------------------------");

                        for (int i = 0; i < orderedItems.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". " + orderedItems.get(i)
                            );
                        }

                        System.out.println("---------------------------------");
                        System.out.print("Enter item number to delete: ");

                        int deleteChoice = sc.nextInt();

                        if (deleteChoice >= 1 &&
                            deleteChoice <= orderedItems.size()) {

                            String deletedItem =
                                    orderedItems.get(deleteChoice - 1);

                            int rupeePosition =
                                    deletedItem.lastIndexOf("₹");

                            int price = Integer.parseInt(
                                    deletedItem.substring(
                                            rupeePosition + 1
                                    ).trim()
                            );

                            orderedItems.remove(deleteChoice - 1);

                            totalBill -= price;

                            System.out.println("---------------------------------");
                            System.out.println(
                                    "Removed Item : " + deletedItem
                            );
                            System.out.println(
                                    "Updated Bill : ₹" + totalBill
                            );
                            System.out.println("---------------------------------");

                        } else {

                            System.out.println("Invalid item number!");
                        }
                    }

                    break;

                case 6:

                    System.out.println("\n=================================");
                    System.out.println("          RESTAURANT BILL");
                    System.out.println("=================================");

                    if (orderedItems.isEmpty()) {

                        System.out.println("No items ordered.");
                        System.out.println("=================================");

                    } else {

                        System.out.println("Ordered Items:");
                        System.out.println("---------------------------------");

                        for (int i = 0; i < orderedItems.size(); i++) {
                            System.out.println(
                                    (i + 1) + ". " + orderedItems.get(i)
                            );
                        }

                        System.out.println("---------------------------------");
                        System.out.println("Food Bill : ₹" + totalBill);

                        System.out.print("Enter Tip Amount: ₹");
                        int tip = sc.nextInt();

                        int finalBill = totalBill + tip;

                        System.out.println("---------------------------------");
                        System.out.println("Food Bill  : ₹" + totalBill);
                        System.out.println("Tip Amount : ₹" + tip);
                        System.out.println("Final Bill : ₹" + finalBill);
                        System.out.println("=================================");
                        System.out.println("       Thank You! Visit Again");
                        System.out.println("=================================");

                        sc.close();
                        return;
                    }

                    break;

                case 7:

                    System.out.println("\n=================================");
                    System.out.println("   Thank You For Visiting!");
                    System.out.println("       Please Visit Again");
                    System.out.println("=================================");

                    sc.close();
                    return;

                default:

                    System.out.println(
                            "Invalid choice! Please try again."
                    );
            }
        }
    }
}
