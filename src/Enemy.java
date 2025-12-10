public abstract class Enemy {
    protected double hpEnemy;
    protected double damageEnemy;
    protected String nameEnemy;

    public Enemy(double hpEnemy, double damageEnemy, String nameEnemy){
        this.hpEnemy = hpEnemy;
        this.damageEnemy = damageEnemy;
        this.nameEnemy = nameEnemy;
    }

    public void enemyAttack(){
    }

    public void getDamage(double dmg){
        hpEnemy -= dmg;
    }

    public double getHpEnemy(){
        return hpEnemy;
    }

}


