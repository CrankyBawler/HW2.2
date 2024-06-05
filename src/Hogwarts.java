import java.util.Objects;

public class Hogwarts {
    public String name;
    public int magic;
    public int transgression;

    public Hogwarts(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hogwarts)) return false;
        Hogwarts hogwarts = (Hogwarts) o;
        return magic == hogwarts.magic && transgression == hogwarts.transgression && Objects.equals(name, hogwarts.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, magic, transgression);
    }

    @Override
    public String toString() {
        return "Hogwarts{" +
                "name='" + name + '\'' +
                ", magic=" + magic +
                ", transgression=" + transgression +
                '}';
    }
}
