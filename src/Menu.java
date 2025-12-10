import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public static void printSlow(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(75);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }
    public void startGame(World world, Player player){
        printSlow("Введите 1 чтобы начать игру или введите 2 чтобы выйти");
        int startGame = scanner.nextInt();
        if (startGame == 1){
            world.startWorld(player);
        } else if (startGame == 2) {
            System.exit(0);
        }

    }
}
