import java.util.*;


class SortingBoi {

    int[] bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for (int j=0;j<a.length-i-1;j++){
                if (a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }

    void sortArr(int[] a, int size){
        int[] b = new int[size];
        a = bubbleSort(a);
        int startPos = 0;
        int endPos = a.length-1;
        for (int i=0;i<size;i++){            
            if (i%2==0){
                b[i] = a[startPos];
                // System.out.print(a[startPos]+ " ");
                startPos++;
            }
            else {
                b[i] = a[endPos];
                // System.out.print(a[endPos]+ " ");
                endPos--;
            }
        }

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
        System.out.println();
    }
}

class Exercise1 {
    public static void main(String[] args) {

        SortingBoi sorter = new SortingBoi();

        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i=0;i<size;i++){
            arr[i] = s.nextInt();
        }
        s.close();
        sorter.sortArr(arr, size);
    }
}