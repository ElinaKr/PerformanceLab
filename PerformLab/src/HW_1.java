public class HW_1 {
    public static void main(String[] args) {

        System.out.println(sleepIn(false,true));

    }
    public  static boolean sleepIn(boolean weekday, boolean vacation){

        if (!weekday || vacation) {
            return true;
        }
        return false;
    }

}
