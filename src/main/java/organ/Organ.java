package organ;

import armor.Armor;
import interfaces.Damageable;

public abstract class Organ implements Damageable {
    protected double hp;
    protected Armor armor;

    public Organ(double hp, Armor armor) {
        this.hp = hp;
        this.armor = armor;
    }

    public double getHp() {
        return hp <= 0 ? 0 : hp;
    }

    public Armor getArmor() {
        return armor;
    }

    @Override
    public boolean takeDamage(double force) {
        if(armor.getDurability() > 0) {
            hp -= (force*calcResist(armor.getDurability()))/100.0;
            armor.takeDamage(force);
        }
        else hp -= force;
        hp = Math.round(hp*100.0) / 100.0;
        return hp <= 0;
    }

    private double calcResist(double x) {
        return 100-(x/2.0);
    }
}
