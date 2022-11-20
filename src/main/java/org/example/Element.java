package org.example;

public class Element {

    //metoda
    private int ilosc;
    private Towar towar;

    //konstruktor
    Element(final int ilosc, final Towar towar)
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
    public int ZwrocIlosc()
        {
        return ilosc;
        }
    public Towar UtworzTowar(final String nazwa, final double cena)
        {
        return new Towar(nazwa, cena);
        }
}
