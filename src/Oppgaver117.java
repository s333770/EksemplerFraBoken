import java.util.OptionalInt;

public class Oppgaver117 {

    public static int maks(int[] a)  // a er en heltallstabell
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("Tabellen a er tom!");

        int m = 0;  // indeks til foreløpig største verdi

        for (int i = 1; i < a.length; i++) // obs: starter med i = 1
        {
            if (a[i] > a[m]) m = i;  // indeksen oppdateres
        }

        return m;  // returnerer indeksen/posisjonen til største verdi

    } // maks

    public static void maksTest(int[] a){
      if(maks(a)!=6) {
          System.out.println("Feil posisjon");
      }
      boolean unntak=false;
      try{
          maks(a);
      }
      catch(Exception e){
          unntak=true;
          if(!(e instanceof java.util.NoSuchElementException));
          System.out.println("Feil exception blir kastet");
      }
      if(!unntak){
          System.out.println("Det skal kastes unntak for tom tabell");
      }


    }
    //Oppgave 2
    public static void makstest()
    {
        int[] a = { 8, 3, 5, 7, 9, 6, 10, 2, 1, 4 };  // 10 er i posisjon 6

        int antallfeil = 0;

        if (maks(a) != 6) // kaller maks-metoden
        {
            System.out.println("Test 1 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 10, 9, 8, 7, 6 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 2 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 1, 2, 3, 4, 5 };

        if (maks(a) != 4) // kaller maks-metoden
        {
            System.out.println("Test 3 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 2, 3, 3, 5, 3, 5, 4 };

        if (maks(a) != 3) // kaller maks-metoden
        {
            System.out.println("Test 4 - feil posisjon!");
            antallfeil++;
        }

        a = new int[]{ 2 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 5 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 1, 2 };

        if (maks(a) != 1) // kaller maks-metoden
        {
            System.out.println("Test 6 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { 2, 1 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 7 - feil posisjon!");
            antallfeil++;
        }

        a = new int[] { -5, -5 };

        if (maks(a) != 0) // kaller maks-metoden
        {
            System.out.println("Test 8 - feil posisjon!");
            antallfeil++;
        }

        a = new int[0];  // en tom tabell
        boolean unntak = false;

        try
        {
            maks(a);  // kaller maks-metoden
        } catch (Exception e)
        {
            unntak = true;
            if (!(e instanceof java.util.NoSuchElementException))
            {
                System.out.println("Kaster feil unntak for en tom tabell!");
                antallfeil++;
            }
        }

        if (!unntak)
        {
            System.out.println("Det skal kastes unntak for en tom tabell!");
            antallfeil++;
        }

        a = null;
        unntak = false;
        try
        {
            maks(a);  // kaller maks-metoden
        } catch (Exception e)
        {
            unntak = true;
            if (!(e instanceof NullPointerException))
            {
                System.out.println("Kaster feil unntak for en null-tabell!");
                antallfeil++;
            }
        }

        if (!unntak)
        {
            System.out.println("Det skal kastes unntak for en null-tabell!");
            antallfeil++;
        }

        System.out.println("Antall feil: " + antallfeil);
    }
    //Oppgave 3
    public static int maksMedLengdeSjekk(int[] a)   // versjon 2 av maks-metoden
    {
        if (a.length < 1)
        {
            throw new java.util.NoSuchElementException("a er tom");
        }

        int m = 0;               // indeks til største verdi
        int maksverdi = a[0];    // største verdi

        for (int i = 1; i < a.length; i++)
        {
            if (a[i] > maksverdi)
            {
                maksverdi = a[i];     // største verdi oppdateres
                m = i;                // indeks til største verdi oppdaters
            }
        }
        return m;   // returnerer indeks/posisjonen til største verdi

    } // maks

    //Oppgave 4
    public static int maksOppgave4(int[] a)  // versjon 3 av maks-metoden
    {
        if (a.length < 1)
            throw new java.util.NoSuchElementException("a er tom");

        int sist = a.length - 1;       // siste posisjon i tabellen
        int m = 0;                     // indeks til største verdi
        int maksverdi = a[0];          // største verdi
        int temp = a[sist];            // tar vare på siste verdi
        a[sist] = 0x7fffffff;          // legger tallet 2147483647 sist

        for (int i = 0; ; i++)         // i starter med 1
            if (a[i] >= maksverdi)       // denne blir sann til slutt
            {
                if (i == sist)             // sjekker om vi er ferdige
                {
                    a[sist] = temp;          // legger siste verdi tilbake
                    return temp > maksverdi ? sist : m;   // er siste størst?
                }
                else if (a[i] > maksverdi)
                {
                    maksverdi = a[i];        // maksverdi oppdateres
                    m = i;                   // m oppdateres
                }
            }
    } // maks

    //Oppgave5
    public static void MaksTesting(){
        int[] A = {8,3,5,7,9,6,10,2,1,4};
        int[] B= {};
        OptionalInt resultat1= OptionalInt.of(maks(B)); // Er en klasse som sjekker om en Int er presentert
        if (resultat1.isPresent()){
            System.out.println(resultat1.getAsInt());
        }
        else{
            System.out.println("Ingen verdi");
            System.out.println(resultat1.orElse(-1));// Printer dette dersom den ikke finnes
        }
    }


}
