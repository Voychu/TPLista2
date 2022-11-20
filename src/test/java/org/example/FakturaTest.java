package org.example;

import org.junit.Test;
import java.text.DecimalFormat;
import static org.junit.Assert.*;


public class FakturaTest {

    @Test
    public void TestKwotyCalkowitej()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        Element[] elementy = new Element[3];
        double suma = 0;
        for(int i=0; i<3; i++)
        {
            elementy[i] = new Element(5, new Towar("test", 2.50));
            suma = suma + elementy[i].ObliczElement();
        }
        Faktura faktura = new Faktura(1,elementy);
        assertEquals(df.format(faktura.ObliczKwoteBrutto()),df.format(suma));
    }

    @Test
    public void TestElementu()
    {
        DecimalFormat df = new DecimalFormat("0.00");
        Towar towar = new Towar("test", 14.50);
        Element element = new Element(4, towar);
        assertEquals(df.format(element.ObliczElement()),df.format(towar.PodajCene()*4) );
    }

    @Test
    public void TestDanychKlienta()
    {
        String imię = "testImię";
        String nazwisko = "testNazwisko";
        String adres = "TestAdres";
        Klient klient = new Klient(imię, nazwisko, adres);
        assertEquals(imię + "\n" + nazwisko + "\n" + adres, klient.DaneKlienta());
    }
}