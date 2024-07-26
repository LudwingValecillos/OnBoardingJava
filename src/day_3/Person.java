package day_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Person {
    private String firstName, lastName, identityCard;
    private int age;
    private double height;

    private boolean married;

    private List<Pet> petsNames = new ArrayList<>();

    public Person() {
    }

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
    }

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, List<Pet> petsNames) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityCard = identityCard;
        this.age = age;
        this.height = height;
        this.married = married;
        this.petsNames = petsNames;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lasrName) {
        this.lastName = lasrName;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public List<Pet> getPetsNames() {
        return  petsNames;
    }
    public void addPet(Pet pet){
        this.petsNames.add(pet);

        pet.setOwner(this);
    }

    public void setPetsNames(List<Pet> petsNames) {
        this.petsNames = petsNames;
    }

    public void presentar(){

//        String casado =  p.isMarried() ? "Estoy casado/a" : "No estoy casado/a";

        System.out.println(" Presentacion de " + this.firstName +": \n"
                + "¡Hola! Mi nombre es " + this.firstName + " " + this.lastName +"\n"
                + "Tengo " + this.age + " y mido " + this.height + " metros de altura" + "\n"
                + ( this.married ? "Estoy casado/a" : "No estoy casado/a") + "\n"
                + "Mi DNI es " + this.identityCard);
        if (!this.petsNames.isEmpty()){
            System.out.println("Mis mascotas son:");
            mascotas(this.petsNames);
        }else System.out.println("No tengo mascotas :(");
        ;
    }
    public void mascotas( List<Pet> pet){

        for (Pet mascota : pet){
            System.out.println("- " + mascota.getName() + " es un " + mascota.getPetType() + " y tiene " + mascota.getEge());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", petsNames=" + (Arrays.toString(new List[]{petsNames}))  +

                '}';
    }
}

