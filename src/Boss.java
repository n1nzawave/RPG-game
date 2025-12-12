public class Boss extends Enemy{
    public Boss(double hpEnemy, double damageEnemy, String nameEnemy, String phraseEnemy){
        super(hpEnemy, damageEnemy, nameEnemy, phraseEnemy);
    }

    @Override
    public String getPhraseEnemy(){
        return phraseEnemy;
    }

    @Override
    public void enemyAttack(Player player){
        player.getDamagePlayer(damageEnemy);
    } // метод для атаки игрока

    @Override
    public void getDamage(double dmg){
        hpEnemy -= dmg;
    } // метод для получения урона по врагу

    @Override
    public double getHpEnemy(){
        return hpEnemy;
    } // метод для получения здоровья врага

    @Override
    public double getDamageEnemy(){
        return damageEnemy;
    } // метод для получения урона врага

    @Override
    public void EnemyDefend(Player player){ // метод для защиты врага
        double dmg = player.getPlayersDamage() * 0.50;
        hpEnemy -= dmg;
    }
}
