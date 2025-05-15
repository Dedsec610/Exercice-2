import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nombreAleatoire = 1 + (int)(Math.random() * 100);
        int tentative = 0;
        int maxEssais = 10;
        boolean trouve = false;

        System.out.println("Jeu : Devinez le nombre entre 1 et 100 (10 essais max)");

        while (tentative < maxEssais) {
            System.out.print("Essai " + (tentative + 1) + ": ");
            int proposition = scanner.nextInt();
            tentative++;

            if (proposition == nombreAleatoire) {
                System.out.println("Bravo ! Vous avez trouvé le bon nombre en " + tentative + " essai(s) !");
                trouve = true;
                break;
            } else if (proposition < nombreAleatoire) {
                System.out.println("C'est plus grand !");
            } else {
                System.out.println("C'est plus petit !");
            }
        }

        if (!trouve) {
            System.out.println("Désolé, vous avez utilisé vos 10 essais. Le nombre était : " + nombreAleatoire);
        }

        scanner.close();
    }
}
