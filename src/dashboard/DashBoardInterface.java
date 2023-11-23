package dashboard;

public interface DashBoardInterface {
    /**
     * Adds a new person to database
     * @param personType Person type
     */
    void addPerson(Type personType);

    /**
     * Deletes a person from the database
     * @param personType Person type
     */
    void deletePerson(Type personType);

    /**
     * Prints the database
     * @param personType Person type
     */
    void showData(Type personType);
}
