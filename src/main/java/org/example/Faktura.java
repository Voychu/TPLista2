package org.example;

public class Faktura {
    //pola
    public int numer;
    public String data;
    public String sprzedawca;
    public Element[] elementy;

    //konstruktor
    Faktura(int numer, Element[] elementy)
    {
        this.numer = numer;
        this.elementy = elementy;

    }

    //metody
    public double ObliczKwoteBrutto(Element[] elementy)
        {
        double calosc_kwota = 0;
        for(int i=0; i<elementy.length; i++)
            {
            calosc_kwota = calosc_kwota + elementy[i].ObliczElement();
            }
        return calosc_kwota;
        }
}
