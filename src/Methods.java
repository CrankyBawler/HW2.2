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
                    " мудрость: " + ravenclaw.getWise() + " остоумие: " + ravenclaw.getWitty() + " полнота творчества: " +
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

    public void simileSlytherin(Slytherin[] slytherins, int i, int j) {
        int sumi = slytherins[i].getCunning() + slytherins[i].getDetermination() + slytherins[i].getAmbition()+
                slytherins[i].getResourcefulness() + slytherins[i].getLust_for_power();
        int sumj = slytherins[j].getCunning() + slytherins[j].getDetermination() + slytherins[j].getAmbition()+
                slytherins[j].getResourcefulness() + slytherins[j].getLust_for_power();
        if (sumi > sumj) {
            System.out.println(slytherins[i].getName() + " лучший слизиринец чем " + slytherins[j].getName());
        } else {
            System.out.println(slytherins[j].getName() + " лучший слизиринец чем " + slytherins[i].getName());
        }
    }

    public void simileHufflepuff(Hufflepuff[] hufflepuffs, int i, int j) {
        int sumi = hufflepuffs[i].getHardworking() + hufflepuffs[i].getLoyal() + hufflepuffs[i].getHonest();
        int sumj = hufflepuffs[j].getHardworking() + hufflepuffs[j].getLoyal() + hufflepuffs[j].getHonest();
        if (sumi > sumj) {
            System.out.println(hufflepuffs[i].getName() + " лучший пуффендуец чем " + hufflepuffs[j].getName());
        }else {
            System.out.println(hufflepuffs[j].getName() + " лучший пуффендуец чем " + hufflepuffs[i].getName());
        }
    }

    public void simileRavenclaw(Ravenclaw[] ravenclaws, int i, int j) {
        int sumi = ravenclaws[i].getMind() + ravenclaws[i].getWise() + ravenclaws[i].getWitty() + ravenclaws[i].getCreativity();
        int sumj = ravenclaws[j].getMind() + ravenclaws[j].getWise() + ravenclaws[j].getWitty() + ravenclaws[j].getCreativity();
        if (sumi > sumj) {
            System.out.println(ravenclaws[i].getName() + " лучший когтевранец чем " + ravenclaws[j].getName());
        } else {
            System.out.println(ravenclaws[j].getName() + " лучший когтевранец чем " + ravenclaws[i].getName());
        }

    }

    public void simileHogwarts(Hogwarts[] hogwarts, int i, int j) {
        if (hogwarts[i].getMagic() > hogwarts[j].getMagic() && hogwarts[i].getTransgression() > hogwarts[j].getTransgression()) {
            System.out.println(hogwarts[i].getName() + " обладает бОльшей мощностью магии и бОльшим расстоянием трансгрессии" +
                    " чем " + hogwarts[j].getName());
        }else {
            if (hogwarts[i].getMagic() > hogwarts[j].getMagic() && hogwarts[i].getTransgression() < hogwarts[j].getTransgression()) {
                System.out.println(hogwarts[i].getName() + " обладает бОльшей мощностью магии, но меньшим расстоянием трансгрессии" +
                        " чем " + hogwarts[j].getName());
            }
            else {
                if (hogwarts[i].getMagic() < hogwarts[j].getMagic() && hogwarts[i].getTransgression() < hogwarts[j].getTransgression()) {
                    System.out.println(hogwarts[j].getName() + " обладает бОльшей мощностью магии и бОльшим расстоянием трансгрессии" +
                            " чем " + hogwarts[i].getName());
                }else {
                    if (hogwarts[i].getMagic() < hogwarts[j].getMagic() && hogwarts[i].getTransgression() > hogwarts[j].getTransgression()) {
                        System.out.println(hogwarts[j].getName() + " обладает бОльшей мощностью магии, но меньшеим расстоянием трансгрессии" +
                                " чем " + hogwarts[i].getName());
                    }
                }
            }
        }
    }
}


