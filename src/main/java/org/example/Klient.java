package org.example;


public class Klient {
    public String imię;
    public String nazwisko;
    public String adres;

    Klient(String imię, String nazwisko, String adres)
        {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.adres = adres;
        }
    public void WystawFakture()
        {

        }
    public String DaneKlienta()
        {
        return imię + "\n" + nazwisko + "\n" + adres;
        }
}
