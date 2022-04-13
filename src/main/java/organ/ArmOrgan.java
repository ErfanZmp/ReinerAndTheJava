package organ;

import armor.ArmArmor;
import config.ConfigLoader;

public class ArmOrgan extends Organ {
    private ArmOrgan(double hp) {
        super(hp, ArmArmor.create());
    }
    
    public static ArmOrgan create() {
        return new ArmOrgan(ConfigLoader.getHp("arm"));
    }
}
