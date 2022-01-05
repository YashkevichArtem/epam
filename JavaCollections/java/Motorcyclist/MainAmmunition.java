package Motorcyclist;
import Motorcyclist.items.*;
import Motorcyclist.utils.PrintOut;

public class MainAmmunition {
    public static void main(String[] args) {
        Ammunitions amm = new Ammunitions(3);

        Helmet helmet = new Helmet();
        Gloves gloves = new Gloves();
        Shoes shoes = new Shoes();

        amm.addAmmunition(helmet);
        amm.addAmmunition(gloves);
        amm.addAmmunition(shoes);

        amm.sortingByWeight();

        PrintOut.printOut(amm.getAmmunitions());

        amm.printFullInfoAboutAmmo();

        PrintOut.printPrice(amm.getTotalPrice());

        amm.priceRange(79,101);





    }
}
