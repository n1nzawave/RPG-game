import java.util.ArrayList;
import java.util.Scanner;

public class World {
    private String name;
    private ArrayList<Location> locations;
    private String worldDescription;

    public World(String name, ArrayList<Location> locations, String worldDescription){
        this.locations = locations;
        this.name = name;
        this.worldDescription = worldDescription;
    }

    Scanner scanner = new Scanner(System.in);

    public String getWorldName(){
        return name;
    }

    public String getWorldDescription(){
        return worldDescription;
    }

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

    public void startWorld(Player player){
        printSlow("You have moved to the world: " + getWorldName() + "\n" + getWorldDescription());
        for (int i = 0; i < locations.size(); i++){
            if (player.getHpPlayer() <= 0){
                printSlow("You have perished... the game is over.");
                break;
            }
            locations.get(i).startLocation(player);
        }
        printSlow("You have defeated the lord of darkness, and now you face a choice: preserve darkness and become the new lord of darkness, but lose yourself, or destroy darkness and sacrifice light in the process...");
        printSlow("Enter 1 to preserve darkness or enter 2 to destroy darkness: ");
        int choice = scanner.nextInt();
        if (choice == 1){
            printSlow("You place your hand on the dying core of darkness.\n" +
                    "\n" +
                    "Its power floods into you like a freezing tide, devouring your thoughts, \n" +
                    "your memories, everything that once made you human.\n" +
                    "\n" +
                    "The whispers grow louder.\n" +
                    "\n" +
                    "\"You were chosen… You are worthy… Become us… Become more…\"\n" +
                    "\n" +
                    "Your light flickers, then fades.  \n" +
                    "Your heartbeat slows.  \n" +
                    "Your eyes turn crimson.\n" +
                    "\n" +
                    "As your body transforms, the shadows rise like loyal servants, kneeling before their new master.\n" +
                    "\n" +
                    "You ascend the broken throne once owned by the Lord of Darkness.\n" +
                    "\n" +
                    "From now on…\n" +
                    "\n" +
                    "You are the eternal ruler of night.\n" +
                    "\n" +
                    "Not a hero.  \n" +
                    "Not a savior.\n" +
                    "\n" +
                    "A god of shadows.");
        }
        if (choice == 2){
            printSlow("You drive your weapon into the heart of darkness.\n" +
                    "\n" +
                    "A blinding wave of light tears through the citadel — but something is wrong.\n" +
                    "\n" +
                    "The shadows aren’t just burning.  \n" +
                    "They’re unraveling… dissolving into nothing.\n" +
                    "\n" +
                    "And then you feel it.\n" +
                    "\n" +
                    "The light inside you begins to collapse as well.\n" +
                    "\n" +
                    "Because light cannot exist without darkness.  \n" +
                    "And darkness cannot exist without light.\n" +
                    "\n" +
                    "You destroyed one half of reality… and the other half follows.\n" +
                    "\n" +
                    "The ground fractures.  \n" +
                    "Mountains fade like dust.  \n" +
                    "Forests crumble into white ash.  \n" +
                    "The sky turns empty — not bright, not dark — simply gone.\n" +
                    "\n" +
                    "You fall to your knees as your body begins to vanish, pixel by pixel,  \n" +
                    "like a dream waking up from itself.\n" +
                    "\n" +
                    "There are no screams.  \n" +
                    "No salvation.  \n" +
                    "No victory.\n" +
                    "\n" +
                    "Only silence.\n" +
                    "\n" +
                    "You realize the truth a moment before you disappear:\n" +
                    "\n" +
                    "The world existed because darkness existed.  \n" +
                    "By ending darkness,  \n" +
                    "you ended **everything**.\n" +
                    "\n" +
                    "The last thing you feel is warmth —  \n" +
                    "the final echo of light, fading with you.\n" +
                    "\n" +
                    "Then there is nothing.");
        }
    }
}
