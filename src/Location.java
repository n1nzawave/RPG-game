import java.util.ArrayList;
import java.util.Scanner;

public class Location {
    private String locationName;
    private Enemy enemies;
    private Enemy enemies2;
    private Enemy miniboss;
    private Enemy boss;
    private NPC npc;

    public Location(String locationName, Enemy enemies, Enemy enemies2, Enemy miniboss, Enemy boss, NPC npc){
        this.locationName = locationName;
        this.enemies = enemies;
        this.miniboss = miniboss;
        this.boss = boss;
        this.npc = npc;
        this.enemies2 = enemies2;
    }
    Scanner scanner = new Scanner(System.in);

    public static void printSlow(String text) {
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public String getLocationName(){
        return locationName;
    }
    public Enemy getEnemies(){return enemies;}

    public void startLocation(Player player){
        printSlow("You have entered the location " + locationName);
        if (player.getHpPlayer() > 0 && npc != null){
            npc.NPCspeak(npc.getName(), npc.getPhrase());
        }
        if (player.getHpPlayer() > 0 && enemies != null){
            printSlow("To proceed, you will have to fight " + enemies.getNameEnemy());
            printSlow(enemies.getNameEnemy() + ": " + enemies.getPhraseEnemy());
            new Battle(player, enemies).startBattle();
            if (enemies.getHpEnemy() <= 0 && enemies2 != null){
                printSlow("That's not all...");
                printSlow(enemies2.getNameEnemy() + ": " + enemies2.getPhraseEnemy());
                new Battle(player, enemies2).startBattle();
            }
        }
        if (player.getHpPlayer() > 0 && miniboss != null){
            printSlow("It's time to fight " + miniboss.getNameEnemy());
            printSlow(miniboss.getNameEnemy() + ": " + miniboss.getPhraseEnemy());
            new Battle(player, miniboss).startBattle();
        }
        if (player.getHpPlayer() > 0 && boss != null){
            printSlow(boss.getNameEnemy() + ": " + boss.getPhraseEnemy());
            new Battle(player, boss).startBattle();
        }
    }


}
