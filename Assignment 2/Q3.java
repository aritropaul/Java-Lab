import java.util.*;

class voteCounter extends Thread {

    int votesOfA = 0;
    int votesOfB = 0;
    int votesOfC = 0;
    int start = 0;
    int end = 240;
    int[] votesArray = new int[240];
    
    voteCounter(int start, int end, int[] votesArray){
        this.start = start;
        this.end = end;
        this.votesArray = votesArray;
    }

    public void run() 
    { 
        try
        { 
            // Displaying the thread that is running 
            // System.out.println ("Thread " + Thread.currentThread().getId() + " is running"); 
            this.count();
        } 
        catch (Exception e) 
        { 
            // Throwing an exception 
            System.out.println ("Exception is caught"); 
        } 
    }

    public void count(){
        for(int i=start; i<end; i++){
            // System.out.println(votesArray[i]);
            if (votesArray[i] == 1){
                this.votesOfA++;
            }
            if (votesArray[i] == 2){
                this.votesOfB++;
            }
            if (votesArray[i] == 3){
                this.votesOfC++;
            }
        }
    }
}

class Q3{ 

    static int votesOfA = 0;
    static int votesOfB = 0;
    static int votesOfC = 0;

    public static synchronized void collector(voteCounter[] thread){
        int count = thread.length;
        for (int i=0;i<count;i++){
            votesOfA = thread[i].votesOfA;
            votesOfB = thread[i].votesOfB;
            votesOfC = thread[i].votesOfC;
            try
            { 
                thread[i].join(); 
            } 
    
            catch(Exception ex) 
            { 
                System.out.println("Exception has " + 
                                    "been caught" + ex); 
            } 
        }

        System.out.println(votesOfA);
        System.out.println(votesOfB);
        System.out.println(votesOfC);

        if (votesOfA >= votesOfB && votesOfA >= votesOfC){
            System.out.println("A is the winner.");
        }
        else if (votesOfB >= votesOfA && votesOfB >= votesOfC){
            System.out.println("B is the winner.");
        }
        else {
            System.out.println("C is the winner.");
        }

    }

    public static void main(String args[]){
        int[] votesArray = new int[240];
        for (int i=0;i<240;i++){
            int random = (int)(Math.random() * 3 + 1);
            votesArray[i] = random;
        }

        // for (int i=0;i<240;i++){
        //     System.out.println(votesArray[i]);
        // }

        voteCounter th1 = new voteCounter(0,60,votesArray);
        voteCounter th2 = new voteCounter(61,120,votesArray);
        voteCounter th3 = new voteCounter(121,180,votesArray);
        voteCounter th4 = new voteCounter(181,240,votesArray);
        th1.start();
        th2.start();
        th3.start();
        th4.start();
        collector(new voteCounter[]{th1, th2, th3, th4});
    }
}