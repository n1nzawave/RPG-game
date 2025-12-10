import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player(100.0,15.0,"Воин","Ураган ударов",25, 10);
        Mob miniDragon = new Mob(50.0, 15.0, "Baby Dragon");
        Mob knight = new Mob(75.0, 25.0,"Dark Knight");
        Mob magician = new Mob(40.0, 30.0, "Magician of ancient spells");
        Miniboss dragon = new Miniboss(125.0,40.0,"Ancient wyvern");
        Miniboss GiantWorm = new Miniboss(150.0,45.0, "Giant Worm");
        Miniboss EnchantedGuardian = new Miniboss(170.0, 55.0, "Enchanted Guardian");
        Boss boss1 = new Boss(200.0, 60.0,"Father of Dragons");
        Location startLocation = new Location("The foot of the dragon castle", miniDragon, dragon,null);
        Location location2World1 = new Location("The cave under the dragon's castle", magician, GiantWorm, null);
        Location finalLocWorld1 = new Location("Dragon Castle", knight, EnchantedGuardian, boss1);
        ArrayList<Location> world1Locations = new ArrayList<>();
        world1Locations.add(startLocation);
        world1Locations.add(location2World1);
        world1Locations.add(finalLocWorld1);
        World world1 = new World("Мир драконов", world1Locations);
        Menu game1 = new Menu();
        game1.startGame(world1, p1);
    }
}