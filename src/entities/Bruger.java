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
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Postnr getPostnr() {
        return postnr;
    }

    public void setPostnr(Postnr postnr) {
        this.postnr = postnr;
    }

    @Override
    public String toString() {
        return "Bruger{" +
                "id=" + id +
                ", navn='" + navn + '\'' +
                ", adresse='" + adresse + '\'' +
                ", postnr=" + postnr +
                '}';
    }
}