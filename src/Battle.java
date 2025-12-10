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

    public void startBattle(){
        while (player.getHpPlayer() > 0 && enemy.getHpEnemy() > 0){
            System.out.println("Введите 1 если хотите атаковать, введите 2 если хотите заблокировать атаку или введите 3 чтобы применить способность: ");
            int choice = scanner.nextInt();
            int enemyChoice = random.nextInt(2);
            if (choice == 1){
                if (enemyChoice != 1){
                    player.PlayerAttack(enemy);
                    System.out.println("Вы атаковали и противник потерял " + player.getPlayersDamage() + " единиц здоровья!");
                }
                if (enemyChoice == 1){
                    enemy.getDamage(player.getPlayersDamage()*0.5);
                    System.out.println("Вы нанесли противнику удар, но он использовал щит и заблокировал его!");
                }
                if (enemy.getHpEnemy() > 0){
                    System.out.println("У противника осталость " + enemy.getHpEnemy() + " единиц здоровья");
                }
                if (enemy.getHpEnemy() <= 0){
                    System.out.println("Противник повержен");
                }
            } else if (choice == 2 && enemyChoice == 0 ) {
                player.PlayerDefend(enemy);
                System.out.println("Вы заблокировали удар!");
                System.out.println("С помощью щита вы поглотили 50% урона!");
            } else if (choice == 3) {
                player.useAbility(enemy);
                System.out.println("Вы использовали свою способность!");
                System.out.println("Враг потерял " + player.getAbilityDamage() + " единиц здоровья");
                player.setAntallUseAbility(player.getAntallUseAbility()-1);
                System.out.println("Вы использовали способность! Осталось: " + player.getAntallUseAbility());
                if (player.getAntallUseAbility() <= 0){
                    System.out.println("Вы больше не можете использовать способность!");
                }
                if (enemy.getHpEnemy() > 0){
                    System.out.println("У противника осталость " + enemy.getHpEnemy() + " единиц здоровья");
                }
                if (enemy.getHpEnemy() <= 0){
                    System.out.println("Противник повержен");
                }
            }
            if (enemy.getHpEnemy() > 0){
                if (enemyChoice == 0){
                    enemy.enemyAttack(player);
                    System.out.println("Враг атаковал и нанес вам урон");
                    System.out.println("У вас осталось " + player.getHpPlayer() + " единиц здоровья");
                }
            }
            if (enemy.getHpEnemy() <= 0){
                System.out.println("Вы победили! Здоровье восстановлено на 75 единиц!");
                player.setHpPlayer(player.getHpPlayer() + 75);
                System.out.println("Ваше здоровье: " + player.getHpPlayer());
            }
            if (player.getHpPlayer() <= 0 || enemy.getHpEnemy() <= 0){
                break;
            }
        }
    }
}
