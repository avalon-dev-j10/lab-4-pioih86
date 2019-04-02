package ru.avalon.java.dev.j10.labs;
import java.util.Comparator;

public class SortPerson implements Sort{

    public SortPerson() {
    }
    
    
    
    public void sort(Person[] persons){
        Person buff = new Human();
    String name1;
    String name2;
        for(int i = 0; i < persons.length ; i++){
            for(int j = persons.length-1; j > i; j--){
                    name1 = persons[i].getName();
                    name2 = persons[j].getName();
                if (name1.compareTo(name2) > 0){
                    buff = persons[i];
                    persons[i] = persons[j];
                    persons[j] = buff;
                }
            }
        }
        return;
    };
    
    public void sort(Comparable[] array){return;}
    public void sort(Object[] array, Comparator comparator){return;}
      
}
