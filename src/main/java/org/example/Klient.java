package org.example;


public class Klient {
    private String imię;
    private String nazwisko;
    private String adres;

    Klient(String imię, String nazwisko, String adres)
        {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.adres = adres;
        }
    public Faktura WystawFakture(int numer, Element[] elementy)
        {
        Faktura faktura = new Faktura(numer, elementy);
        return faktura;
        }
    public String DaneKlienta()
        {
        return imię + "\n" + nazwisko + "\n" + adres;
        }

    private Zadanie2 _zadanie2;
    public Klient(Zadanie2 zadanie2)
    {
        _zadanie2 = zadanie2;
    }
    public void DodajDoBazy(Faktura faktura)
    {
        _zadanie2.DodajDoBazy(faktura);
    }

}
