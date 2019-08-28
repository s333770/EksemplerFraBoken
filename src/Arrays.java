import java.util.OptionalInt;

public class Arrays {
    private int[] arrays=new int[30];
    private int arraySize=10;
    public void generateRandomArray(){
        for(int i=0; i<arraySize; i++){
            arrays[i]=(int)(Math.random()*20);
        }
    }
    public void printArray(){
        for(int i=0; i<arraySize; i++){
            System.out.printf("%5s",i);
        }
        System.out.println();
        for(int i=0; i<arraySize; i++){
            System.out.printf("%5s",arrays[i]);
        }
    }
    public String maks(){ // 1.1.2
        if(arraySize<1){
            throw new java.util.NoSuchElementException("Tabellen er tom");
        }
        int m=0;
        for(int i=1; i<arraySize;i++){
            if(arrays[i]>arrays[m]){
                m=i;
            }
        }
        return " Posisjonen er "+m+" Største tall er "+arrays[m];
    }
    public int[] minMaks() {//Oppgave 1.1.3..5
        int mi=0, minVerdi=arrays[0];
        int ma=0, maksVerdi=arrays[0];
        int verdi=0;

        for(int i=1; i<arrays.length; i++){
            verdi=arrays[i];
            if(verdi>maksVerdi){
                maksVerdi=verdi;
                ma=arrays[i];
            }
            else if(verdi<minVerdi){
                minVerdi=verdi;
                mi=arrays[i];
            }

        }
        System.out.print("Minste tallet er: "+mi+" Største tallet er: "+ma) ;
        return new int[]{mi,ma};

    }
    public static int fakultet(int lengde){
        int x=1;
        for(int i=2; i<=lengde; i++){
            x*=i;
        }
        System.out.println("Fakultet av "+lengde+" er "+x);
        return x;
    }

    //EN mer effektiv algoritme for maks-metode
    public int maks2(){
        int m=0;
        int maksverdi=arrays[0];
        for(int i=1; i<arraySize; i++){
            if(arrays[i]>maksverdi){
                maksverdi=arrays[i];
                m=i;
            }
        }
        System.out.println("Største verdi er: "+arrays[m]);
        return m;
    }
    // Versjon 3 av maks-metoden med vei-vokter
    public int maks3(){
        int sist=arraySize;
        int m=0;
        int maksverdi=arrays[0];
        int temp=arrays[sist];
        arrays[sist]=0x7fffffff;
        System.out.print("Det største tallet er: ");
        for(int i=0; ; i++){
            if(arrays[i]>=maksverdi){
                if(i==sist){
                    arrays[sist]=temp;
                    return temp>=maksverdi ? arrays[sist] : arrays[m];
                }
                else{
                    maksverdi=arrays[i];
                    m=i;

                }
            }
        }


    }
    // Vi skal gjennomføre den samme algoritmen, forskjellen er at vi nå
    // skal se på hvordan vi kan returnere den samme
    public int maks4(){
        int m=arraySize;
        int maksverdi=arrays[m];
        int temp=arrays[0];
        arrays[0]=0x7fffffff;
        System.out.print("Det største tallet er: ");
        for (int i=m;; i--){
            if(arrays[i]>=maksverdi){
                if(i==0){
                    arrays[0]=temp;
                    return temp>=maksverdi? arrays[0] : arrays[m] ;
                }
                else{
                    maksverdi=arrays[i];
                    m=i;
                }
            }

        }
    }

    //Siste versjon av maks metoden,her bruker vi at tabellens
    //siste verdi inneholde det samme som hjelpevariabelen maksverdi.
    //Dermed blir a[i] >=maksverdi når i blir lik sist
    public int maks5(){
        int sist=arraySize;
        int m=0;
        int maksverdi=arrays[0];
        int temp=arrays[sist];
        arrays[sist]=maksverdi;

        for (int i=0;; i++){
            if(arrays[i]>=maksverdi){
                if(i==sist){
                    arrays[sist]=temp;
                    return arrays[sist]>maksverdi ? arrays[sist] : arrays[m];
                }
                else if(arrays[i]>maksverdi){
                    maksverdi=arrays[i];
                    arrays[sist]=maksverdi;
                    m=i;
                }
            }

        }



    }
    /*
    1.1.6 Fra boken
     */
    public double harmonisk(int n){
        double sum=0.0;
        System.out.print("Det " +n+"-te harmoniske tallet er: ");
        for(int i=1; i<=n; i++){
            sum+=1.0/i;
        }
        System.out.println(Math.round(sum*100d)/100d);
        return sum;
    }
    /*
    * 1.1.7
    * */
    public double Euler(int n){

        System.out.println("Beregning av Euler for: "+n+": ");
        System.out.println(harmonisk(n)-Math.log(n));
        return 0;
    }
    public double beregningAvAntallGanger(int n){

        for(int i=0; i<7; i++){
            double x=Math.log(n)-0.423;
            System.out.printf("n= %-8d ln(n)-0.423=%4.1f\n",n,x);
            n*=10;
        }
        return 0;
    }

    public static int maksFasit(int[] a)  // a er en heltallstabell
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

    //Programkode for enkel test av maks metode:
    public void maksTest(){
        int [] a= {8,3,5,7,9,6,10,2,1,4};
        int[] b={};
        if (maksFasit(a)!=6){
            System.out.println("Kodefeil: Gir feil posisjon i maksverdien");
            a=new int[0];
            boolean unntak=false;
            try{
                maksFasit(b);
            }
            catch(Exception e){
                unntak=true;
                if(!(e instanceof java.util.NoSuchElementException)){
                    System.out.println("Kodefeil: Feil unntakt for en tom tabell");
                }
                if(!unntak){
                    System.out.println("Kodefeil: Mangler unntak for en tom tabell");
                }
            }

        }
    }

    //1.1.7 b, I dette eksempelet ser vi på et eksempel der vi bruker klassen OptionalInt
    // Som inneholder en verdi hvis den finner verdier i en array, ellers returner den empty
    public OptionalInt maksOptional(int[] a)           // indeks til største verdi
    {
        if (a.length < 1) return OptionalInt.empty();   // en konstruksjonsmetode

        int m = 0, maksverdi = a[0];                    // startindeks og verdi

        for (int i = 1; i < a.length; i++)              // starter med i = 1
        {
            if (a[i] > maksverdi)
            {
                m = i; maksverdi = a[i];                    // oppdaterer
            }
        }

        return OptionalInt.of(m);                       // en konstruksjonsmetode
    }
    // Oppgaver til kapittell 1.1.7




}

