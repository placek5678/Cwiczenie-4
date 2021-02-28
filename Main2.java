package com.company;

public class Main2
{
    public static void main(String[] args)
    {
        Punkt p1 = new Punkt(2, 5);
        Punkt p2 = new Punkt();
        System.out.println("Odległość pomiędzy Punktem 1, a Punktem 2 wynosi: " + p1.obliczodleglosc(p2));
    }
}
