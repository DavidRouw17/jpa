package objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fiets {

    @Id
    @GeneratedValue
    private long id;

    private String merk;

    private String type;

    public Fiets(){}

    public Fiets(String merk, String type){
        this.merk = merk;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Fiets{" +
                "id=" + id +
                ", merk='" + merk + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
