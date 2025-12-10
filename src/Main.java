public class Main {
    public static void main(String[] args) {
        Player p1 = new Player(100.0,15.0,"Воин","Ураган ударов",25);
        Mob goblin = new Mob(50.0, 15, "Гоблин");
        Mob knight = new Mob(75.0, 25.0,"Dark Knight");
        Mob magician = new Mob(40.0, 30.0, "Magician of ancient spells");
        Miniboss dragon = new Miniboss(150.0,40.0,"Ancient wyvern");
        Boss boss1 = new Boss(200.0, 60.0,"Father of Dragons");
        System.out.println(p1.getHpPlayer());
        p1.PlayerDefend(goblin.getDamageEnemy());
        System.out.println(p1.getHpPlayer());
    }
}