package day_3;

public class Pet {
    private String name;
    private PetType petType;

    private int ege;
    private Person owner;

    public Pet() {
    }

    public Pet(String name, PetType petType, int ege) {
        this.name = name;
        this.petType = petType;
        this.ege = ege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEge() {
        return ege;
    }

    public void setEge(int ege) {
        this.ege = ege;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }


}
