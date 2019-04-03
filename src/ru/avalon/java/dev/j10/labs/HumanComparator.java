package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;

//Компаратор людей

public class HumanComparator implements Comparator<Human>{
    public int compare(Human h1, Human h2){
        if (h1.getBirthDate().compareTo(h2.getBirthDate()) > 0){
            return 1;
        } 
        if (h1.getBirthDate().compareTo(h2.getBirthDate()) < 0){
            return -1;
        }
        return 0;
    }    
}
