import javax.swing.*;

public class Player {
    private double hpPlayer;
    private double damagePlayer;
    private String playerClass;
    private String ability;
    private double abilityDamage;
    private int antallUseAbility;

    public Player(double hpPlayer, double damagePlayer, String playerClass, String ability, double abilityDamage, int antallUseAbility){
        this.hpPlayer = hpPlayer;
        this.damagePlayer = damagePlayer;
        this.playerClass = playerClass;
        this.ability = ability;
        this.abilityDamage = abilityDamage;
        this.antallUseAbility = antallUseAbility;
    }

    public int getAntallUseAbility(){
        return antallUseAbility;
    }


    public void setAntallUseAbility(int antall){
        this.antallUseAbility = antall;
    }
    public double getHpPlayer(){
        return hpPlayer;
    }

    public void setHpPlayer(double hp){
        this.hpPlayer = hp;
    }

    public void setDamagePlayer(double dmg){ this.damagePlayer = dmg; }

    public double getPlayersDamage(){
        return damagePlayer;
    }

    public double getAbilityDamage(){
        return abilityDamage;
    }

    public void getDamagePlayer(double dmg){
        hpPlayer -= dmg;
    }

    public void PlayerAttack(Enemy enemy){
        enemy.getDamage(damagePlayer);
    }

    public void PlayerDefend(Enemy enemy){
        double dmg = enemy.getDamageEnemy() * 0.50;
        hpPlayer -= dmg;
    }

    public void useAbility(Enemy enemy){
        enemy.getDamage(abilityDamage);
    }

}
