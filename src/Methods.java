public class Methods {

    public void print(Gryffindor[] gryffindors) {
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя: " + gryffindor.getName() + " мощность колдовства: " + gryffindor.magic +
                    " расстояние трансгрессии: " + gryffindor.transgression + " благородство: "
                    + gryffindor.nobility + " честь " + gryffindor.honor + " храбрость " + gryffindor.bravery);
        }
    };
}
