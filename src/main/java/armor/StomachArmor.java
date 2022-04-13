package armor;

import config.ConfigLoader;

public class StomachArmor extends Armor {
    private StomachArmor(double durability, double k) {
        super(durability, k);
    }

    public static StomachArmor create() {
        return new StomachArmor(ConfigLoader.getArmorDurability("stomach"), ConfigLoader.getArmorK("stomach"));
    }
}
