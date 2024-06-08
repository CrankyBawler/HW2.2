import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Hogwarts[] hogwarts = {
                new Hogwarts("Гарри Поттер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Гермиона Грейнджер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Рон Уизли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Драко Малфой", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Грэхэм Монтегю", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Грегори Гойл", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Захария Смит", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Седрик Диггори", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Джастин Финч-Флетчли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Чжоу Чанг", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Падма Патил", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hogwarts("Маркус Белби", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())
        };
        Gryffindor [] gryffindors = {
                new Gryffindor("Гарри Поттер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Gryffindor("Гермиона Грейнджер", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Gryffindor("Рон Уизли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())
        };
        Slytherin[] slytherins = {
                new Slytherin("Драко Малфой", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Slytherin("Грэхэм Монтегю", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Slytherin("Грегори Гойл", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())
        };
        Hufflepuff [] hufflepuffs = {
                new Hufflepuff("Захария Смит", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hufflepuff("Седрик Диггори", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Hufflepuff("Джастин Финч-Флетчли", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())
        };
        Ravenclaw [] ravenclaws = {
                new Ravenclaw("Чжоу Чанг", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Ravenclaw("Падма Патил", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber()),
                new Ravenclaw("Маркус Белби", Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(),
                        Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber(), Hogwarts.randomDiceNumber())

        };
        for (int i = 0; i < hogwarts.length; i++) {
            System.out.println(hogwarts[i]);

        }
    }
}

