import java.util.*;

class Q2 {

    public static boolean isNumeric(String strNum) {
        return strNum.matches("^[0-9]+$");
    }

    public static boolean isAlphaNumeric(String strNum) {
        return strNum.matches("^[a-zA-Z0-9]+$");
    }

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        String registrationNumber = s.nextLine();
        String mobileNumber = s.nextLine();

        try {
            if (registrationNumber.length() != 9 || mobileNumber.length() != 10){
                throw new IllegalArgumentException();
            }
            else if (!isNumeric(mobileNumber)){
                throw new NumberFormatException();
            }
            else if (!isAlphaNumeric(registrationNumber)){
                throw new NoSuchElementException();
            }
            else{
                System.out.println("valid");
            }
        }
        catch (NoSuchElementException NSEE){
            System.out.println("invalid");
        }
        catch (NumberFormatException NFE){
            System.out.println("invalid");
        }
        catch (IllegalArgumentException IAE){
            System.out.println("invalid");
        }


    }
}