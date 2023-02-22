package entities;

public class Forfatter {

    private int id;
    private String name;

    public Forfatter(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Forfatter(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", name='" + this.name + '\'' +
                '}';
    }
}