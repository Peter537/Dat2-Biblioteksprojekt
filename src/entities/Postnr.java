package entities;

public class Postnr {

    private int postnr;
    private String bynavn;

    public Postnr(int postnr, String bynavn) {
        this.postnr = postnr;
        this.bynavn = bynavn;
    }

    public int getPostnr() {
        return this.postnr;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }

    public String getBynavn() {
        return this.bynavn;
    }

    public void setBynavn(String bynavn) {
        this.bynavn = bynavn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Postnr postnrOther = (Postnr) o;
        return this.postnr != postnrOther.postnr;
    }

    @Override
    public String toString() {
        return "Postnr{" +
                "postnr=" + this.postnr +
                ", bynavn='" + this.bynavn + '\'' +
                '}';
    }
}