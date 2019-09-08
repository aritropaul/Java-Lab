import java.util.*;

class Exercise3{

    static int checkInArray(int[] a, int b){
        int count = 0;
        for (int i=0;i<a.length;i++){
            if (b==a[i]){
                count++;
            }
        }
        return count;
    }

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
            if (i==0){
                b[k] = arr[i];
                k++;
            }
            else{
                int val = checkInArray(b, arr[i]);
                if (val==0){
                    b[k] = arr[i];
                    k++;
                }
            }
        }

        int length = 0;
        for (int i=0;i<b.length;i++){
            if (b[i]!=0){
                length++;
            }
        }
        System.out.println("Length: "+length);
    }

}