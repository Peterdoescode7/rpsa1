package sheridan.drabpe.rpsa1.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

public class Choice {

    @Min(0)
    @Max(2)
    private int pick= 0;

    public Choice(){
    }

    public Choice(int pick) {
        this.pick = pick;
    }

    public int getPick() {
        return pick;
    }

    public void setPick(int pick) {
        this.pick = pick;
    }

    @Override
    public String toString() {
        return "Choice{" +
                "pick=" + pick +
                '}';
    }
}
