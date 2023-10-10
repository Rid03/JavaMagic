import java.util.Random;

public class Train1 {
    public static void main(String[] args) {
              int branchCount = new Random().nextInt(0, 10);
                if (branchCount >= 8) {
                    System.out.println("Число больше или равно 8. Ветка подходит");
                } else {
                    System.out.println("Слишком маленько число. Мало веточек :с");
                }
                branch();
    }
    public static void branch() {
        int branchCount = new Random().nextInt(0, 10);
        if (branchCount >= 8) {
                    System.out.println("Кладем ветку в кучу больших веток");
        } else if (branchCount == 5) {
                System.out.println("Древороги (существо с деревянным рогом) едят только ветки с пятью веточками!");
        } else if (branchCount == 1) {
                System.out.println("Ну, это посох");
        }else {
            System.out.println("Такие нам сейчас не нужны. Будем топить ими камин");
        }
    }
}
