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

    public void startGame(){
        while (player.getHpPlayer() > 0 && enemy.getHpEnemy() > 0){
            System.out.println("Введите 1 если хотите атаковать, введите 2 если хотите заблокировать атаку или введите 3 чтобы применить способность: ");
            int choice = scanner.nextInt();
            int enemyChoice = random.nextInt(2);
            if (choice == 1){
                player.PlayerAttack(enemy);
                System.out.println("Вы нанесли противнику удар!");
                System.out.println("Противник потерял " + player.getPlayersDamage() + " единиц здоровья");
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
                if (enemy.getHpEnemy() > 0){
                    System.out.println("У противника осталость " + enemy.getHpEnemy() + " единиц здоровья");
                }
                if (enemy.getHpEnemy() <= 0){
                    System.out.println("Противник повержен");
                }
            }
            if (enemy.getHpEnemy() > 0){

                if (enemyChoice == 0){
                    System.out.println("Враг атаковал и нанес " + enemy.getDamageEnemy() + " единиц урона");
                    System.out.println("У вас осталось " + player.getHpPlayer() + " единиц здоровья");
                } else if (enemyChoice == 1) {
                    enemy.EnemyDefend(player.getPlayersDamage());
                    System.out.println("Противник защищается");
                }
            }
            if (player.getHpPlayer() <= 0 || enemy.getHpEnemy() <= 0){
                break;
            }
        }
    }
}
