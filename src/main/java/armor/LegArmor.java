package armor;

import config.ConfigLoader;

public class LegArmor extends Armor {
    private LegArmor(double durability, double k) {
        super(durability, k);
    }

    public static LegArmor create() {
        return new LegArmor(ConfigLoader.getArmorDurability("leg"), ConfigLoader.getArmorK("leg"));
    }
}
