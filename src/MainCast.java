import java.util.Random;

public class MainCast {
    public static void main(String[] args) {
				castSpell();
    }

    public static void castSpell() {
        String cast = "ARDENTIS VERUM LUMINOS ET FULGUR SYLVESTRA ELIXIA";
        cast = cast.toLowerCase();
        int start = new Random().nextInt(0,51);
        String result = cast.substring(start);
        StringBuilder spell = new StringBuilder(result).reverse();
        char N1 = result.charAt(0);
        char N2 = result.charAt(1);
        spell.replace(0, 1, String.valueOf(N2));
        spell.replace(1, 2, String.valueOf(N1));
        System.out.println(spell);
    }
}