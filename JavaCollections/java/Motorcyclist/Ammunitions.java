package Motorcyclist;

import Motorcyclist.comparator.ComparByWeight;
import Motorcyclist.interfaces.IAmmunitions;
import Motorcyclist.utils.Checker;

import java.util.Arrays;
import java.util.Comparator;

public class Ammunitions implements IAmmunitions {

    private Ammunition[] ammunitions;

    public Ammunitions(int count){
        ammunitions = new Ammunition[count];
    }

    public Ammunition[] getAmmunitions(){
        return ammunitions;
    }

    @Override
    public void addAmmunition(Ammunition ammunition) {
        if(Checker.checkLength(this.ammunitions)){
            int position  = Checker.getPosition(this.ammunitions);
            this.ammunitions[position] = ammunition;
        }else {
            System.out.println("Error!");
        }
    }

    @Override
    public int getTotalPrice() {
        int sum = 0;
        for (Ammunition ammunition : ammunitions) {
            if (ammunition != null) {
                sum += ammunition.getPrice();
            } else {
                break;
            }
        }
        return sum;
    }

    Comparator<Ammunition> ammComp = new ComparByWeight();

    public void sortingByWeight(){
        Arrays.sort(ammunitions, ammComp);
    }

    public void printFullInfoAboutAmmo(){
        for (Ammunition ammunition : ammunitions) {
            System.out.println(ammunition);
        }
    }

    public void priceRange(int minPrice, int maxPrice){
        System.out.println("Элементы амуниции, соответствующие заданному диапазону параметров цены:");
        for(Ammunition ammunition : ammunitions){
            if (ammunition.getPrice() > minPrice && ammunition.getPrice() < maxPrice){
                System.out.println(ammunition);
            }
        }
    }
}
