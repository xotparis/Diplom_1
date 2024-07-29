
import org.junit.Assert;
import org.junit.Test;
import praktikum.Bun;

import static CONSTANTS.CONSTANTS.TEST_EXPECTED_RESULT;

public class BunTest {

    @Test
    public void testGetName() {
        Bun bun = new Bun(TEST_EXPECTED_RESULT, 3.2f);
        Assert.assertEquals(TEST_EXPECTED_RESULT, bun.getName());
    }

    @Test
    public void testGetPrice() {
        Bun bun = new Bun(TEST_EXPECTED_RESULT, 3.8f);
        Assert.assertEquals(3.8f, bun.getPrice(), 0.0f);
    }
}