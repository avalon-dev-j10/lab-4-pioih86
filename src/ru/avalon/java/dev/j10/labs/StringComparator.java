package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;

//Компаратор строк

public class StringComparator implements Comparator<String>{
    
    boolean up;                                     //Направление сортировки

    public StringComparator() {                     
        up = true;
    }

    public StringComparator(boolean up) {
        this.up = up;
    }
    
    public int compare(String s1, String s2){
        if(up){
            if (s1.compareTo(s2) > 0){
                return 1;
            } 
            if (s1.compareTo(s2) < 0){
                return -1;
            }
        } else {
            if (s1.compareTo(s2) < 0){
                return 1;
            } 
            if (s1.compareTo(s2) > 0){
                return -1;
            }
        }
        return 0;
    }  
        
}
