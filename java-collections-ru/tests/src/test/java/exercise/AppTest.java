package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {
    
    private static List<Integer> base = Arrays.asList(2,5,7,8,10);

    @Test
    void testTake() {
        List<Integer> actual = App.take(base, 2);
        List<Integer> expected = Arrays.asList(2,5);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testTakeMoreElementsThanContainsInList() {
        List<Integer> actual = App.take(base, 15);
        List<Integer> expected = Arrays.asList(2, 5, 7, 8, 10);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void testTakeZeroElements() {
        List<Integer> actual = App.take(base, 0);
        List<Integer> expected = Arrays.asList();
        assertThat(actual).isEqualTo(expected);
    }
}
