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
        System.out.println("Genereing av random tall");
        newArray.randPerm(10);
        System.out.println();
        System.out.println("Generering av ulike tall");
        //newArray.randPermUtenRep(10);
        newArray.egenGeneringAvRandomArray(10);
        System.out.println();
        System.out.println("Boolean Int: ");
        newArray.booleanInt(10);

    }

}
