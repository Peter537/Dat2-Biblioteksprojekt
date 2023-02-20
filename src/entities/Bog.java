package entities;

public class Bog {

    private int id;
    private String titel;
    private Forfatter forfatter;

    public Bog(int id, String titel, Forfatter forfatter) {
        this.id = id;
        this.titel = titel;
        this.forfatter = forfatter;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitel() {
        return this.titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public Forfatter getForfatter() {
        return this.forfatter;
    }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "id=" + this.id +
                ", titel='" + this.titel + '\'' +
                ", forfatter=" + this.forfatter +
                '}';
    }
}