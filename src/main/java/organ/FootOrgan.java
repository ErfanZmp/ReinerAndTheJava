package organ;

import armor.FootArmor;
import config.ConfigLoader;

public class FootOrgan extends Organ{
    private FootOrgan(double hp) {
        super(hp, FootArmor.create());
    }

    public static FootOrgan create() {
        return new FootOrgan(ConfigLoader.getHp("foot"));
    }
}
