package com.company;

public class Kwadrat
{
    int bok;
    int obwod;
    int pole;

    public Kwadrat(int bok){
        this.bok = bok;
        this.obwod = bok+bok+bok+bok;
        System.out.println("Obwod = " + this.obwod);
        this.pole = bok*bok;
        System.out.println("Pole = " + this.pole);
    }
}