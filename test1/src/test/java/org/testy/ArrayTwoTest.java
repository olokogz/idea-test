package org.testy;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayTwoTest {

    @Test
    public void sum13() {
        //Given
        int[] tab = {1,2,2,1};
        ArrayTwo at = new ArrayTwo();
       int check = at.sum13(tab);
        //when
        assertEquals(6,check);
    }
}