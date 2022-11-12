package org.example;

public class Element {

    //metoda
    public int ilosc;
    public Towar towar;

    //konstruktor
    Element(int ilosc, Towar towar)
    {
        this.ilosc = ilosc;
        this.towar = towar;
    }

    //metoda
    public double ObliczElement()
        {
        return towar.PodajCene()*ilosc;
        }
    public String PodajNazweTowaru()
        {
        return towar.PodajNazwe();
        }
}
