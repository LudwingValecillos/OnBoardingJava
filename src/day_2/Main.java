package day_2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person per = new Person();
        String [] mascotas = {"Gory","Lulu", "Yummi"};

        Person ludwing = new Person("ludwing","valecillos", "95931847" , 24, 1.70, false, mascotas );
        presentar(ludwing);

        System.out.println("-----------------------------------------------");
        Person pablo = new Person("pablo","perez", "959318sd7" , 15, 1.71, true, mascotas );
        System.out.println(pablo.toString());

//        pablo.toString();
//        presentar(pablo);
    }

    public static void presentar(Person p){

//        String casado =  p.isMarried() ? "Estoy casado/a" : "No estoy casado/a";

        System.out.println(" Presentacion de " + p.getFirstName() +": \n"
        + "¡Hola! Mi nombre es " + p.getFirstName() + " " + p.getLastName() +"\n"
        + "Tengo " + p.getAge() + " y mido " + p.getHeight() + " metros de altura" + "\n"
        + ( p.isMarried() ? "Estoy casado/a" : "No estoy casado/a") + "\n"
        + "Mi DNI es " + p.getIdentityCard() + "\n"
        + (Arrays.toString(p.getPetsNames())));
    }
}
