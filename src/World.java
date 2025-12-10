import java.util.ArrayList;

public class World {
    private String name;
    private ArrayList<Location> locations;

    public World(String name, ArrayList<Location> locations){
        this.locations = locations;
        this.name = name;
    }

    public String getWorldName(){
        return name;
    }

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

    public void startWorld(Player player){
        for (int i = 0; i < locations.size(); i++){
            if (player.getHpPlayer() <= 0){
                printSlow("Вы погибли... игра окончена");
            }
            locations.get(i).startLocation(player);
        }
    }
}
