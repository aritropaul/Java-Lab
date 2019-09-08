
class JioCharges {

    String customerName;
    private Integer numOfCallsToJio;
    private Integer numOfCallsToOther;
    Integer billAmount;


    Integer getNumOfCallsToJio(){
        return numOfCallsToJio;
    }

    Integer getNumOfCallsToOther(){
        return  numOfCallsToOther;
    }

    void setNumOfCallsToJio(int calls){
        numOfCallsToJio = calls;
    }

    void setNumOfCallsToOther(int calls){
        numOfCallsToOther = calls;
    }

    JioCharges(){
        customerName = "";
        numOfCallsToJio = 0;
        numOfCallsToOther = 0;
        billAmount = 0;
    }

    JioCharges(String name, int jioCalls, int otherCalls){
        customerName = name;
        numOfCallsToJio = jioCalls;
        numOfCallsToOther = otherCalls;
        calculateBill();
    }

    void getData(String name, int jioCalls, int otherCalls){
        customerName = name;
        numOfCallsToJio = jioCalls;
        numOfCallsToOther = otherCalls;
        calculateBill();
    }

    void calculateBill() {
        int jioBill = 0;
        int otherBill = 0;
        if (numOfCallsToJio > 0 && numOfCallsToJio <= 200){
            jioBill = numOfCallsToJio*1;
        }
        else if (numOfCallsToJio > 200 && numOfCallsToJio <= 300){
            jioBill = numOfCallsToJio*2;
        }
        else {
            jioBill = numOfCallsToJio*5;
        }

        if (numOfCallsToOther > 0 && numOfCallsToOther <= 200){
            otherBill = numOfCallsToOther*2;
        }
        else if (numOfCallsToOther > 200 && numOfCallsToOther <= 300){
            otherBill = numOfCallsToOther*3;
        }
        else {
            otherBill = numOfCallsToOther*6;
        }

        billAmount = otherBill+jioBill;
    }
    
}

class Exercise7 {

    public static void main(String[] args){
        JioCharges[] bills = new JioCharges[5];
        
        bills[0] = new JioCharges("A", 205, 320);
        bills[1] = new JioCharges("B", 122, 30);
        bills[2] = new JioCharges("C", 229, 302);
        bills[3] = new JioCharges("D", 221, 358);
        bills[4] = new JioCharges("E", 20, 400);

        for (int i=0;i<5;i++){
            System.out.println(bills[i].customerName+": "+bills[i].billAmount);
        }
    }

}