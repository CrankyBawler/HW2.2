import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor("Гарри Поттер", 41, 33, 32, 53, 4);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер", 53, 69, 18, 52, 44);
        Gryffindor ronWeasley = new Gryffindor("Рон Уизли", 33, 91, 20, 71, 65);

        System.out.println("Hello world!");

    }

    public int random() {
        int min = 0;
        int max = 100;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1);
        i += min;
        return i;
    }
}
