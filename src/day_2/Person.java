package day_2;

import java.util.Arrays;

public class Person {
    private String firstName, lastName, identityCard;
    private int age;
    private double height;

    private boolean married;

    private String[] petsNames;

    public Person() {
    }

    public Person(String firstName, String lastName, String identityCard, int age, double height, boolean married, String[] petsNames) {
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

    public String[] getPetsNames() {
        return petsNames;
    }

    public void setPetsNames(String[] petsNames) {
        this.petsNames = petsNames;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", identityCard='" + identityCard + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + (married ? "Estoy casado/a" : "No estoy casado/a") +
                ", petsNames=" + Arrays.toString(petsNames) +
                '}';
    }
}

