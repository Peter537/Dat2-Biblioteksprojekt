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

    public Bog(String titel, Forfatter forfatter) {
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }

        Bog bog = (Bog) o;
        return this.id == bog.id;
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