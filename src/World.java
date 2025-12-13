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

    public boolean startWorld(Player player){
        printSlow("You have moved to the world: " + getWorldName() + "\n" + getWorldDescription());
        for (int i = 0; i < locations.size(); i++){
            if (player.getHpPlayer() <= 0){
                printSlow("You have perished... the game is over.");
                return false;
            }
            locations.get(i).startLocation(player);
        }
        return true;

        }
    }

