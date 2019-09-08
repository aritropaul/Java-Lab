import java.util.*;

class Exercise2{
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];
        int[] b = new int[size];
        int k = 0;

        for (int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }

        s.close();

        for (int i=0;i<size;i++){
            if (arr[i]%2==0){
                b[k] = arr[i];
                k++;
            }
        }

        for (int i=0;i<size;i++){
            if (arr[i]%2!=0){
                b[k] = arr[i];
                k++;
            }
        }

        for (int i=0;i<size;i++){
            System.out.println(b[i]);
        }

    }

}