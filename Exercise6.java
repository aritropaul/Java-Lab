import java.util.*;

class Exercise6{


    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String line = s.nextLine();

        s.close();

        ArrayList<Character> symbols = new ArrayList<Character>();
        ArrayList<Character> variables = new ArrayList<Character>();

        boolean valid = false;

        line = line.replaceAll("\\s+", "");
        char[] lineCharArray = line.toCharArray();
        for(int i=0;i<line.length();i++){
            if (lineCharArray[i] == '%'){
                symbols.add(lineCharArray[i+1]);
            }

            if (lineCharArray[i] == ','){
                variables.add(lineCharArray[i+1]);
            }
        }

        for(int i=0;i<symbols.size();i++){
            if (symbols.get(i) == 'd'){
                if (variables.get(i) == 'a' || variables.get(i) == 'x' ){
                    valid = true;
                }
            }
            else if (symbols.get(i) == 's' && variables.get(i) == 's'){
                valid = true;
            }
            else if (symbols.get(i) == 'f' && variables.get(i) == 'b'){
                valid = true;
            }
            else{
                valid = false;
            }
            // System.out.println(valid);
        }


        if (valid == true) {
            System.out.println("Correct Syntax");
        }
        else {
            System.out.println("Wrong Syntax");
        }

    }
}









