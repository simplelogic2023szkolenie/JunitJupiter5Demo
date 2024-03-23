import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;


public class HamcrestDemo {

    @ValueSource(ints = {10, 11})
    @ParameterizedTest()
    public void checkNumber(int i){
        assertThat(i, is(equalTo(10)));
    }
}
