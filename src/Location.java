import java.util.ArrayList;

public class Location {
    private String locationName;
    private Enemy enemies;
    private Enemy miniboss;
    private Enemy boss;

    public Location(String locationName, Enemy enemies, Enemy miniboss, Enemy boss){
        this.locationName = locationName;
        this.enemies = enemies;
        this.miniboss = miniboss;
        this.boss = boss;
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

    public String getLocationName(){
        return locationName;
    }

    public void startLocation(Player player){
        printSlow("Вы вошли в локацию " + locationName);
        printSlow("Чтобы пройти дальше вам прийдется сразиться с " + enemies.getNameEnemy());
        if (player.getHpPlayer() > 0 && enemies != null){
            new Battle(player, enemies).startBattle();
        }
        if (player.getHpPlayer() > 0 && miniboss != null){
            printSlow("Вы вошли в локацию " + locationName);
            printSlow("Пришло время сразиться с " + miniboss.getNameEnemy());
            printSlow(miniboss.getNameEnemy() + ": Перед тем как сразиться с боссом"  + " тебе придется победить меня!");
            new Battle(player, miniboss).startBattle();
        }
        if (player.getHpPlayer() > 0 && boss != null){
            printSlow("Вы вошли в " + locationName);
            printSlow(boss.getNameEnemy() + ": ты думаешь что можешь одолеть меня? Ну попробуй хахаахха");
            new Battle(player, boss).startBattle();
        } else {
            printSlow("Босс будет немного позже...");
        }
    }


}
