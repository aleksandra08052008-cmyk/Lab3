import java.util.Arrays;

/**
 * Виконавчий клас
 */
public class CosmeticProcessor {

    public static void main(String[] args) {

        Cosmetic[] cosmetics = new Cosmetic[] {
                new Cosmetic("Lipstick", "Dior", 30.5, 5, 5),
                new Cosmetic("Cream", "Nivea", 10.0, 200, 4),
                new Cosmetic("Perfume", "Chanel", 120.0, 50, 5),
                new Cosmetic("Mask", "L'Oreal", 15.0, 100, 3)
        };

        // Сортування:
        // price ↑, rating ↓
        Arrays.sort(cosmetics, (a, b) -> {
            if (Double.compare(a.getPrice(), b.getPrice()) == 0) {
                return Integer.compare(b.getRating(), a.getRating());
            }
            return Double.compare(a.getPrice(), b.getPrice());
        });

        System.out.println("Sorted array:");
        for (Cosmetic c : cosmetics) {
            System.out.println(c);
        }

        // Пошук ідентичного об'єкта
        Cosmetic target = new Cosmetic("Cream", "Nivea", 10.0, 200, 4);

        boolean found = false;
        for (Cosmetic c : cosmetics) {
            if (c.equals(target)) {
                found = true;
                break;
            }
        }

        System.out.println("\nObject found: " + found);
    }
}
