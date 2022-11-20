package org.example;

public class Towar {
    //pola
    private transient String nazwa;
    private transient double cena;

    //konstruktor
    Towar(final String nazwa, final double cena)
        {
        this.nazwa = nazwa;
        this.cena = cena;
        }

    //metoda
    public double PodajCene()
        {
        return cena;
        }
    public String PodajNazwe()
        {
        return nazwa;
        }
}
