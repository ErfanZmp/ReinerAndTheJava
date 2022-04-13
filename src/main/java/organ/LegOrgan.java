package organ;

import armor.LegArmor;
import config.ConfigLoader;

public class LegOrgan extends Organ {
    private LegOrgan(double hp) {
        super(hp, LegArmor.create());
    }

    public static LegOrgan create() {
        return new LegOrgan(ConfigLoader.getHp("leg"));
    }
}
