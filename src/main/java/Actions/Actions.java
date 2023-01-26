package Actions;

import utilities.CommonOps;

public class Actions extends CommonOps {
    public static boolean greaterThan(int firstNumber , int secondNumber){
        return firstNumber > secondNumber;
    }
    public static char getNumberFromString(String num_from_string){
        return num_from_string.charAt(0);
    }
}
