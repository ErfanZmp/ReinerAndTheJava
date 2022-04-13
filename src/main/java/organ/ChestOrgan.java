package organ;

import armor.ChestArmor;
import config.ConfigLoader;

public class ChestOrgan extends Organ {
    private ChestOrgan(double hp) {
        super(hp, ChestArmor.create());
    }

    public static ChestOrgan create() {
        return new ChestOrgan(ConfigLoader.getHp("chest"));
    }
}
