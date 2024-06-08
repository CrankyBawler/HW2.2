import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    public int wise;
    public int witty;
    public int creativity;

    public Ravenclaw(String name, int magic, int transgression, int wise, int witty, int creativity) {
        super(name, magic, transgression);
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getWise() {
        return wise;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public int getWitty() {
        return witty;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ravenclaw)) return false;
        if (!super.equals(o)) return false;
        Ravenclaw ravenclaw = (Ravenclaw) o;
        return wise == ravenclaw.wise && witty == ravenclaw.witty && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), wise, witty, creativity);
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
