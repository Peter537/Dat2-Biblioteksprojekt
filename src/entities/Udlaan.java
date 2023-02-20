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
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Bruger getBruger() {
        return this.bruger;
    }

    public void setBruger(Bruger bruger) {
        this.bruger = bruger;
    }

    public Bog getBog() {
        return this.bog;
    }

    public void setBog(Bog bog) {
        this.bog = bog;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Udlaan udlaan = (Udlaan) o;
        return this.id == udlaan.id;
    }

    @Override
    public String toString() {
        return "Udlaan{" +
                "id=" + this.id +
                ", bruger=" + this.bruger +
                ", bog=" + this.bog +
                '}';
    }
}