package book rental;

import org.junit.Assert;
import org.junit.Test;

public class CalcTests {

    @Test
    public void shouldAdd() {
        net.siudek.Calc calc = new net.siudek.Calc();

        int result = calc.add(1,2);

        Assert.assertEquals(3, result);
    }
}
