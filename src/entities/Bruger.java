package entities;

public class Bruger {

    private int id;
    private String navn;
    private String adresse;
    private Postnr postnr;

    public Bruger(int id, String navn, String adresse, Postnr postnr) {
        this.id = id;
        this.navn = navn;
        this.adresse = adresse;
        this.postnr = postnr;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return this.navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Postnr getPostnr() {
        return this.postnr;
    }

    public void setPostnr(Postnr postnr) {
        this.postnr = postnr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Bruger bruger = (Bruger) o;
        return this.id != bruger.id;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "id=" + this.id +
                ", navn='" + this.navn + '\'' +
                ", adresse='" + this.adresse + '\'' +
                ", postnr=" + this.postnr +
                '}';
    }
}