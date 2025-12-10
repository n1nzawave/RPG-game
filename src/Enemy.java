public abstract class Enemy {
    protected double hpEnemy;
    protected double damageEnemy;
    protected String nameEnemy;

    public Enemy(double hpEnemy, double damageEnemy, String nameEnemy){
        this.hpEnemy = hpEnemy;
        this.damageEnemy = damageEnemy;
        this.nameEnemy = nameEnemy;
    }

    public void enemyAttack(Player player){
        player.getDamagePlayer(damageEnemy);
    }

    public void getDamage(double dmg){
        hpEnemy -= dmg;
    }

    public double getHpEnemy(){
        return hpEnemy;
    }

    public double getDamageEnemy(){
        return damageEnemy;
    }

    public void EnemyDefend(double dmg){
        hpEnemy -= dmg*0.50;
    }

}


