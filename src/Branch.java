import java.util.Random;

public class Branch {
    public static void main(String[] args) {
        int one = new Random().nextInt(0, 10);
        int two = new Random().nextInt(0, 10);
        int result;
        if (one % 2 == 0 && two % 2 == 0) {
            result = one / 2 + two / 2;
        } else if (one % 2 == 0 && two % 2 != 0) {
            result = one / 2 + two;
        } else if (one % 2 != 0 && two % 2 == 0) {
            result = one + two / 2;
        } else {
            result = one + two;
        }
        System.out.println(result);
    }
}
