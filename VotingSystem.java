import java.util.ArrayList;

/**
 * Create a vote.
 */
public class VotingSystem {
    private  ArrayList<Voting> votingList;

    /**
     * Allocate a memory for votingList.
     */
    public VotingSystem(){
        votingList = new ArrayList<>();
    }
    public ArrayList<Voting> getVotingList(){
        return votingList;
    }
    /**
     * Create a system of voting.
     * @param question the question of voting.
     * @param mode the state of voting.
     */
    public void createVoting(String question , int mode, ArrayList<String > choices){
        Voting voting = new Voting(mode , question);
        votingList.add(voting);
        for (int i = 0; i < choices.size(); i++) {
            voting.createChoice(choices.get(i));
        }
    }

    /**
     * Print questions of the votings
     */
    public void printListOfVoting(){
        for(int i = 0; i < votingList.size(); i++){
            System.out.println(votingList.get(i).getQuestion());
        }
    }

    /**
     * Print question and choices of the voting
     * @param index the index
     */
    public void printVoting(int index){
        System.out.println(votingList.get(index).getQuestion());
        votingList.get(index).printChoices();
    }

    /**
     * make a vote
     * @param index the number of the voting
     * @param voter a person who votes
     * @param votes A list of votes
     */
    public void vote(int index, Person voter, ArrayList<String> votes){
        /*if((votingList.get(index).getMode() == 0) && (votes.size() == 1)){
            votingList.get(index).vote(voter, votes);
        }
        else{
            System.out.println("You should choose only one choice!");
        }
        if (votingList.get(index).getMode() == 1){
            votingList.get(index).vote(voter, votes);
        }*/
        votingList.get(index).vote(voter, votes);
    }

    /**
     * print the result of the voting
     * @param index index of the voting
     */
    public void printResult(int index) {
        if ((index >= 0) && (index <= votingList.size())) {
            votingList.get(index).printResult();
        }
        else {
            System.out.println("Invalid index!");
        }
    }
}
