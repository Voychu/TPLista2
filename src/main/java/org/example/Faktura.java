package org.example;


public class Faktura {
    //pola
    private int numer;
    private Element[] elementy;


    //konstruktor
    Faktura(final int numer, final Element[] elementy)
        {
        this.numer = numer;
        this.elementy = elementy;
        }
    public int ZwrocNumer()
        {
        return numer;
        }
    public Element[] ZwrocElementy()
    {
        return elementy;
    }

    //metody
    public double ObliczKwoteBrutto()
        {
        double caloscKwota = 0;
        for(int i=0; i<elementy.length; i++)
            {
            caloscKwota = caloscKwota + elementy[i].ObliczElement();
            }
        return caloscKwota;
        }

    public Element UtworzElement(int ilosc, Towar towar)
        {
        return new Element(ilosc, towar);
        }


}
