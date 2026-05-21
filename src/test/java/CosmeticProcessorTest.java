import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CosmeticProcessorTest {

    @Test
    void testSorting() {

        Cosmetic[] arr = new Cosmetic[] {
                new Cosmetic("A", "B", 20, 10, 3),
                new Cosmetic("C", "D", 10, 20, 5)
        };

        Arrays.sort(arr, (a, b) -> {
            if (Double.compare(a.getPrice(), b.getPrice()) == 0) {
                return Integer.compare(b.getRating(), a.getRating());
            }
            return Double.compare(a.getPrice(), b.getPrice());
        });

        assertEquals(10, arr[0].getPrice());
    }

    @Test
    void testFindObject() {

        Cosmetic target = new Cosmetic("A", "B", 20, 10, 3);

        Cosmetic[] arr = {
                target,
                new Cosmetic("C", "D", 10, 20, 5)
        };

        boolean found = false;

        for (Cosmetic c : arr) {
            if (c.equals(target)) {
                found = true;
                break;
            }
        }

        assertTrue(found);
    }
}
