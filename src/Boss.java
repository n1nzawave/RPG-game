public class Boss extends Enemy{
    public Boss(double hpEnemy, double damageEnemy, String nameEnemy){
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

    @Override
    public void EnemyDefend(Player player){
        double dmg = player.getPlayersDamage() * 0.50;
        hpEnemy -= dmg;
    }
}
