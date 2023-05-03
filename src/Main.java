public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");

        int tiket = 30_000;
        System.out.println("Стоимость билета: " + tiket + "руб.");
        int onemiles = 20;
пшп
        int bonusmiles = tiket / onemiles;

        System.out.println("Ваш бонус составляет: " + bonusmiles);
    }
}
