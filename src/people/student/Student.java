package people.student;

import people.Person;

/**
 * This defines the student class
 * where we'd work on the staff user with its methods.
 * Do not directly define a new method here. Do that in the corresponding
 * interface before implementation here.
 */
public class Student extends Person implements StudentInterface{


    /**
     * Student - Student Constructor
     * @param firstName - Persons first name
     * @param lastName - Persons last name
     * @param iD - Generated user ID
     */
    public Student(String firstName, String lastName, String iD) {
        super(firstName, lastName, iD);
    }


}
