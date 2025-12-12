public class Miniboss extends Enemy {
    public Miniboss(double hpEnemy, double damageEnemy, String nameEnemy, String phraseEnemy){
        super(hpEnemy, damageEnemy, nameEnemy, phraseEnemy);
    }


    @Override
    public String getPhraseEnemy(){
        return phraseEnemy;
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
