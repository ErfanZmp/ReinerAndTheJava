package organ;

import armor.NeckArmor;
import config.ConfigLoader;

public class NeckOrgan extends Organ {
    private NeckOrgan(double hp) {
        super(hp, NeckArmor.create());
    }

    public static NeckOrgan create() {
        return new NeckOrgan(ConfigLoader.getHp("neck"));
    }
}
