import java.util.*;

class Exercise4{

    static void checkSum(int[] a, int sum){
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[j]+a[i]==sum){
                    System.out.println(a[i]+" "+a[j]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];
        int sum = s.nextInt();

        for (int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }

        checkSum(arr, sum);
        
        s.close();
    }
}