public class Miniboss extends Enemy {
    public Miniboss(double hpEnemy, double damageEnemy, String nameEnemy){
        super(hpEnemy, damageEnemy, nameEnemy);
    }

    @Override
    public void enemyAttack(Player player){
        player.getDamagePlayer(damageEnemy);
    }

    @Override
    public void getDamage(double dmg){
        hpEnemy -= dmg;
    }

    @Override
    public double getHpEnemy(){
        return hpEnemy;
    }

    @Override
    public double getDamageEnemy(){
        return damageEnemy;
    }

    public void EnemyDefend(double dmg){
        hpEnemy -= dmg*0.50;
    }
}
