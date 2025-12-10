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

    public String getLocationName(){
        return locationName;
    }

    public void startLocation(Player player){
        System.out.println("Вы вошли в локацию " + locationName);
        System.out.println("Чтобы пройти дальше вам прийдется сразиться с " + enemies.getNameEnemy());
        if (player.getHpPlayer() > 0 && enemies != null){
            new Battle(player, enemies).startBattle();
        }
        if (player.getHpPlayer() > 0 && miniboss != null){
            System.out.println("Вы вошли в локацию " + locationName);
            System.out.println("Пришло время сразиться с " + miniboss.getNameEnemy());
            System.out.println(miniboss.getNameEnemy() + ": Перед тем как сразиться с боссом"  + " тебе придется победить меня!");
            new Battle(player, miniboss).startBattle();
        }
        if (player.getHpPlayer() > 0 && boss != null){
            System.out.println("Вы вошли в " + locationName);
            System.out.println(boss.getNameEnemy() + ": ты думаешь что можешь одолеть меня? Ну попробуй хахаахха");
            new Battle(player, boss).startBattle();
        } else {
            System.out.println("Босс будет немного позже...");
        }
    }


}
