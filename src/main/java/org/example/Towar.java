package org.example;

public class Towar {
    //pola
    public String nazwa;
    public double cena;

    //konstruktor
    Towar(String nazwa, double cena)
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
