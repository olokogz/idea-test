package org.testy;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarmUpTest {

    @Test
    public void sleepIn() {
        //Given
        WarmUp wu = new WarmUp();
        boolean a=true,b=false;
        boolean out1 = false;
        //when
        boolean check = wu.sleepIn(a,b);
        //then
        assertEquals(out1,check);
    }
    @Test
    public void test1(){
        //given
        WarmUp wu = new WarmUp();
        boolean a=false, b=false;
        boolean out1=false;
        assertTrue("jest ok",wu.sleepIn(a,b));
    }
    @Test
    public void test2()
    {
        WarmUp wu = new WarmUp();
        boolean a=false,b=true;
        //boolean out=false;
        boolean outfalse=true;
        boolean check = wu.sleepIn(b,a);
        fail("niedobrze");

    }
}