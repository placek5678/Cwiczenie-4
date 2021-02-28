package com.company;

public class Punkt
{
    private final int x;
    private final int y;

    public Punkt()
    {
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public double obliczodleglosc(Punkt innyPoint)
    {
        double a = this.x - innyPoint.wezX();
        double b = this.y - innyPoint.wezY();

        return Math.sqrt(a + b);
    }

    public double odleglosc(int x2, int y2)
    {
        double a = this.x - x2;
        double b = this.y - y2;

        return Math.sqrt(a + b);
    }

    public int wezX()
    {
        return x;
    }

    public int wezY()
    {
        return y;
    }
}