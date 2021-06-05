package sheridan.drabpe.rpsa1.domain;

import java.io.Serializable;

@SuppressWarnings("unused")
public class Winner implements Serializable {

    private String status = "";

    public Winner(){
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
}
