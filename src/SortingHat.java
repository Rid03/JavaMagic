import java.util.Scanner;

public class SortingHat {
    private final String question1 = "Ты предпочитаешь работать в команде? (Да/Нет)";
    private final String question2 = "Ты любишь разгадывать головоломки? (Да/Нет)";
    private final String question3 = "Ты идешь на риск, чтобы достичь своей цели? (Да/Нет)";
    private final String question4 = "Ты проявляешь заботу к существам и природе? (Да/Нет)";

    public void sort() {
        Scanner answerScanner = new Scanner(System.in);
        System.out.println(question1);
        String answer1 = getAnswerFromConsole(answerScanner);
        System.out.println(answer1);

        System.out.println(question2);
        String answer2 = getAnswerFromConsole(answerScanner);
        System.out.println(answer2);

        System.out.println(question3);
        String answer3 = getAnswerFromConsole(answerScanner);
        System.out.println(answer3);

        System.out.println(question4);
        String answer4 = getAnswerFromConsole(answerScanner);
        System.out.println(answer4);

        check(answer1, answer2, answer3, answer4);
    }

    private String check(String answer1, String answer2, String answer3, String answer4) {
        if (answer1.equals("да")) {
            if (answer3.equals("да")) {
                System.out.println("Гриффиндор");
            } else if (answer4.equals("да")) {
                System.out.println("Пуффендуй");
            } else if (answer2.equals("да")) {
                if (answer1.equals("да")) {
                    System.out.println("Когтевран");
                } else if (answer3.equals("да")) {
                    System.out.println("Когтевран");
                } else {
                    System.out.println("Слизерин");
                }
            } else {
                System.out.println("Слизерин");
            }
        } else {
            System.out.println("Пуффендуй");
        }
        return "";
    }

    private String getAnswerFromConsole(Scanner answerScanner) {
        return answerScanner.nextLine().toLowerCase();
    }
}
