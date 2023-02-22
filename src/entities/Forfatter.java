package entities;

public class Forfatter {

    private int id;
    private String navn;

    public Forfatter(int id, String navn) {
        this.id = id;
        this.navn = navn;
    }

    public Forfatter(String navn) {
        this.navn = navn;
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

    public void setNavn(String name) {
        this.navn = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Forfatter forfatter = (Forfatter) o;
        return this.id == forfatter.id;
    }

    @Override
    public String toString() {
        return "Forfatter{" +
                "id=" + this.id +
                ", navn='" + this.navn + '\'' +
                '}';
    }
}