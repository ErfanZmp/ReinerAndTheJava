import titans.ArmoredTitan;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitanTests {

    @Test
    public void HpTest()
    {
        ArmoredTitan titan = ArmoredTitan.create();
        assertEquals(30,titan.getFaceOrgan().getHp());
        assertEquals(45,titan.getNeckOrgan().getHp());
        assertEquals(80,titan.getLeftArmOrgan().getHp());
        assertEquals(80,titan.getRightArmOrgan().getHp());
        assertEquals(210,titan.getChestOrgan().getHp());
        assertEquals(50,titan.getStomachOrgan().getHp());
        assertEquals(55,titan.getLeftLegOrgan().getHp());
        assertEquals(55,titan.getRightLegOrgan().getHp());
        assertEquals(45,titan.getLeftFootOrgan().getHp());
        assertEquals(45,titan.getRightFootOrgan().getHp());
    }

    @Test
    public void DurabilityTest(){
        ArmoredTitan titan = ArmoredTitan.create();
        assertEquals(60,titan.getFaceOrgan().getArmor().getDurability());
        assertEquals(50,titan.getNeckOrgan().getArmor().getDurability());
        assertEquals(75,titan.getLeftArmOrgan().getArmor().getDurability());
        assertEquals(75,titan.getRightArmOrgan().getArmor().getDurability());
        assertEquals(115,titan.getChestOrgan().getArmor().getDurability());
        assertEquals(100,titan.getStomachOrgan().getArmor().getDurability());
        assertEquals(110,titan.getLeftLegOrgan().getArmor().getDurability());
        assertEquals(110,titan.getRightLegOrgan().getArmor().getDurability());
        assertEquals(76.3,titan.getLeftFootOrgan().getArmor().getDurability());
        assertEquals(76.3,titan.getRightFootOrgan().getArmor().getDurability());
    }

    @Test
    public void DamageTest()
    {
        ArmoredTitan titan = ArmoredTitan.create();
        assertFalse(titan.getFaceOrgan().takeDamage(30));
        assertEquals(9,titan.getFaceOrgan().getHp());
        assertTrue(titan.getChestOrgan().takeDamage(2000));
    }
}
