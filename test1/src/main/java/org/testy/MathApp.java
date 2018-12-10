package org.testy;

import org.testy.excercise.MathService;

public class MathApp {

    private MathService math;

    public void setMath(MathService math) {
        this.math = math;
    }

    public int multiply(int a, int b)
    {
        return math.multiply(a,b);
    }
}
