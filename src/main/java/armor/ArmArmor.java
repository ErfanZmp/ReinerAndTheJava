package armor;

import config.ConfigLoader;

public class ArmArmor extends Armor {

    private ArmArmor(double durability, double k) {
        super(durability, k);
    }

    public static ArmArmor create() {
        return new ArmArmor(ConfigLoader.getArmorDurability("arm"), ConfigLoader.getArmorK("arm"));
    }
}
