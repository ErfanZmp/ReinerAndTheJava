package organ;

import armor.StomachArmor;
import config.ConfigLoader;

public class StomachOrgan extends Organ {
    private StomachOrgan(double hp) {
        super(hp, StomachArmor.create());
    }

    public static StomachOrgan create() {
        return new StomachOrgan(ConfigLoader.getHp("stomach"));
    }
}
