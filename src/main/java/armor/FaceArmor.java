package armor;

import config.ConfigLoader;

public class FaceArmor extends Armor {
    private FaceArmor(double durability, double k) {
        super(durability, k);
    }

    public static FaceArmor create() {
        return new FaceArmor(ConfigLoader.getArmorDurability("face"), ConfigLoader.getArmorK("face"));
    }
}
