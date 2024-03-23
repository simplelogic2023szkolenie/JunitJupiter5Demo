import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class ParametersDemo {

    @ParameterizedTest
    @ValueSource(ints = {1, 4, 6, 2})
    public void someTestWithIntValues(int number) {
        Assertions.assertEquals(4, number);
    }

    @ParameterizedTest
    @ValueSource(strings = {"anna", "sophia", "susan"})
    public void someTestWithStringValues(String name) {
        Assertions.assertEquals("sophia", name);
    }

    @ParameterizedTest
    @EnumSource(Day.class)
    public void someTestWithEnumValues(Day day) {
        System.out.println(day);
    }

    @ParameterizedTest
    @CsvSource({
            "Poland,Poland",
            "Spain,Spain",
            "Spain,Portugal"
    })
    public void compareTextx(String text1, String text2) {
        assertThat(text1, is(equalTo(text2)));
    }

    @ParameterizedTest
    @CsvSource({
            "123,123",
            "12,1234",
            "123,Portugal"
    })
    public void compareTextx(int number1, int number2) {
        assertThat(number1, is(equalTo(number2)));
    }




    @ParameterizedTest
    @CsvSource({
            "apple, 1, Poland",
            "banana, 4,Spain",
            "lime, 10,Portugal"
    })
    public void someTestWithCsvSource(String fruit, int quantity, String sourceCountry) {
        System.out.println(fruit + " " + quantity + " " + sourceCountry);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/fruits.csv")
    public void someTestWithCsvFileSource(String fruit, int quantity) {
        System.out.println(fruit + " " + quantity);
    }

    //numLinesToSkip -> ile pocz. lini z pliku csv ma byc pomięte
    // do uzycia jak csv zawiera naglowki kolumn
    @ParameterizedTest
    @CsvFileSource(resources = "/fruits_with_header.csv", numLinesToSkip = 1)
    public void someTestWithCsvFileSourceWithHeader(String fruit, int quantity) {
        System.out.println(fruit + " " + quantity);
    }



    @Tag("regression")
    @Test
    public void someTest(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTestClass());
        System.out.println(testInfo.getTestMethod());
        System.out.println(testInfo.getTags());
    }
}
