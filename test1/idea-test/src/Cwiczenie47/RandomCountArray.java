package Cwiczenie47;

import java.util.*;

public class RandomCountArray {
    double[] tab;
    double[] tabCopy;
    static final double ARRAY_SIZE=5000000;

    public static void main(String[] args) {

    }

    private double[] randomGenerate()
    {
        Random r = new Random();
        //tab = new double[ARRAY_SIZE];
        for(int i=0;i<ARRAY_SIZE;i++)
        {
            tab[i]=r.nextDouble();
        }

        return tab;
    }
  /*  private double[] copyArray(double[] tabCopy)
    {
        //tabCopy = new double[ARRAY_SIZE];
        for(int i=0;i<ARRAY_SIZE;i++)
        {
            tabCopy[i];
        }
    }*/

}
