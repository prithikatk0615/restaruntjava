import java.util.*;

public class RestaruntBilling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalBill = 0;
        String orderedItems = "";

        while (true) {


            System.out.println("\n=================================");
            System.out.println("      WELCOME TO RESTAURANT");
            System.out.println("=================================");
            System.out.println("1. Veg");
            System.out.println("2. Non-veg");
            System.out.println("3. Drinks");
            System.out.println("4. Desserts");
            System.out.println("5. Generate Bill");
            System.out.println("6. Exit");
            System.out.println("=================================");
            System.out.print("Enter Your Choice: ");

            int mainChoice = sc.nextInt();

            switch (mainChoice) {


                case 1:

                    System.out.println("\n~~~~~~~ VEG MENU ~~~~~~~");
                    System.out.println("1. Biryani");
                    System.out.println("2. Fried Rice");
                    System.out.println("3. Starters");
                    System.out.print("Enter Your Choice: ");

                    int ch = sc.nextInt();

                    switch (ch) {


                        case 1:

                            System.out.println("\n~~~~~~~ Biryani ~~~~~~~");
                            System.out.println("1. Vegetable Biryani - ₹120");
                            System.out.println("2. Paneer Biryani - ₹150");
                            System.out.println("3. Mushroom Biryani - ₹140");
                            System.out.println("4. Corn Biryani - ₹130");
                            System.out.println("5. Soya Chunk Biryani - ₹120");
                            System.out.println("6. Cauliflower Biryani - ₹130");
                            System.out.println("7. Palak (Spinach) Biryani - ₹110");
                            System.out.println("8. Brinjal Biryani - ₹110");

                            System.out.print("Select Biryani: ");

                            int vegBiryani = sc.nextInt();

                            switch (vegBiryani) {

                                case 1:
                                    totalBill += 120;
                                    orderedItems += "Vegetable Biryani - ₹120\n";
                                    System.out.println("Vegetable Biryani served successfully");
                                    break;

                                case 2:
                                    totalBill += 150;
                                    orderedItems += "Paneer Biryani - ₹150\n";
                                    System.out.println("Paneer Biryani served successfully");
                                    break;

                                case 3:
                                    totalBill += 140;
                                    orderedItems += "Mushroom Biryani - ₹140\n";
                                    System.out.println("Mushroom Biryani served successfully");
                                    break;

                                case 4:
                                    totalBill += 130;
                                    orderedItems += "Corn Biryani - ₹130\n";
                                    System.out.println("Corn Biryani served successfully");
                                    break;

                                case 5:
                                    totalBill += 120;
                                    orderedItems += "Soya Chunk Biryani - ₹120\n";
                                    System.out.println("Soya Chunk Biryani served successfully");
                                    break;

                                case 6:
                                    totalBill += 130;
                                    orderedItems += "Cauliflower Biryani - ₹130\n";
                                    System.out.println("Cauliflower Biryani served successfully");
                                    break;

                                case 7:
                                    totalBill += 110;
                                    orderedItems += "Palak (Spinach) Biryani - ₹110\n";
                                    System.out.println("Palak (Spinach) Biryani served successfully");
                                    break;

                                case 8:
                                    totalBill += 110;
                                    orderedItems += "Brinjal Biryani - ₹110\n";
                                    System.out.println("Brinjal Biryani served successfully");
                                    break;

                                default:
                                    System.out.println("Invalid Biryani choice!");
                            }

                            break;

                        case 2:

                            System.out.println("\n~~~~~~~ Fried Rice ~~~~~~~");
                            System.out.println("1. Vegetable Fried Rice - ₹110");
                            System.out.println("2. Paneer Fried Rice - ₹140");
                            System.out.println("3. Mushroom Fried Rice - ₹130");
                            System.out.println("4. Corn Fried Rice - ₹120");
                            System.out.println("5. Schezwan Fried Rice - ₹130");
                            System.out.println("6. Garlic Fried Rice - ₹120");
                            System.out.println("7. Manchurian Fried Rice - ₹140");
                            System.out.println("8. Cashew Fried Rice - ₹150");

                            System.out.print("Select Fried Rice: ");

                            int friedRice = sc.nextInt();

                            switch (friedRice) {

                                case 1:
                                    totalBill += 110;
                                    orderedItems += "Vegetable Fried Rice - ₹110\n";
                                    System.out.println("Vegetable Fried Rice served successfully");
                                    break;

                                case 2:
                                    totalBill += 140;
                                    orderedItems += "Paneer Fried Rice - ₹140\n";
                                    System.out.println("Paneer Fried Rice served successfully");
                                    break;

                                case 3:
                                    totalBill += 130;
                                    orderedItems += "Mushroom Fried Rice - ₹130\n";
                                    System.out.println("Mushroom Fried Rice served successfully");
                                    break;

                                case 4:
                                    totalBill += 120;
                                    orderedItems += "Corn Fried Rice - ₹120\n";
                                    System.out.println("Corn Fried Rice served successfully");
                                    break;

                                case 5:
                                    totalBill += 130;
                                    orderedItems += "Schezwan Fried Rice - ₹130\n";
                                    System.out.println("Schezwan Fried Rice served successfully");
                                    break;

                                case 6:
                                    totalBill += 120;
                                    orderedItems += "Garlic Fried Rice - ₹120\n";
                                    System.out.println("Garlic Fried Rice served successfully");
                                    break;

                                case 7:
                                    totalBill += 140;
                                    orderedItems += "Manchurian Fried Rice - ₹140\n";
                                    System.out.println("Manchurian Fried Rice served successfully");
                                    break;

                                case 8:
                                    totalBill += 150;
                                    orderedItems += "Cashew Fried Rice - ₹150\n";
                                    System.out.println("Cashew Fried Rice served successfully");
                                    break;

                                default:
                                    System.out.println("Invalid Fried Rice choice!");
                            }

                            break;


                        case 3:

                            System.out.println("\n~~~~~~~ Starters ~~~~~~~");
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

                            int starters = sc.nextInt();

                            switch (starters) {

                                case 1:
                                    totalBill += 100;
                                    orderedItems += "Gobi 65 - ₹100\n";
                                    System.out.println("Gobi 65 served successfully");
                                    break;

                                case 2:
                                    totalBill += 140;
                                    orderedItems += "Paneer 65 - ₹140\n";
                                    System.out.println("Paneer 65 served successfully");
                                    break;

                                case 3:
                                    totalBill += 120;
                                    orderedItems += "Gobi Manchurian - ₹120\n";
                                    System.out.println("Gobi Manchurian served successfully");
                                    break;

                                case 4:
                                    totalBill += 150;
                                    orderedItems += "Paneer Manchurian - ₹150\n";
                                    System.out.println("Paneer Manchurian served successfully");
                                    break;

                                case 5:
                                    totalBill += 130;
                                    orderedItems += "Mushroom 65 - ₹130\n";
                                    System.out.println("Mushroom 65 served successfully");
                                    break;

                                case 6:
                                    totalBill += 150;
                                    orderedItems += "Chilli Paneer - ₹150\n";
                                    System.out.println("Chilli Paneer served successfully");
                                    break;

                                case 7:
                                    totalBill += 140;
                                    orderedItems += "Chilli Mushroom - ₹140\n";
                                    System.out.println("Chilli Mushroom served successfully");
                                    break;

                                case 8:
                                    totalBill += 130;
                                    orderedItems += "Baby Corn Manchurian - ₹130\n";
                                    System.out.println("Baby Corn Manchurian served successfully");
                                    break;

                                case 9:
                                    totalBill += 120;
                                    orderedItems += "Crispy Corn - ₹120\n";
                                    System.out.println("Crispy Corn served successfully");
                                    break;

                                case 10:
                                    totalBill += 100;
                                    orderedItems += "French Fries - ₹100\n";
                                    System.out.println("French Fries served successfully");
                                    break;

                                case 11:
                                    totalBill += 120;
                                    orderedItems += "Vegetable Spring Roll - ₹120\n";
                                    System.out.println("Vegetable Spring Roll served successfully");
                                    break;

                                case 12:
                                    totalBill += 160;
                                    orderedItems += "Paneer Tikka - ₹160\n";
                                    System.out.println("Paneer Tikka served successfully");
                                    break;

                                case 13:
                                    totalBill += 150;
                                    orderedItems += "Mushroom Tikka - ₹150\n";
                                    System.out.println("Mushroom Tikka served successfully");
                                    break;

                                case 14:
                                    totalBill += 110;
                                    orderedItems += "Crispy Gobi - ₹110\n";
                                    System.out.println("Crispy Gobi served successfully");
                                    break;

                                case 15:
                                    totalBill += 90;
                                    orderedItems += "Veg Cutlet - ₹90\n";
                                    System.out.println("Veg Cutlet served successfully");
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

                            System.out.println("\n~~~~~~~ NON-VEG BIRYANI ~~~~~~~");
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
                                    orderedItems += "Chicken Biryani - ₹180\n";
                                    System.out.println("Chicken Biryani served successfully");
                                    break;

                                case 2:
                                    totalBill += 200;
                                    orderedItems += "Chicken 65 Biryani - ₹200\n";
                                    System.out.println("Chicken 65 Biryani served successfully");
                                    break;

                                case 3:
                                    totalBill += 250;
                                    orderedItems += "Mutton Biryani - ₹250\n";
                                    System.out.println("Mutton Biryani served successfully");
                                    break;

                                case 4:
                                    totalBill += 140;
                                    orderedItems += "Egg Biryani - ₹140\n";
                                    System.out.println("Egg Biryani served successfully");
                                    break;

                                case 5:
                                    totalBill += 220;
                                    orderedItems += "Fish Biryani - ₹220\n";
                                    System.out.println("Fish Biryani served successfully");
                                    break;

                                case 6:
                                    totalBill += 240;
                                    orderedItems += "Prawn Biryani - ₹240\n";
                                    System.out.println("Prawn Biryani served successfully");
                                    break;

                                case 7:
                                    totalBill += 220;
                                    orderedItems += "Chicken Tikka Biryani - ₹220\n";
                                    System.out.println("Chicken Tikka Biryani served successfully");
                                    break;

                                case 8:
                                    totalBill += 230;
                                    orderedItems += "Chicken Lollipop Biryani - ₹230\n";
                                    System.out.println("Chicken Lollipop Biryani served successfully");
                                    break;

                                case 9:
                                    totalBill += 210;
                                    orderedItems += "Pepper Chicken Biryani - ₹210\n";
                                    System.out.println("Pepper Chicken Biryani served successfully");
                                    break;

                                case 10:
                                    totalBill += 200;
                                    orderedItems += "Andhra Chicken Biryani - ₹200\n";
                                    System.out.println("Andhra Chicken Biryani served successfully");
                                    break;

                                case 11:
                                    totalBill += 190;
                                    orderedItems += "Ambur Chicken Biryani - ₹190\n";
                                    System.out.println("Ambur Chicken Biryani served successfully");
                                    break;

                                case 12:
                                    totalBill += 220;
                                    orderedItems += "Hyderabadi Chicken Biryani - ₹220\n";
                                    System.out.println("Hyderabadi Chicken Biryani served successfully");
                                    break;

                                default:
                                    System.out.println("Invalid Biryani choice!");
                            }

                            break;


                        case 2:

                            System.out.println("\n~~~~~~~ NON-VEG FRIED RICE ~~~~~~~");
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
                                    orderedItems += "Chicken Fried Rice - ₹160\n";
                                    System.out.println("Chicken Fried Rice served successfully");
                                    break;

                                case 2:
                                    totalBill += 180;
                                    orderedItems += "Chicken Schezwan Fried Rice - ₹180\n";
                                    System.out.println("Chicken Schezwan Fried Rice served successfully");
                                    break;

                                case 3:
                                    totalBill += 190;
                                    orderedItems += "Chicken 65 Fried Rice - ₹190\n";
                                    System.out.println("Chicken 65 Fried Rice served successfully");
                                    break;

                                case 4:
                                    totalBill += 130;
                                    orderedItems += "Egg Fried Rice - ₹130\n";
                                    System.out.println("Egg Fried Rice served successfully");
                                    break;

                                case 5:
                                    totalBill += 150;
                                    orderedItems += "Egg Schezwan Fried Rice - ₹150\n";
                                    System.out.println("Egg Schezwan Fried Rice served successfully");
                                    break;

                                case 6:
                                    totalBill += 180;
                                    orderedItems += "Chicken Manchurian Fried Rice - ₹180\n";
                                    System.out.println("Chicken Manchurian Fried Rice served successfully");
                                    break;

                                case 7:
                                    totalBill += 170;
                                    orderedItems += "Chicken Garlic Fried Rice - ₹170\n";
                                    System.out.println("Chicken Garlic Fried Rice served successfully");
                                    break;

                                case 8:
                                    totalBill += 170;
                                    orderedItems += "Chicken Pepper Fried Rice - ₹170\n";
                                    System.out.println("Chicken Pepper Fried Rice served successfully");
                                    break;

                                case 9:
                                    totalBill += 180;
                                    orderedItems += "Chicken Chilli Fried Rice - ₹180\n";
                                    System.out.println("Chicken Chilli Fried Rice served successfully");
                                    break;

                                case 10:
                                    totalBill += 220;
                                    orderedItems += "Mixed Non-Veg Fried Rice - ₹220\n";
                                    System.out.println("Mixed Non-Veg Fried Rice served successfully");
                                    break;

                                case 11:
                                    totalBill += 200;
                                    orderedItems += "Prawn Fried Rice - ₹200\n";
                                    System.out.println("Prawn Fried Rice served successfully");
                                    break;

                                case 12:
                                    totalBill += 190;
                                    orderedItems += "Fish Fried Rice - ₹190\n";
                                    System.out.println("Fish Fried Rice served successfully");
                                    break;

                                default:
                                    System.out.println("Invalid Fried Rice choice!");
                            }

                            break;


                        case 3:

                            System.out.println("\n~~~~~~~ NON-VEG STARTERS ~~~~~~~");
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
                                    orderedItems += "Chicken 65 - ₹160\n";
                                    System.out.println("Chicken 65 served successfully");
                                    break;

                                case 2:
                                    totalBill += 170;
                                    orderedItems += "Chicken 555 - ₹170\n";
                                    System.out.println("Chicken 555 served successfully");
                                    break;

                                case 3:
                                    totalBill += 170;
                                    orderedItems += "Chilli Chicken - ₹170\n";
                                    System.out.println("Chilli Chicken served successfully");
                                    break;

                                case 4:
                                    totalBill += 180;
                                    orderedItems += "Chicken Manchurian - ₹180\n";
                                    System.out.println("Chicken Manchurian served successfully");
                                    break;

                                case 5:
                                    totalBill += 200;
                                    orderedItems += "Chicken Lollipop - ₹200\n";
                                    System.out.println("Chicken Lollipop served successfully");
                                    break;

                                case 6:
                                    totalBill += 190;
                                    orderedItems += "Chicken Wings - ₹190\n";
                                    System.out.println("Chicken Wings served successfully");
                                    break;

                                case 7:
                                    totalBill += 200;
                                    orderedItems += "Chicken Tikka - ₹200\n";
                                    System.out.println("Chicken Tikka served successfully");
                                    break;

                                case 8:
                                    totalBill += 180;
                                    orderedItems += "Chicken Kebab - ₹180\n";
                                    System.out.println("Chicken Kebab served successfully");
                                    break;

                                case 9:
                                    totalBill += 170;
                                    orderedItems += "Pepper Chicken - ₹170\n";
                                    System.out.println("Pepper Chicken served successfully");
                                    break;

                                case 10:
                                    totalBill += 180;
                                    orderedItems += "Garlic Chicken - ₹180\n";
                                    System.out.println("Garlic Chicken served successfully");
                                    break;

                                case 11:
                                    totalBill += 200;
                                    orderedItems += "Chicken Majestic - ₹200\n";
                                    System.out.println("Chicken Majestic served successfully");
                                    break;

                                case 12:
                                    totalBill += 190;
                                    orderedItems += "Chicken Dragon - ₹190\n";
                                    System.out.println("Chicken Dragon served successfully");
                                    break;

                                case 13:
                                    totalBill += 160;
                                    orderedItems += "Chicken Pakora - ₹160\n";
                                    System.out.println("Chicken Pakora served successfully");
                                    break;

                                case 14:
                                    totalBill += 170;
                                    orderedItems += "Chicken Spring Roll - ₹170\n";
                                    System.out.println("Chicken Spring Roll served successfully");
                                    break;

                                case 15:
                                    totalBill += 200;
                                    orderedItems += "Fish Finger - ₹200\n";
                                    System.out.println("Fish Finger served successfully");
                                    break;

                                case 16:
                                    totalBill += 190;
                                    orderedItems += "Fish 65 - ₹190\n";
                                    System.out.println("Fish 65 served successfully");
                                    break;

                                case 17:
                                    totalBill += 200;
                                    orderedItems += "Chilli Fish - ₹200\n";
                                    System.out.println("Chilli Fish served successfully");
                                    break;

                                case 18:
                                    totalBill += 220;
                                    orderedItems += "Prawn 65 - ₹220\n";
                                    System.out.println("Prawn 65 served successfully");
                                    break;

                                case 19:
                                    totalBill += 230;
                                    orderedItems += "Chilli Prawn - ₹230\n";
                                    System.out.println("Chilli Prawn served successfully");
                                    break;

                                case 20:
                                    totalBill += 250;
                                    orderedItems += "Mutton Pepper Fry - ₹250\n";
                                    System.out.println("Mutton Pepper Fry served successfully");
                                    break;

                                default:
                                    System.out.println("Invalid Starter choice!");
                            }

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
                            orderedItems += "Coca Cola - ₹50\n";
                            System.out.println("Coca Cola served successfully");
                            break;

                        case 2:
                            totalBill += 50;
                            orderedItems += "Pepsi - ₹50\n";
                            System.out.println("Pepsi served successfully");
                            break;

                        case 3:
                            totalBill += 50;
                            orderedItems += "Sprite - ₹50\n";
                            System.out.println("Sprite served successfully");
                            break;

                        case 4:
                            totalBill += 50;
                            orderedItems += "Fanta - ₹50\n";
                            System.out.println("Fanta served successfully");
                            break;

                        case 5:
                            totalBill += 50;
                            orderedItems += "7 Up - ₹50\n";
                            System.out.println("7 Up served successfully");
                            break;

                        case 6:
                            totalBill += 50;
                            orderedItems += "Mountain Dew - ₹50\n";
                            System.out.println("Mountain Dew served successfully");
                            break;

                        case 7:
                            totalBill += 50;
                            orderedItems += "Limca - ₹50\n";
                            System.out.println("Limca served successfully");
                            break;

                        case 8:
                            totalBill += 60;
                            orderedItems += "Fresh Lime Soda - ₹60\n";
                            System.out.println("Fresh Lime Soda served successfully");
                            break;

                        case 9:
                            totalBill += 70;
                            orderedItems += "Fresh Lime Juice - ₹70\n";
                            System.out.println("Fresh Lime Juice served successfully");
                            break;

                        case 10:
                            totalBill += 80;
                            orderedItems += "Orange Juice - ₹80\n";
                            System.out.println("Orange Juice served successfully");
                            break;

                        case 11:
                            totalBill += 80;
                            orderedItems += "Mango Juice - ₹80\n";
                            System.out.println("Mango Juice served successfully");
                            break;

                        case 12:
                            totalBill += 30;
                            orderedItems += "Tea - ₹30\n";
                            System.out.println("Tea served successfully");
                            break;

                        case 13:
                            totalBill += 40;
                            orderedItems += "Coffee - ₹40\n";
                            System.out.println("Coffee served successfully");
                            break;

                        case 14:
                            totalBill += 90;
                            orderedItems += "Cold Coffee - ₹90\n";
                            System.out.println("Cold Coffee served successfully");
                            break;

                        case 15:
                            totalBill += 100;
                            orderedItems += "Milkshake - ₹100\n";
                            System.out.println("Milkshake served successfully");
                            break;

                        default:
                            System.out.println("Invalid Drink choice!");
                    }

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
                            orderedItems += "Vanilla Ice Cream - ₹60\n";
                            System.out.println("Vanilla Ice Cream served successfully");
                            break;

                        case 2:
                            totalBill += 70;
                            orderedItems += "Chocolate Ice Cream - ₹70\n";
                            System.out.println("Chocolate Ice Cream served successfully");
                            break;

                        case 3:
                            totalBill += 70;
                            orderedItems += "Strawberry Ice Cream - ₹70\n";
                            System.out.println("Strawberry Ice Cream served successfully");
                            break;

                        case 4:
                            totalBill += 80;
                            orderedItems += "Butterscotch Ice Cream - ₹80\n";
                            System.out.println("Butterscotch Ice Cream served successfully");
                            break;

                        case 5:
                            totalBill += 80;
                            orderedItems += "Black Currant Ice Cream - ₹80\n";
                            System.out.println("Black Currant Ice Cream served successfully");
                            break;

                        case 6:
                            totalBill += 100;
                            orderedItems += "Chocolate Sundae - ₹100\n";
                            System.out.println("Chocolate Sundae served successfully");
                            break;

                        case 7:
                            totalBill += 120;
                            orderedItems += "Brownie with Ice Cream - ₹120\n";
                            System.out.println("Brownie with Ice Cream served successfully");
                            break;

                        case 8:
                            totalBill += 60;
                            orderedItems += "Gulab Jamun - ₹60\n";
                            System.out.println("Gulab Jamun served successfully");
                            break;

                        case 9:
                            totalBill += 80;
                            orderedItems += "Rasmalai - ₹80\n";
                            System.out.println("Rasmalai served successfully");
                            break;

                        case 10:
                            totalBill += 70;
                            orderedItems += "Gajar Halwa - ₹70\n";
                            System.out.println("Gajar Halwa served successfully");
                            break;

                        case 11:
                            totalBill += 70;
                            orderedItems += "Kulfi - ₹70\n";
                            System.out.println("Kulfi served successfully");
                            break;

                        case 12:
                            totalBill += 100;
                            orderedItems += "Chocolate Cake - ₹100\n";
                            System.out.println("Chocolate Cake served successfully");
                            break;

                        case 13:
                            totalBill += 120;
                            orderedItems += "Black Forest Cake - ₹120\n";
                            System.out.println("Black Forest Cake served successfully");
                            break;

                        case 14:
                            totalBill += 90;
                            orderedItems += "Caramel Pudding - ₹90\n";
                            System.out.println("Caramel Pudding served successfully");
                            break;

                        case 15:
                            totalBill += 110;
                            orderedItems += "Fruit Salad with Ice Cream - ₹110\n";
                            System.out.println("Fruit Salad with Ice Cream served successfully");
                            break;

                        default:
                            System.out.println("Invalid Dessert choice!");
                    }

                    break;

                case 5:

                    System.out.println("\n=================================");
                    System.out.println("          RESTAURANT BILL");
                    System.out.println("=================================");

                    if (orderedItems.isEmpty()) {

                        System.out.println("No items ordered.");
                        System.out.println("=================================");

                    } else {

                        System.out.println("Ordered Items:");
                        System.out.println("---------------------------------");
                        System.out.println(orderedItems);

                        System.out.println("---------------------------------");
                        System.out.println("Food Bill : Rs." + totalBill);

                        System.out.print("Enter Tip Amount: Rs.");
                        int tip = sc.nextInt();

                        int finalBill = totalBill + tip;

                        System.out.println("---------------------------------");
                        System.out.println("Food Bill  : Rs." + totalBill);
                        System.out.println("Tip Amount : Rs." + tip);
                        System.out.println("Final Bill : Rs." + finalBill);
                        System.out.println("=================================");
                        System.out.println("       Thank You! Visit Again");
                        System.out.println("=================================");

                        System.exit(0);
                    }

                    break;


                case 6:

                    System.out.println("\nThank you for visiting!");
                    System.out.println("Please visit again.");

                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}