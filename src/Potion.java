import java.util.Arrays;
import java.util.Scanner;

public class Potion {
    public boolean prepare() {
        Scanner scanner = new Scanner(System.in);
        String[] ingredients = {"Драконий коготь", "Лист мандрагоры", "Корень шершавой астрелии"};
        System.out.println("Добро пожаловать в лабораторию зелий!" + "\n" + "Введите ингредиенты, которые у вас есть (через запятую):");
        String input = scanner.nextLine();
        String[] userIngredients = input.split(", ");
        System.out.println(Arrays.toString(userIngredients));
        int count = 0;
        for (int i = 0; i < ingredients.length; i++) {
            for (int j = 0; j < userIngredients.length; j++) {
                if (ingredients[i].equals(userIngredients[j]))
                    count++;
            }
        }
        return ingredients.length == count;
    }
}
