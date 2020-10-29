import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;

/**
 * keep the information of a vote
 */
public class Voting {
    private int mode;
    private HashMap<String, HashSet<Vote>> choices;
    private String question;

    /**
     * initialize the fields of Voting's class
     * @param mode state of voting
     * @param question The question of the voting
     */
    public Voting(int mode, String question){
        choices = new HashMap<>();
        this.mode = mode;
        this.question = question;
    }

    /**
     * Get the state of voting
     * @return int mode
     */
    public int getMode() {
        return mode;
    }

    /**
     * Set the state of voting
     * @param mode state of voting
     */
    public void setMode(int mode) {
        this.mode = mode;
    }

    /**
     * Get the question of voting
     * @return String question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * Set the question of voting
     * @param question The question of voting
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * Add a choice to the voting
     * @param choiceName The name of the choice
     */
    public void createChoice(String choiceName){
        HashSet<Vote> votes = new HashSet<>();
        choices.put(choiceName, votes);
    }

    /**
     * Enter a vote from the voter
     * @param voter A person who votes
     * @param choicesToVote choices which are chosen by voter
     */
    public void vote(Person voter, ArrayList<String> choicesToVote) {
        JalaliCalendar jalaliDate = new JalaliCalendar(new GregorianCalendar());
        Vote vote = new Vote(voter, jalaliDate.toString());
        for (int i = 0; i < choicesToVote.size(); i++) {
            choices.get(choicesToVote.get(i)).add(vote);
        }
    }

    /**
     * Print the result of voting
     */
    public void printResult(){
        for (String s: choices.keySet()) {
            System.out.println(s +" "+ choices.get(s).size());
            for(Vote vote: choices.get(s))
              System.out.println(vote.getVoter().getFirstName() +"  "+ vote.getDate());
        }
    }
    public void printChoices(){
        for(String s: choices.keySet()){
            System.out.println(s);
        }
    }

}
