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

    public String getStatus(Choice choice, Opponent opponent){
        String status = "";
        int userPick1 = choice.getPick();
        int oppPick1 = opponent.getOppPick();
        switch (userPick1) {
            case 0:
                if (oppPick1 == 0) {
                    status = "Rock versus Rock, it's a tie!";
                    return status;
                } else if (oppPick1 == 1) {
                    status = "Rock versus Paper you lose!";
                    return status;
                } else if (oppPick1 == 2) {
                    status = "Rock versus Scissors you win!";
                    return status;
                }
                break;
            case 1:
                if (oppPick1 == 0) {
                    status = "Paper versus Rock you win!";
                    return status;
                } else if (oppPick1 == 1) {
                    status = "Paper versus Paper, it's a tie!";
                    return status;
                } else if (oppPick1 == 2) {
                    status = "Paper versus Scissors you lose!";
                    return status;
                }
                break;
            case 2:
                if (oppPick1 == 0) {
                    status = "Scissors versus Rock you lose!";
                    return status;
                } else if (oppPick1 == 1) {
                    status = "Scissors versus Paper you win!";
                    return status;
                } else if (oppPick1 == 2) {
                    status = "Scissors versus Scissors, it's a tie!";
                    return status;
                }
                break;
        }
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
}
