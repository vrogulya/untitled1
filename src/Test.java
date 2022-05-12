public class Test {
    public static void main(String[] args) {
        System.out.println(easy(9));
    }
    //з неймінгом ше працювати треба 
    public static boolean easy(int n) {
        boolean t = false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                t = true;
                break;
            }
        }
        return !t;
    }
}




