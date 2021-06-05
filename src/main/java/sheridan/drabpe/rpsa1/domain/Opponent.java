package sheridan.drabpe.rpsa1.domain;

import java.util.Random;

@SuppressWarnings("unused")
public class Opponent {

    private int oppPick= 0;

    public Opponent(){
    }

    public Opponent(int oppPick) {
        this.oppPick = oppPick;
    }

    public int getOppPick() {
        return oppPick;
    }

    public void setOppPick(int oppPick) {
        this.oppPick = randPick();
    }

    @Override
    public String toString() {
        return "Opponent{" +
                "oppPick=" + oppPick +
                '}';
    }

    public int randPick(){
        Random random = new Random();
        int intInRange = random.nextInt(2 - 0) + 0;
        return intInRange;
    }

}
