import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;


public class HamcrestDemo {

    @ValueSource(ints = {10, 11})
    @ParameterizedTest()
    public void checkNumber(int i) {
        assertThat(i, is(equalTo(10)));
    }

    @Test
    public void checkList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(124);
        numbers.add(123);


        assertThat(numbers, hasItem(1));
        assertThat(numbers, hasItem(2));
    }

    @Test
    public void helloTest() {
        String someText = "Hello!!!";

        assertThat(someText, containsString("!!"));
        assertThat(someText, startsWith("Goodby"));
    }

    @ValueSource(ints = {1, 10, 11})
    @ParameterizedTest()
    public void checkNumbers(int i) {
        assertThat(i, greaterThanOrEqualTo(10));
    }

    @Test
    public void testWithOrWithoudNull() {
        String someText = "text";

        assertThat(someText, notNullValue());
    }

    @Test
    public void testMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("qwe", 123);
        map.put("asd", 234);

        assertThat(map, hasKey("qwe"));


    }

    @Test
    public void testMapv2() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("qwe", 123);
        map.put("asd", 234);

        assertThat(map, allOf(hasKey("qwe"), hasKey("asd"), hasKey("sdf")));
    }
}
