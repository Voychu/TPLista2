package org.example;

public class Element {

    //metoda
    public int ilosc;

    //konstruktor
    Element(int ilosc)
    {
        this.ilosc = ilosc;
    }

    //metoda
    public double ObliczElement(Towar towar)
        {
        return towar.PodajCene()*ilosc;
        }
}
