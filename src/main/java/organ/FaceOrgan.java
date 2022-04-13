package organ;

import armor.FaceArmor;
import config.ConfigLoader;

public class FaceOrgan extends Organ {
    private FaceOrgan(double hp) {
        super(hp, FaceArmor.create());
    }

    public static FaceOrgan create() {
        return new FaceOrgan(ConfigLoader.getHp("face"));
    }
}
