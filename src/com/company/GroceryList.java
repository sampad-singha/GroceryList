package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class GroceryList {

    private final ArrayList<String> GroceryList = new ArrayList<>();

    public void addItem(String item){
        GroceryList.add(item);
    }

    public void printItem(){
        System.out.println("Total " + GroceryList.size() + " Items.");

        for(int i = 0; i < GroceryList.size(); i++){
            System.out.println((i+1) + ". " + GroceryList.get(i));
        }
    }

    public void modifyItem(String item,String newItem){
        int index = searchItem(item);
        if(index >= 0){
            GroceryList.set(index, newItem);
            System.out.println("Item changed.");
        }else {
            System.out.println("Item not found");
        }
    }

    public void removeItem(String item){
        int index = searchItem(item);
        if(index >= 0){
            GroceryList.remove(index);
            System.out.println("Item removed.");
        }else {
            System.out.println("Item not found");
        }

    }

    public int searchItem(String item){
        return GroceryList.indexOf(item.toLowerCase(Locale.ROOT));
    }

}
