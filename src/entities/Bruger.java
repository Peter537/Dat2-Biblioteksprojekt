package entities;

public class Bruger {

    private int id;
    private String navn;
    private String adresse;
    private int postnr;

    public Bruger(int id, String navn, String adresse, int postnr) {
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

    public int getPostnr() {
        return postnr;
    }

    public void setPostnr(int postnr) {
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