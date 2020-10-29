/**
 * This class represents the specification of a person

 */

public class Person {
    private String firstName;
    private String lastName;

    /**
     * Create a person
     * @param firstName first name of the person
     * @param lastName last name of the person
     */
    public Person(String firstName, String lastName){
        this.firstName =firstName;
        this.lastName = lastName;
    }
    /**
     * get the first name
     * @return String first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * set the first name
     * @param firstName  first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * get the last name
     * @return String last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * set the last name
     * @param lastName last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
