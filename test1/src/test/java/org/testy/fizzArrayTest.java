package org.testy;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class fizzArrayTest {

    /*static FizzArray fa;
    @BeforeClass
    public static void createObject()

    {
        fa = new FizzArray();
    }
*/
    @Test
    public void fizzArray() {
        FizzArray fa = new FizzArray();
        int[] tabcheck = new int[]{0, 1, 2, 3,4,5,6,7,8,9};
        int[] actualOut = fa.arrayFizz(10);

        for(int i=0;i<tabcheck.length;i++) {
            assertEquals("nie udalo sie przejsc testu", actualOut[i], tabcheck[i]);
        }
    }
}