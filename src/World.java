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

    public void startWorld(Player player){
        for (int i = 0; i < locations.size(); i++){
            if (player.getHpPlayer() <= 0){
                System.out.println("Вы погибли... игра окончена");
            }
            locations.get(i).startLocation(player);
        }
    }
}
