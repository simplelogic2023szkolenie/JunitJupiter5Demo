import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class HamcrestZadanie {
/*
1. Dla kolekcji:
- Napisz test sprawdzający, czy lista liczb całkowitych (stwórz wcześniej tą listę i przypisz do niej wartości) zawiera liczbę 5.

2. Dla ciągów znaków:
- Napisz test weryfikujący, czy utworzona przez Ciebie zmienna typu String zawiera tekst "test".

3. Logiczne + Liczbowe:
- Napisz test sparamteryzowany (10 róznych liczb całkowitych), który sprawdzi, przekazany paramter jest większy niż 0 i jednocześnie mniejszy niż 10.

4. Dla obiektów:
- Napisz test, który sprawdzi, czy obiekt klasy User (swórz prostą klasę User i stwórz jej obiekt) nie jest nullem.

5. Dla map:
- Napisz test, który sprawdzi, czy mapa 'capitals' (uzupełnij ją wcześniej danymi kraj-stolica) zawiera klucz 'Poland' z wartością 'Warsaw'.

 */

    @Test
    public void testListContainsNumber() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        assertThat(numbers, hasItem(1));
    }

    @Test
    public void testStringContainsSubstring() {
        String sampleText = "This is a test string";
        assertThat(sampleText, containsString("test"));
    }


    @ValueSource(ints = {3, 23, 4, 6, 8, 7, 234, 123, 567, 86})
    @ParameterizedTest
    public void testNumberInRange(int inputNumber) {
        assertThat(inputNumber, allOf(greaterThan(0), lessThan(10)));
    }

    @Test
    public void testObjectNotNull() {
        User user = new User("John Doe");
        assertThat(user, notNullValue());
    }

    @Test
    public void testMapContainsEntry() {
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("Poland", "Warsaw");
        capitals.put("Germany", "Berlin");
        assertThat(capitals, hasEntry("Poland", "Warsaw"));
    }
}


/**
 * 1. Matcherzy porównujące:
 * - equalTo(value): sprawdza, czy obiekt jest równy określonej wartości.
 * - is(value): alias dla equalTo(value), zwiększa czytelność.
 * - not(value): sprawdza, czy obiekt nie jest równy określonej wartości.
 * <p>
 * 2. Matcherzy dla kolekcji:
 * - hasItem(item): sprawdza, czy kolekcja zawiera określony element.
 * - hasItems(item1, item2, ...): sprawdza, czy kolekcja zawiera wszystkie podane elementy.
 * - empty(): sprawdza, czy kolekcja jest pusta.
 * - hasSize(size): sprawdza, czy kolekcja ma określony rozmiar.
 * <p>
 * 3. Matcherzy dla ciągów znaków:
 * - containsString(substring): sprawdza, czy ciąg znaków zawiera określony podciąg.
 * - startsWith(prefix): sprawdza, czy ciąg znaków zaczyna się od określonego prefiksu.
 * - endsWith(suffix): sprawdza, czy ciąg znaków kończy się na określonym sufiksie.
 * <p>
 * 4. Matcherzy liczbowe:
 * - closeTo(value, delta): sprawdza, czy liczba zmiennoprzecinkowa jest bliska określonej wartości, z danym marginesem błędu.
 * - greaterThan(value): sprawdza, czy liczba jest większa niż określona wartość.
 * - lessThan(value): sprawdza, czy liczba jest mniejsza niż określona wartość.
 * - greaterThanOrEqualTo(value): sprawdza, czy liczba jest większa lub równa określonej wartości.
 * - lessThanOrEqualTo(value): sprawdza, czy liczba jest mniejsza lub równa określonej wartości.
 * <p>
 * 5. Matcherzy logiczne:
 * - allOf(matcher1, matcher2, ...): sprawdza, czy wszystkie podane matcherzy zwracają true.
 * - anyOf(matcher1, matcher2, ...): sprawdza, czy którykolwiek z podanych matcherów zwraca true.
 * - not(matcher): neguje wynik podanego matchera.
 * <p>
 * 6. Matcherzy dla obiektów:
 * - instanceOf(class): sprawdza, czy obiekt jest instancją określonej klasy.
 * - nullValue(): sprawdza, czy obiekt jest null.
 * - notNullValue(): sprawdza, czy obiekt nie jest null.
 * <p>
 * 7. Matcherzy dla map:
 * - hasKey(key): sprawdza, czy mapa zawiera określony klucz.
 * - hasValue(value): sprawdza, czy mapa zawiera określoną wartość.
 * - hasEntry(key, value): sprawdza, czy mapa zawiera wpis z określonym kluczem i wartością.
 */