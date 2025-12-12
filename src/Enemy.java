public abstract class Enemy {
    protected double hpEnemy;
    protected double damageEnemy;
    protected String nameEnemy;
    protected String phraseEnemy;

    public Enemy(double hpEnemy, double damageEnemy, String nameEnemy, String phraseEnemy){
        this.hpEnemy = hpEnemy;
        this.damageEnemy = damageEnemy;
        this.nameEnemy = nameEnemy;
        this.phraseEnemy = phraseEnemy;
    }

    public String getPhraseEnemy(){
        return phraseEnemy;
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

    public String getNameEnemy(){
        return nameEnemy;
    }

    public void EnemyDefend(Player player){
        double dmg = player.getPlayersDamage() * 0.50;
        hpEnemy -= dmg;
    }

}


