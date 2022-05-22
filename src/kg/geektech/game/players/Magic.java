package kg.geektech.game.players;

public class Magic extends Hero {
    public Magic(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].setDamage(heroes[i].getDamage()+1);
            System.out.println("Ìàã óâåëè÷èë óðîí ãåðîÿ " + heroes[i].getName() + " íà 1 åäèíèöó");
        }
    }
}
 
