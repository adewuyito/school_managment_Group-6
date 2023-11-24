package people.staff;


import java.time.LocalDate;
import people.Person;

/**
 * This defines the staff class
 * where we'd work on the staff user with its methods.
 * Do not directly define a new method here. Do that in the corresponding
 * interface before implementation here.
 */
public class Staff extends Person implements StaffInterface {

    private LocalDate dateOfBirth;
    private String gender;
    private String contactNumber;
    private String emailAddress;

    private String[] subjects;

    private double salary;

    /**
     * Staff Constructor
     * 
     * @param firstName Persons first name
     * @param lastName  Persons last name
     * @param iD        Generated user ID
     */
    public Staff(String firstName, String lastName, String iD) {
        super(firstName, lastName, iD);
    }

    /* Class Defined Methods */
    public void setMail(String email) {
        this.emailAddress = email;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setGender(String gender) {
        String newGender = gender.toLowerCase();
        if (newGender == "m") {
            this.gender = newGender;
        } else if (newGender == "f") {
            this.gender = newGender;
        } else {
            System.err.println("Genders are either M or F");
        }
    }

    public void setDate(int day, int month, int year) {
        try {
            dateOfBirth = LocalDate.of(year, month, day);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public LocalDate getDate(){
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getMail() {
        return emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    /* Inherited Methods */
    @Override
    public void setGrade() {
        throw new UnsupportedOperationException("Unimplemented method 'setGrade'");
    }

    @Override
    public int getGrade() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGrade'");
    }

    @Override
    public String getStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getStudent'");
    }

}
