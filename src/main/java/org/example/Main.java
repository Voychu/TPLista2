package org.example;

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imię: ");
        String imię = scanner.nextLine();
        System.out.println("Nazwisko: ");
        String nazwisko = scanner.nextLine();
        System.out.println("Adres: ");
        String adres = scanner.nextLine();
        Klient klient = new Klient(imię, nazwisko, adres);

        System.out.println("Ile elementów będzie na fakturze? ");
        String ile_elementow = scanner.nextLine();
        int pomoc = Integer.parseInt(ile_elementow);
        Element[] elementy = new Element[pomoc];

        for(int k = 0; k<pomoc; k++)
            {
            System.out.println("Towar nazwa: ");
            String nazwa = scanner.nextLine();
            System.out.println("Towar cena za sztukę: ");
            String cena_za_sztuke = scanner.nextLine();
            double pomoc_double = Double.parseDouble(cena_za_sztuke);
            Towar towar = new Towar(nazwa, pomoc_double);
            System.out.println("Ile sztuk: ");
            String ile_sztuk = scanner.nextLine();
            int ile_sztuk2 = Integer.parseInt(ile_sztuk);
            elementy[k] = new Element(ile_sztuk2, towar);
            }

        Faktura faktura = new Faktura(1, elementy);
        System.out.println("Dane klienta:\n" + klient.DaneKlienta());
        System.out.println("\nKwota: ");
        for(int l = 0; l<pomoc; l++)
            {
            System.out.println(elementy[l].PodajNazweTowaru() + ": " + df.format(elementy[l].ObliczElement()));
            }
        System.out.println("Kwota Brutto calosc: " + df.format(faktura.ObliczKwoteBrutto(elementy)));
        System.out.println("VAT calosc: " + df.format(faktura.ObliczKwoteBrutto(elementy)*0.23));

    }
}