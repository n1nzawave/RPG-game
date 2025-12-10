import java.util.Scanner;
import java.util.Random;

public class Battle {
    private Player player;
    private Enemy enemy;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    public Battle(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
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

    public void startBattle(){
        while (player.getHpPlayer() > 0 && enemy.getHpEnemy() > 0){
            printSlow("Введите 1 если хотите атаковать, введите 2 если хотите заблокировать атаку или введите 3 чтобы применить способность: ");
            int choice = scanner.nextInt();
            int enemyChoice = random.nextInt(2);
            if (choice == 1){
                if (enemyChoice != 1){
                    player.PlayerAttack(enemy);
                    printSlow("Вы атаковали и противник потерял " + player.getPlayersDamage() + " единиц здоровья!");
                }
                if (enemyChoice == 1){
                    enemy.getDamage(player.getPlayersDamage()*0.5);
                    printSlow("Вы нанесли противнику удар, но он использовал щит и заблокировал его!");
                }
                if (enemy.getHpEnemy() > 0){
                    printSlow("У противника осталость " + enemy.getHpEnemy() + " единиц здоровья");
                }
                if (enemy.getHpEnemy() <= 0){
                    printSlow("Противник повержен");
                }
            } else if (choice == 2 && enemyChoice == 0 ) {
                player.PlayerDefend(enemy);
                printSlow("Вы заблокировали удар!");
                printSlow("С помощью щита вы поглотили 50% урона!");
            } else if (choice == 3) {
                player.useAbility(enemy);
                printSlow("Вы использовали свою способность!");
                printSlow("Враг потерял " + player.getAbilityDamage() + " единиц здоровья");
                player.setAntallUseAbility(player.getAntallUseAbility()-1);
                printSlow("Вы использовали способность! Осталось: " + player.getAntallUseAbility());
                if (player.getAntallUseAbility() <= 0){
                    printSlow("Вы больше не можете использовать способность!");
                }
                if (enemy.getHpEnemy() > 0){
                    printSlow("У противника осталость " + enemy.getHpEnemy() + " единиц здоровья");
                }
                if (enemy.getHpEnemy() <= 0){
                    printSlow("Противник повержен");
                }
            }
            if (enemy.getHpEnemy() > 0){
                if (enemyChoice == 0){
                    enemy.enemyAttack(player);
                    printSlow("Враг атаковал и нанес вам урон");
                    printSlow("У вас осталось " + player.getHpPlayer() + " единиц здоровья");
                }
            }
            if (enemy.getHpEnemy() <= 0){
                printSlow("Вы победили! Здоровье восстановлено на 75 единиц!");
                player.setHpPlayer(player.getHpPlayer() + 75);
                printSlow("Ваше здоровье: " + player.getHpPlayer());
            }
            if (player.getHpPlayer() <= 0 || enemy.getHpEnemy() <= 0){
                break;
            }
        }
    }
}
