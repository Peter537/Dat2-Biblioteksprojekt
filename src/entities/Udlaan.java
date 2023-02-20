package entities;

public class Udlaan {

    private int id;
    private Bruger bruger;
    private Bog bog;

    public Udlaan(int id, Bruger bruger, Bog bog) {
        this.id = id;
        this.bruger = bruger;
        this.bog = bog;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bruger getBruger() {
        return bruger;
    }

    public void setBruger(Bruger bruger) {
        this.bruger = bruger;
    }

    public Bog getBog() {
        return bog;
    }

    public void setBog(Bog bog) {
        this.bog = bog;
    }

    @Override
    public String toString() {
        return "Udlaan{" +
                "id=" + id +
                ", bruger=" + bruger +
                ", bog=" + bog +
                '}';
    }
}