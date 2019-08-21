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

    }

}
