package people;


// Do not edit this file. It defines the abstract class for a person
abstract class Person {
    String firstName;
    String lastName;
    String identifier;

    /**
     * Person abstract class constructor
     * @param firstName First name
     * @param lastName Last name
     * @param iD ID
     */
    public Person (String firstName, String lastName, String iD){
        this.firstName = firstName;
        this.lastName = lastName;
        this.identifier = iD;
    }
}
