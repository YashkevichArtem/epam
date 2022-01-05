package Motorcyclist.comparator;

import Motorcyclist.Ammunition;

import java.util.Comparator;

public class ComparByWeight implements Comparator<Ammunition> {
    @Override
    public int compare(Ammunition o1, Ammunition o2){
        if(o1.getWeight() > o2.getWeight()) {
            return 1;
        }else if(o1.getWeight() < o2.getWeight()){
            return -1;
        }else {
            return 0;
        }
    }
}
