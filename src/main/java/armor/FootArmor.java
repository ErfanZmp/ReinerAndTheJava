package armor;

import config.ConfigLoader;

public class FootArmor extends Armor {
    private FootArmor(double durability, double k) {
        super(durability, k);
    }

    public static FootArmor create() {
        return new FootArmor(ConfigLoader.getArmorDurability("foot"), ConfigLoader.getArmorK("foot"));
    }
}
