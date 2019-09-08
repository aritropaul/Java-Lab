import java.util.*;

class HashFoldShift {
    Integer foldShift(String data){
        int sum = 0;
        boolean flag = false;
        char[] charData = data.toCharArray();
        for(int i=0;i<charData.length-1;i+=2){
            if (charData.length%2==0){
                flag = true;
                String s = String.valueOf(charData[i])+String.valueOf(charData[i+1]);
                sum += Integer.parseInt(s);
            }
            else {
                flag = false;
                String s = String.valueOf(charData[i])+String.valueOf(charData[i+1]);
                sum += Integer.parseInt(s);

            }
        }
        if (flag == false){
            sum += Integer.parseInt(String.valueOf(charData[charData.length-1]));
        }
        return sum;
    }
}


class Q2 {

    static String rotation(String data){
        char[] charData = data.toCharArray();
        char temp = charData[charData.length-1];
        for(int i=charData.length-1;i>0;i--){
            charData[i] = charData[i-1];
        }
        charData[0] = temp;
        return String.valueOf(charData);
    }

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String data = s.nextLine();
        HashFoldShift h = new HashFoldShift();
        int hashSum = h.foldShift(rotation(data));
        if (hashSum > 99){
            String hashString = String.valueOf(hashSum);
            System.out.println(hashString.substring(1, hashString.length()));
        }
        else{
            System.out.println(hashSum);
        }
        s.close();
    }

}