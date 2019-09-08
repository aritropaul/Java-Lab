import java.util.*;

class MPL {

    int standard;
    int numOfStudents;
    int[] marks;
    int firstMark;

    MPL(int stan, int students){

        standard = stan;
        numOfStudents = students;
        marks = new int[students];
        int maxMark = 0;
        
        Scanner s = new Scanner(System.in);

        for(int i=0;i<students;i++){
            marks[i] = s.nextInt();
            if (marks[i] > maxMark) {
                maxMark = marks[i];
            }
        }

        s.close();

        firstMark = maxMark;
    }

    public MPL() {
        standard = 0;
        numOfStudents = 0;
        firstMark = 0;
    }
}

class Exercise8 {

    static MPL findBestClass(MPL[] classes){

        int maxMarks = 0;
        MPL bestClass = new MPL();

        for (int i=0;i<classes.length;i++){
            if (classes[i].firstMark > maxMarks) {
                maxMarks = classes[i].firstMark;
                bestClass = classes[i];
            }
        }

        return bestClass;
    }

    public static void main(String[] args){
        MPL[] classes = new MPL[3];

        classes[0] = new MPL(1, 3);
        classes[1] = new MPL(2, 3);
        classes[2] = new MPL(3, 3);
        
        System.out.println(findBestClass(classes).standard);
    }

}