public class Methods {

    public void print(Gryffindor[] gryffindors) {
        for (Gryffindor gryffindor : gryffindors) {
            System.out.println("Имя: " + gryffindor.getName() + " мощность колдовства: " + gryffindor.magic +
                    " расстояние трансгрессии: " + gryffindor.transgression + " благородство: "
                    + gryffindor.nobility + " честь " + gryffindor.honor + " храбрость " + gryffindor.bravery);
        }
    };

    public void print(Slytherin[] slytherins) {
        for (Slytherin slytherin : slytherins) {
            System.out.println("Имя: " + slytherin.getName() + " мощность колдовства: " + slytherin.getMagic()
                    + " расстояние трансгрессии: " + slytherin.getTransgression() + " хитрость: "
                    + slytherin.getCunning() + " решительность: " + slytherin.getDetermination() + " амбициозность: " +
                    slytherin.getAmbition() + " находчивость: " + slytherin.getResourcefulness() + " жажда власти: " +
                    slytherin.getLust_for_power());

        }
    }

    public void print(Hufflepuff[] hufflepuffs) {
        for (Hufflepuff hufflepuff : hufflepuffs) {
            System.out.println("Имя: " + hufflepuff.getName() + " мощность колдовства: " + hufflepuff.getMagic()
                    + " расстояние трангрессии: " + hufflepuff.getTransgression() + "трудолюбие: " + hufflepuff.getHardworking()
                    + " верность: " + hufflepuff.getLoyal() + " честность: " + hufflepuff.getHonest() );
        }
    }

    public void print(Ravenclaw[] ravenclaws) {
        for (Ravenclaw ravenclaw : ravenclaws) {
            System.out.println("Имя: " + ravenclaw.getName()+ " мощность колдовства: " + ravenclaw.getMagic()
                    + "расстояние трангрессии: " + ravenclaw.getTransgression() + " ум: " + ravenclaw.getMind() +
                    " мудрость: " + ravenclaw.getWise() + " остоумие: " + ravenclaw.getWise() + " полнота творчества: " +
                    ravenclaw.getCreativity());
        }
    }

    public void simileGryffindors(Gryffindor [] gryffindors, int i , int j) {
       int  sumi = gryffindors[i].getNobility() + gryffindors[i].getHonor() + gryffindors [i].getBravery();
       int sumj = gryffindors[j].getNobility() + gryffindors[j].getHonor() + gryffindors[j].getBravery();
        if (sumi > sumj) {
            System.out.println(gryffindors[i].getName() + " лучший гриффиндорец чем " + gryffindors[j].getName());
        }else {
            System.out.println(gryffindors[j].getName() + " лучший гриффиндорец чем " + gryffindors[i].getName());
        }
        }
}


