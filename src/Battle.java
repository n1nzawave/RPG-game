import java.util.Scanner;
import java.util.Random;

public class Battle {
    private Player player;
    private Enemy enemy;
    private Miniboss miniboss;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public Battle(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public static void printSlow(String text) { // метод для медленного вывода текста
        for (int i = 0; i < text.length(); i++) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public void startBattle(){
        while (player.getHpPlayer() > 0 && enemy.getHpEnemy() > 0){
            printSlow("Enter 1 if you want to attack, enter 2 if you want to block an attack, or enter 3 to use an ability: ");
            int choice = scanner.nextInt();
            int enemyChoice = random.nextInt(2);
            if (choice == 1){ //что происходит при выборе атаки
                if (enemyChoice != 1){ // если враг не выбрал блокировать, то проходит полный урон
                    player.PlayerAttack(enemy);
                }
                if (enemyChoice == 1){ // если враг выбрал блокировать то проходит 50% урона
                    enemy.getDamage(player.getPlayersDamage()*0.5);
                    printSlow("You struck your opponent, but they used their shield to block it!");
                }
                if (enemyChoice == 0){
                    player.getDamagePlayer(enemy.getDamageEnemy());
                    printSlow("You attacked the enemy, and he attacked you.");
                    printSlow("You have left:" + player.getHpPlayer() + " HP");
                }
                if (enemy.getHpEnemy() > 0){
                    printSlow("The enemy has " + enemy.getHpEnemy() + " health points");
                }
                if (enemy.getHpEnemy() <= 0){
                    printSlow("The enemy is defeated");
                }
            } else if (choice == 2) {// если игрок выбрал блокировку и враг выбрал атаку, то игрок получает только 50 процентов урона
                if (enemyChoice == 0){
                    player.PlayerDefend(enemy);
                    printSlow("You blocked the shot!");
                    printSlow("You absorbed 50% of the damage with your shield!");
                    printSlow("Your HP: " + player.getHpPlayer());
                }
                if (enemyChoice == 1){
                    printSlow("The enemy, like you, decided to block the attack. No one was hurt.");
                }
            } else if (choice == 3) {
                if (enemyChoice != 1){
                    if (player.getAntallUseAbility() <= 0){
                        printSlow("You can no longer use the ability!");
                        continue;
                    }
                    player.useAbility(enemy);
                    printSlow("You used your ability!");
                    player.setAntallUseAbility(player.getAntallUseAbility()-1);
                    printSlow("You have used your ability! Remaining: " + player.getAntallUseAbility());
                }
                if (enemyChoice == 1){
                    if (player.getAntallUseAbility() <= 0){
                        printSlow("You can no longer use the ability!");
                        continue;
                    }
                    enemy.getDamage(player.getAbilityDamage()*0.75);
                    printSlow("You used your ability, but the enemy blocked it and absorbed some of the damage!");
                }
                if (enemy.getHpEnemy() > 0){
                    printSlow("The enemy has " + enemy.getHpEnemy() + " health points");
                }
                if (enemy.getHpEnemy() <= 0){
                    printSlow("The enemy is defeated");
                }
            }
            if (enemy.getHpEnemy() <= 0){ // если у противника здоровья меньше или равно 0, то игрок побеждает и восстанавливает 75 здоровья
                printSlow("You have won! Your health has been restored by 35 points!");
                player.setHpPlayer(player.getHpPlayer() + 35);
                printSlow("You have won! Your attack power has been increased by 1!");
                player.setDamagePlayer(player.getPlayersDamage() + 1.0);
                printSlow("You have won and receive +1 ability point!");
                printSlow("Now you have: " + (player.getAntallUseAbility()+1) + " ability points");
                printSlow("Your HP: " + player.getHpPlayer());
            }
            if (player.getHpPlayer() <= 0 || enemy.getHpEnemy() <= 0){
                break;
            }
        }
    }
}
