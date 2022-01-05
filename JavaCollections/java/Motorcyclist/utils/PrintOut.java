package Motorcyclist.utils;

import Motorcyclist.Ammunition;

public class PrintOut {

    public static void printOut(Ammunition[] ammunitions){
        StringBuilder str = new StringBuilder(ammunitions.length);
        str.append("[ ");
        for(Ammunition ammunition : ammunitions){
            str.append(ammunition.getName());
            str.append("; ");
        }
        str.append("]");
        System.out.println(str);
    }

    public static void printPrice(int price){
        System.out.println("\nTotal price: " + price + "\n");
    }


}
