package armor;

import config.ConfigLoader;

public class ChestArmor extends Armor {
    private ChestArmor(double durability, double k) {
        super(durability, k);
    }

    public static ChestArmor create() {
        return new ChestArmor(ConfigLoader.getArmorDurability("chest"), ConfigLoader.getArmorK("chest"));
    }
}
