public class HW_3 {
    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));

    }
    public static String altPairs(String str){
        StringBuilder wrd=new StringBuilder(str);

            for (int i = 2; i <wrd.length() ; i=i+2) {
                int y = i;
                wrd = wrd.delete(y, y = y + 2);
            }
           return wrd.toString();
    }
}
