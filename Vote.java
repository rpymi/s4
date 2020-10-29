/**
 * keep the data of the voter
 */

public class Vote {
   private Person voter;
   private String date;

    /**
     * Create a vote.
     * @param voter a person who votes.
     * @param date The date of voting.
     */
   public Vote(Person voter, String date){
       this.voter = voter;
       this.date = date;
   }

    /**
     * Get the voter's information .
     * @return Person voter.
     */
    public Person getVoter() {
        return voter;
    }

    /**
     * Set the voter;s information.
     * @param voter Person who votes.
     */
    public void setVoter(Person voter) {
        this.voter = voter;
    }

    /**
     * Get the date of voting.
     * @return String date.
     */
    public String getDate() {
        return date;
    }

    /**
     * Set the date of voting.
     * @param date The date of voting.
     */
    public void setDate(String date) {
        this.date = date;
    }

}
