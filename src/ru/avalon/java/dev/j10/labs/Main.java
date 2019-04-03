package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        /*
         * TODO(Студент): Проинициализируйте массив strings
         *
         * Массив слелдует проинициализировать таким образом,
         * чтобы он содержал 20 строк, расположенных не
         * по порядку.
         */
//	    String[] strings = null;
            String[] strings = {"asdad", "asfasf"
                ,"qwe",     "qwxzc"
                ,"21eqwa",  "asfasfasf"
                ,"asdasf",  "cvbcb"
                ,"dfnd",    "dfncvn"
                ,"dfndv",   ""
                ,"e43435",  "dfndf"
                ,"345345",  "dfg4"
                ,"klhj;",   ""
                ,"/.m",     "fgf"};
    

	    /*
	     * TODO(Студент): Проинициализируйте массив persons
	     *
	     * 1. Создайте класс, реализующий интерфейс Person.
	     *
	     * 2. Проинициализируйте массив persons 20
	     *    экземплярыми созданного класса.
	     */
//	    Person[] persons = null;
    Person[] persons = { new Human("sdgv", LocalDate.of(1987,12,21))
            , new Human("xcbx ",    LocalDate.of(1994, 2, 2))
            , new Human("xcxce",    LocalDate.of(1987,2,21))
            , new Human("xcb x",    LocalDate.of(1965,1,1))
            , new Human("xcbbsbd",  LocalDate.of(1987,1,22))
            , new Human("xc xc",    LocalDate.of(1987,2,21))
            , new Human("nrre",     LocalDate.of(1987,11,22))
            , new Human("cxbxb",    LocalDate.of(1982,7,25))
            , new Human("xcbx",     LocalDate.of(1987,2,21))
            , new Human("cxbx",     LocalDate.of(1976,12,3))
            , new Human()
            , new Human("xcbxc",    LocalDate.of(2000,2,21))
            , new Human("bxxcb",    LocalDate.of(1992,9,9))
            , new Human()
            , new Human("xcbx",     LocalDate.of(1982,2,10))
            , new Human()
            , new Human("avsadvsv", LocalDate.of(2001,1,2))
            , new Human("asvasv a", LocalDate.of(1991,3,21))
            , new Human()
            , new Human()                        
            } ;
            
        
        /*
         * TODO(Студент): Проинициализируйте переменную sort
         *
         * 1. Создайте класс, реализующий интерфейс Sort
         *
         * 2. Проинициализируйте переменную sort экземпляром
         *    созданного класса.
         */
        Sort sort = new SortPerson();
        
        
       
     

        /*
         * TODO(Студент): Проинициализируйте переменную comparator
         *
         * 1. Создайте класс, реализующий интерфейс Comparator.
         *    Подумайте о контексте, в котором будет
         *    использоваться экземпляр.
         *
         * 2. Проинициализируйте переменную comparator
         *    экземпляром созданного класса.
         */
        Comparator comparator = new StringComparator(false);

        /*
         * TODO(Студент): Отсортируйте массив persons по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
//        sort.sort(persons);
        sort.sort(persons);
        for ( int i = 0; i < persons.length; i++){
            System.out.println(persons[i].getName());
        }

        /*
         * TODO(Студент): Отсортируйте массив strings по возрастанию
         *
         * 1. Если всё сделано правильно, предложенный вызов
         *    метода sort должен отсортировать массив по
         *    возрастанию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по возрастанию.
         */
        sort.sort(strings);
//        for ( int i = 0; i < strings.length; i++){
//            System.out.println(strings[i]);
//        }

        /*
         * TODO(Студент): Отсортируйте массив strings по убыванию
         *
         * 1. Подумайте о том, какой Comparator следует
         *    передать, чтобы массив сортировался по убыванию.
         *
         * 2. С использованием отладчика убедитесь в том,
         *    что массив отсортирован по убыванию.
         */
        sort.sort(strings, comparator);
        for ( int i = 0; i < strings.length; i++){
            System.out.println(strings[i]);
        }
    }
}
