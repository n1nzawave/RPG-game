public class Player {
    private double hpPlayer;
    private double damagePlayer;
    private String playerClass;
    private String ability;
    private double abilityDamage;

    public Player(double hpPlayer, double damagePlayer, String playerClass, String ability, double abilityDamage){
        this.hpPlayer = hpPlayer;
        this.damagePlayer = damagePlayer;
        this.playerClass = playerClass;
        this.ability = ability;
        this.abilityDamage = abilityDamage;
    }

    public void PlayerAttack(Enemy enemy){
        enemy.getDamage(damagePlayer);
    }

}
