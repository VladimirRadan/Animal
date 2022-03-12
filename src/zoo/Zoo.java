package zoo;

import java.util.Arrays;

public class Zoo {

    public static void main(String[] args) {

        Bird bird = new Bird("Hawk", 10, "F", 15);
        Eagle eagle = new Eagle("Eagle", 5, "M", 25);
        Bird bigEagle = new Eagle("Big Eagle", 10, "F", 40);

        Hawk hawk = new Hawk("Hawk 2", 10, "F", 40);

        Fish fish = new Fish("Fish", 5, "M", 15);

        Animal tiger = new Tiger("Tiger", 10, "F", 50);

        Flyable flyable = new Hawk("Flying hawk", 10, "F", 50);
        flyable.fly();


        //Napraviti apstraktnu klasu Radnik
        //Napraviti main klasu za ispis
        //Sub klase: radnik po satu, radnik po danu, radnik fiksno
        //polja: ime, prezime, jmbg, ziro racun, plata
        //napraviti metod isplatiPlatu() koji ce da ispisuje podatke radnika i obracun za svakog radnika posebno
        //u main klasi podakte za svaki objekat puniti preko Scanner klase

        //uraditi zadatak 4 iz skripte





        Animal [] animals = {eagle, fish, tiger, bird};

        //System.out.println(animals[3]);
       System.out.println(Arrays.toString(animals));

        moveAnimals(eagle);
        moveAnimals(fish);
        moveAnimals(tiger);

    }

    public static void moveAnimals(Animal animal){
          animal.move();
    }



}//end class
