package Motorcyclist.utils;

import Motorcyclist.Ammunition;

public class Checker {
    public static boolean checkLength(Ammunition ammunitions[]){
        boolean flag = true;
        if(ammunitions[ammunitions.length - 1] != null){
            flag = false;
        }
        return flag;
    }
    public static int getPosition(Ammunition ammunitions[]){
        int position = 0;

        for(int i = 0; i < ammunitions.length; i++){
            if(ammunitions[i] == null){
                position = i;
                break;
            }
        }
        return position;
    }
}
