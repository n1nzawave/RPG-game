import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public void startGame(World world, Player player){
        System.out.println("Введите 1 чтобы начать игру или введите 2 чтобы выйти");
        int startGame = scanner.nextInt();
        if (startGame == 1){
            world.startWorld(player);
        } else if (startGame == 2) {
            System.exit(0);
        }

    }
}
