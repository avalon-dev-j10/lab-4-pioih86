package ru.avalon.java.dev.j10.labs;

import java.time.LocalDate;

public class Human implements Person {
    
    String name;
    LocalDate birthDate;

    public Human(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Human() {
        name = "Безымянный";
        birthDate = LocalDate.of(2000, 1, 1);
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String getName() {
        return name;
    }
        
    public int compareTo(Person human){
        if (this.getName().compareTo(human.getName()) > 0){
            return 1;
        } 
        if (this.getName().compareTo(human.getName()) < 0){
            return -1;
        }
        return 0;
//        return (this.getName().compareTo(human.getName()));
    }
        
}
