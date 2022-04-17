package armor;

import interfaces.Damageable;

public abstract class Armor implements Damageable {
    protected double durability;
    protected double k;

    public Armor(double durability, double k) {
        this.durability = durability;
        this.k = k;
    }

    public double getDurability() {
        return durability;
    }

    public double getK() {
        return k;
    }

    @Override
    public boolean takeDamage(double force) {
        durability -= force/k;
        if (durability < 0) durability = 0;
        durability = Math.round(durability*100.0) / 100.0;
        return durability == 0;
    }
}
