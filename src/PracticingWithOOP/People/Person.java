package PracticingWithOOP.People;

public abstract class Person {
    private String name;
    private String surname;
    private String address;

    public Person(String enterName, String enterSurname, String enterAddress) {
        this.name = enterName;
        this.surname = enterSurname;
        this.address = enterAddress;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String enterName) {
        this.name = enterName;
    }

    public void setAddress(String enterAddress) {
        this.address = enterAddress;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void testMethodFromPerson(){
        System.out.println("I'm a test method and I was called from Person abstract class");
    }

    @Override
    public String toString () {
        return String.format("%s %s who lives at %s", this.name, this.surname, this.address);
    }
}