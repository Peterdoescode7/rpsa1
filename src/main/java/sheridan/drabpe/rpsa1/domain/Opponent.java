package sheridan.drabpe.rpsa1.domain;

import java.util.Random;
import java.io.Serializable;

@SuppressWarnings("unused")
public class Opponent implements Serializable{

    private int oppPick= randPick();

    public Opponent(){
    }

    public Opponent(int oppPick) {
        this.oppPick = oppPick;
    }

    public int getOppPick() {
        return oppPick;
    }

    public void setOppPick(int oppPick) {
        this.oppPick = oppPick;
    }

    @Override
    public String toString() {
        return "Opponent{" +
                "oppPick=" + oppPick +
                '}';
    }

    public int randPick(){
        Random random = new Random();
        return random.nextInt(3);
    }
}
