import java.util.Random;

public class Quidditch {
    public static void main(String[] args) {
        getBalls();
        playGame();
    }

    public static void getBalls() {
        for (int i = 1; i <= 3; i++) {
            String ball;
            if (i == 1) {
                ball = "Quaffle";
            } else if (i == 2) {
                ball = "Bludger";
            } else {
                ball = "Golden Snitch";
            }
            System.out.println(" Запущен мяч под названием " + ball);
        }
    }

    public static void playGame() {
        int control = 0;
        while (control != 100) {
            control = new Random().nextInt(0, 101);
            System.out.println(control);
            if (control == 100) {
                System.out.println("Снитч пойман");
            }
        }
    }
}
