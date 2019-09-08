import java.util.*;

class Q1{

    public static void main(String args[]) {
        int[] slowLearners = new int[4];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 4; i++){
            slowLearners[i] = s.nextInt();
        }

        s.close();

        int[][] tutorArray = new int[4][];

        for (int i = 0; i < 4; i++){
            if (slowLearners[i]%4 == 0){
                int numberOfBatches = slowLearners[i]/4;
                tutorArray[i] = new int[numberOfBatches];
                for(int j = 0;j < numberOfBatches;j++){
                    tutorArray[i][j] = 4;
                }
            }
            else if (slowLearners[i]%4 != 0){
                int numberOfBatches = slowLearners[i]/4+1;
                tutorArray[i] = new int[numberOfBatches];
                for(int j = 0;j < numberOfBatches-1;j++){
                    tutorArray[i][j] = 4;
                }
                tutorArray[i][numberOfBatches-1] = slowLearners[i]%4;
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j<tutorArray[i].length; j++){
                System.out.print(tutorArray[i][j]+" ");
            }
            System.out.println();
        }


    }

}