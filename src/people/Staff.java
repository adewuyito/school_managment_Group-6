package people;

/**
 * This defines the staff class
 * where we'd work on the staff user with its methods.
 * Do not directly define a new method here. Do that in the corresponding
 * interface before implementation here.
 */
public class Staff extends Person implements StaffInterface{

    /**
     * Staff Constructor
     * @param firstName Persons first name
     * @param lastName Persons last name
     * @param iD Generated user ID
     */
    public Staff(String firstName, String lastName, String iD) {
        super(firstName, lastName, iD);
    }

}
