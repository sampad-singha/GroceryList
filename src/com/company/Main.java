package com.company;

import java.util.Scanner;

public class Main {
    private static final Scanner s = new Scanner(System.in);
    private static final GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    /*
	    *. Main menu
	    1. Add Item
	    2. Remove Item
	    3. Change Item
	    4. Show Items
	    5. Search item
	    6. quit
	     */

        boolean quit = false;
        int choice;

        mainMenu();

        while (!quit){
            System.out.println("Enter choice");
            choice = s.nextInt();
            s.nextLine();
            switch (choice) {

                case 1 :
                    System.out.println("Type Items.");
                    addItem();
                    break;

                case 2 :
                    removeItem();
                    break;

                case 3 :
                    changeItem();
                    break;

                case 4 :
                    groceryList.printItem();
                    break;

                case 5 :
                    searchItem();
                    break;

                case 6 :
                    quit = true;
                    break;

                case 0 :
                    mainMenu();
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void mainMenu(){
        System.out.println("press 1. Add Item\n" +
                "press 2. Remove Item\n" +
                "press 3. Change Item\n" +
                "press 4. Show Items\n" +
                "press 5. Search item\n" +
                "press 6. quit\n");
    }

    public static void addItem(){
        String item;
        System.out.println("Enter * for main menu.");

        while (true){
            item = s.nextLine();

            if(item.equals("*")){
                mainMenu();
                break;
            }else {
                groceryList.addItem(item);
            }
        }
    }

    public static void removeItem(){
        System.out.println("Enter item name");
        groceryList.removeItem(s.nextLine());
    }

    public static void changeItem(){
        System.out.println("Enter item name");
        String item = s.nextLine();
        System.out.println("Enter new item name");
        groceryList.modifyItem(item, s.nextLine());
    }

    public static void searchItem(){
        System.out.println("Enter item name");
        String item = s.nextLine();
        int flag = groceryList.searchItem(item);

        if(flag == -1){
            System.out.println("Item not found");
        }else{
            System.out.println("Item " +(flag + 1) + ". " + item + " found.");
        }
    }
}
