import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    public static void printSlow(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void startHistory(ArrayList<World> worlds, Player player) {
        printSlow("Stuck in Darkness\n\n" +
                "Once upon a time, there was no darkness in the world of humans. " +
                "There was only eternal light—soft, endless, and all-pervading. " +
                "People lived in abundance and grace and knew no death...\n\n" +
                "You are one of the few who survived.\n" +
                "And now you must uncover the true nature of darkness...\n" +
                "and face its master.\n");

        printSlow("In the game, you will have 3 choices of action: attack, block, and use ability. " +
                "Attacks are unlimited, but ability use is limited, so use your ability wisely!\nEnter 1 to continue: ");
        int startStory = scanner.nextInt();
        if (startStory != 1) {
            System.exit(0);
        }

        // Проходим по мирам
        for (int i = 0; i < worlds.size(); i++) {
            if (player.getHpPlayer() <= 0) {
                printSlow("You have died... Game over.");
                System.exit(0);
            }
            worlds.get(i).startWorld(player);
        }

        // Финальный выбор после всех миров
        printSlow("\nYou have defeated the lord of darkness, and now you face a choice: " +
                "preserve darkness and become the new lord of darkness, but lose yourself, " +
                "or destroy darkness and sacrifice light in the process...");
        printSlow("Enter 1 to preserve darkness or enter 2 to destroy darkness: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            printSlow("\nYou place your hand on the dying core of darkness.\n" +
                    "Its power floods into you like a freezing tide, devouring your thoughts, " +
                    "your memories, everything that once made you human.\n" +
                    "The whispers grow louder.\n" +
                    "\"You were chosen… You are worthy… Become us… Become more…\"\n" +
                    "Your light flickers, then fades. Your heartbeat slows. Your eyes turn crimson.\n" +
                    "As your body transforms, the shadows rise like loyal servants, kneeling before their new master.\n" +
                    "You ascend the broken throne once owned by the Lord of Darkness.\n" +
                    "From now on…\nYou are the eternal ruler of night.\n" +
                    "Not a hero. Not a savior.\nA god of shadows.");
        } else if (choice == 2) {
            printSlow("\nYou drive your weapon into the heart of darkness.\n" +
                    "A blinding wave of light tears through the citadel — but something is wrong.\n" +
                    "The shadows aren’t just burning. They’re unraveling… dissolving into nothing.\n" +
                    "And then you feel it. The light inside you begins to collapse as well.\n" +
                    "Because light cannot exist without darkness. And darkness cannot exist without light.\n" +
                    "You destroyed one half of reality… and the other half follows.\n" +
                    "The ground fractures. Mountains fade like dust. Forests crumble into white ash. " +
                    "The sky turns empty — not bright, not dark — simply gone.\n" +
                    "You fall to your knees as your body begins to vanish, pixel by pixel, like a dream waking up from itself.\n" +
                    "There are no screams. No salvation. No victory. Only silence.\n" +
                    "You realize the truth a moment before you disappear:\n" +
                    "The world existed because darkness existed. By ending darkness, you ended everything.\n" +
                    "The last thing you feel is warmth — the final echo of light, fading with you.\nThen there is nothing.");
        } else {
            printSlow("Invalid choice. Exiting...");
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
