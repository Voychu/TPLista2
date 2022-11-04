package org.example;

public class Towar {
    //pola
    public String nazwa;
    public double cena;

    //konstruktor
    Towar(int cena, String nazwa)
        {
        this.nazwa = nazwa;
        this.cena = cena;
        }

    //metoda
    public double PodajCene()
        {
        return cena;
        }
}
