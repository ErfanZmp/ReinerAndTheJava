package armor;

import config.ConfigLoader;

public class NeckArmor extends Armor {
    private NeckArmor(double durability, double k) {
        super(durability, k);
    }

    public static NeckArmor create() {
        return new NeckArmor(ConfigLoader.getArmorDurability("neck"), ConfigLoader.getArmorK("neck"));
    }
}
