package org.testy;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.testy.excercise.MathService;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class MathAppTest {

    @Mock
    MathService mathService;

    @InjectMocks
    MathApp mathApp = new MathApp();

    @Test
    public void multiply() {

        when(mathService.multiply(10,20)).thenReturn(200);
        assertEquals(200,mathApp.multiply(10,20));

    }
}