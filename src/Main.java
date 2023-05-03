public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");

        int tiket = 13_676;
        System.out.println("Стоимость билета: " + tiket + "руб.");
        int onemiles = 20;

        int bonusmiles = tiket / onemiles;

        System.out.println("Ваш бонус составляет: " + bonusmiles);
    }
}
