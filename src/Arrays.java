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

}

