public class LastDigitChecker {

    public static boolean hasSameLastDigit(int x, int y, int z){

        if(isValid(x)==true && isValid(y)==true && isValid(z)==true){

            int rightX = x % 10;
            int rightY = y % 10;
            int rightZ = z % 10;

            if (rightX == rightY || rightY == rightZ || rightX == rightZ) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static boolean isValid(int check){
        if(check<10 || check>1000){
            return false;
        } else {
            return true;
        }
    }

}
