public class Main {

    public static String printUtArray(int [] arrayInn){
        String ut="";
        for(int i=0; i<arrayInn.length;i++){
            ut+= arrayInn[i];
        }
        return ut;
    }
    public static void main(String[] args) {
        Arrays newArray=new Arrays();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println();
        System.out.println("--------------Største tall-----------------");
        System.out.println(newArray.maks());
        System.out.println("------------Returner største og minste tall");
        newArray.minMaks();
        System.out.println();
        Arrays.fakultet(5);
        System.out.println();
        System.out.println("En mer effektiv maks algoritme");
        newArray.maks2();
        System.out.println();
        System.out.println(newArray.maks3());
        System.out.println(newArray.maks4());
        System.out.print("Det største tallet er: ");
        System.out.println(newArray.maks5());
        newArray.harmonisk(5);
        newArray.Euler(637);
        newArray.beregningAvAntallGanger(10);
        newArray.maksTest();
        int[] a = {8,3,5,7,9,6,10,2,1,4}, b = {};
        System.out.println(newArray.maksOptional(a));
        System.out.println(newArray.maksOptional(b));

        //Oppgaver 1.1.7 og videre:
        int[] A = {8,3,5,7,9,6,10,2,1,4};
        int[] B= {};
        Oppgaver117 instans= new Oppgaver117();
        instans.maksTest(A);
        //instans.MaksTesting();
        //instans.maksTest(B);

        //Oppgaver1.1.8Fra boken
        Forelesning118 instans118= new Forelesning118();
        instans118.generateRandomArray2();
        instans118.displayArrayWithIndexes();
        instans118.randPerm(10);
        instans118.displayArrayWithIndexes();
    }

}
