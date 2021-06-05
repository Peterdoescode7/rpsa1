package sheridan.drabpe.rpsa1.domain;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Winner implements Serializable {

    private String status = "";

    public Winner() {
    }

    public Winner(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Winner{" +
                "status='" + status + '\'' +
                '}';
    }

    public String whoWins(Choice choice, Opponent opponent) {
        String theWinner = "";
        int userPick1 = choice.getPick();
        int oppPick1 = opponent.getOppPick();
        switch (userPick1) {
            case 0:
                if (oppPick1 == 0) {
                    theWinner = "Rock versus Rock, it's a tie!";
                    return theWinner;
                } else if (oppPick1 == 1) {
                    theWinner = "Rock versus Paper you lose!";
                    return theWinner;
                } else if (oppPick1 == 2) {
                    theWinner = "Rock versus Scissors you win!";
                    return theWinner;
                }
                break;
            case 1:
                if (oppPick1 == 0) {
                    theWinner = "Paper versus Rock you win!";
                    return theWinner;
                } else if (oppPick1 == 1) {
                    theWinner = "Paper versus Paper, it's a tie!";
                    return theWinner;
                } else if (oppPick1 == 2) {
                    theWinner = "Paper versus Scissors you lose!";
                    return theWinner;
                }
                break;
            case 2:
                if (oppPick1 == 0) {
                    theWinner = "Scissors versus Rock you lose!";
                    return theWinner;
                } else if (oppPick1 == 1) {
                    theWinner = "Scissors versus Paper you win!";
                    return theWinner;
                } else if (oppPick1 == 2) {
                    theWinner = "Scissors versus Scissors, it's a tie!";
                    return theWinner;
                }
                break;
        }
        return theWinner;
    }
}
