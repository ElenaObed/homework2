public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте");
        int ticket = 30_000;
        System.out.println("Стоимость билета: " + ticket + " руб.");
        int oneMiles = 20;
        int bonusMiles = ticket / oneMiles;
        System.out.println("Ваш бонус составляет: " + bonusMiles);
    }
}