public class HW_2 {
    public static void main(String[] args) {
        System.out.println(sumDouble(1,2));
        System.out.println(sumDouble(3,2));
        System.out.println(sumDouble(2,2));

    }
    public static int sumDouble(int a, int b){
        if(a!=b) {
            return a + b;
        }
        return 2*(a+b);
    }
}
