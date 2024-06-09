import java.util.Objects;

public class Ravenclaw extends Hogwarts {
    public int mind;
    public int wise;
    public int witty;
    public int creativity;

    public Ravenclaw(String name, int magic, int transgression, int mind, int wise, int witty, int creativity) {
        super(name, magic, transgression);
        this.mind = mind;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
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
        return mind == ravenclaw.mind && wise == ravenclaw.wise && witty == ravenclaw.witty && creativity == ravenclaw.creativity;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mind, wise, witty, creativity);
    }

    @Override
    public String toString() {
        return "Ravenclaw{" +
                "mind=" + mind +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                '}';
    }
}
