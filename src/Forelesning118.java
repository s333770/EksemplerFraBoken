import java.util.Random;

public class Forelesning118 {

    private int[] arraysGenerert=new int[10];
    int arraySize=arraysGenerert.length-1;
    private static int[] arrayVariert=new int[10];


    public void generateRandomArray2() {

        for (int i = 0; i <= arraySize; i++) {
            arraysGenerert[i] = (int)( Math.random()*10);
        }


    }

    public void displayArrayWithIndexes() {
            int length=arraysGenerert.length;
            for(int i=0; i<length; i++){
                System.out.printf("%5s",i);
            }
        System.out.println();
        for(int i=0; i<length; i++){
                System.out.printf("%5s",arraysGenerert[i]);

            }

        }
        public static int[] randPerm(int n){
        Random r=new Random();

        for(int i=0; i<n;){
            int k=r.nextInt()+1;
            int j=0;
            for(; j<i; j++){
                if(arrayVariert[j]==k){
                    break;
                }
                if(i==j){
                    arrayVariert[i++]=k;
                }
            }

        }
            return arrayVariert;
        }
}


