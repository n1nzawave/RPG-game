import java.util.ArrayList;
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

    public void startHistory(ArrayList<World> worlds, Player player){
        printSlow("Stuck in Darkness\n" +
                "\n" +
                "Once upon a time, there was no darkness in the world of\n" +
                "humans. There was only eternal light—soft, endless, and\n" +
                "all-pervading. People lived in abundance and grace and\n" +
                "knew no death. There were no wars, no hunger, and not the\n" +
                "slightest hint of suffering. This continued for many\n" +
                "centuries... But, unfortunately—or perhaps fortunately—\n" +
                "it could not last forever.\n" +
                "\n" +
                "Over time, people began to realize that despite their\n" +
                "perfect world, they did not feel alive. Their days became\n" +
                "monotonous, their souls empty. People sought pleasure in\n" +
                "bad habits, trying to fill the inner void with anything.\n" +
                "\n" +
                "Then a small group of people appeared who believed in\n" +
                "darkness. No one knew what this force was, and no one had\n" +
                "ever seen it. But the believers claimed that darkness was\n" +
                "the missing part of the human soul. Without it, one could\n" +
                "not understand the true nature of light... nor find true\n" +
                "happiness.\n" +
                "\n" +
                "It so happened that this group kidnapped a little orphan.\n" +
                "They performed an ancient ritual, seeking to create one\n" +
                "who would bring darkness into the world—and divide it\n" +
                "into Light and Darkness.\n" +
                "\n" +
                "And the ritual succeeded. The child became a vessel of\n" +
                "darkness... and the world was turned upside down.\n" +
                "\n" +
                "Darkness fell upon the earth, engulfing nearly\n" +
                "everything. Cities vanished, nature twisted, and most\n" +
                "people dissolved into the endless night. Only a few kept\n" +
                "a spark of light within themselves—and survived.\n" +
                "\n" +
                "You are one of them.\n" +
                "And now you must uncover the true nature of darkness...\n" +
                "and face its master.\n");
        printSlow("Enter 1 to continue: ");
        int startStory = scanner.nextInt();
        if (startStory == 1){
            for (int i = 0; i < worlds.size(); i++){
                if (player.getHpPlayer() <= 0){
                    worlds.get(0).startWorld(player);
                }
                worlds.get(i).startWorld(player);
            }
        } else {
            System.exit(0);
        }
    }

    public void startGame(Player player, Menu menu, ArrayList<World> worlds){
        printSlow("Stuck in Darkness\n");
        printSlow("Enter 1 to start the game or enter 2 to quit.");
        int startGame = scanner.nextInt();
        if (startGame == 1){
            menu.startHistory(worlds, player);
        } else if (startGame == 2) {
            System.exit(0);
        }
    }
}
