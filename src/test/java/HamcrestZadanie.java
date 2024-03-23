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








}


/**
 *
 * 1. Matcherzy porównujące:
 * - equalTo(value): sprawdza, czy obiekt jest równy określonej wartości.
 * - is(value): alias dla equalTo(value), zwiększa czytelność.
 * - not(value): sprawdza, czy obiekt nie jest równy określonej wartości.
 *
 * 2. Matcherzy dla kolekcji:
 * - hasItem(item): sprawdza, czy kolekcja zawiera określony element.
 * - hasItems(item1, item2, ...): sprawdza, czy kolekcja zawiera wszystkie podane elementy.
 * - empty(): sprawdza, czy kolekcja jest pusta.
 * - hasSize(size): sprawdza, czy kolekcja ma określony rozmiar.
 *
 * 3. Matcherzy dla ciągów znaków:
 * - containsString(substring): sprawdza, czy ciąg znaków zawiera określony podciąg.
 * - startsWith(prefix): sprawdza, czy ciąg znaków zaczyna się od określonego prefiksu.
 * - endsWith(suffix): sprawdza, czy ciąg znaków kończy się na określonym sufiksie.
 *
 * 4. Matcherzy liczbowe:
 * - closeTo(value, delta): sprawdza, czy liczba zmiennoprzecinkowa jest bliska określonej wartości, z danym marginesem błędu.
 * - greaterThan(value): sprawdza, czy liczba jest większa niż określona wartość.
 * - lessThan(value): sprawdza, czy liczba jest mniejsza niż określona wartość.
 * - greaterThanOrEqualTo(value): sprawdza, czy liczba jest większa lub równa określonej wartości.
 * - lessThanOrEqualTo(value): sprawdza, czy liczba jest mniejsza lub równa określonej wartości.
 *
 * 5. Matcherzy logiczne:
 * - allOf(matcher1, matcher2, ...): sprawdza, czy wszystkie podane matcherzy zwracają true.
 * - anyOf(matcher1, matcher2, ...): sprawdza, czy którykolwiek z podanych matcherów zwraca true.
 * - not(matcher): neguje wynik podanego matchera.
 *
 * 6. Matcherzy dla obiektów:
 * - instanceOf(class): sprawdza, czy obiekt jest instancją określonej klasy.
 * - nullValue(): sprawdza, czy obiekt jest null.
 * - notNullValue(): sprawdza, czy obiekt nie jest null.
 *
 * 7. Matcherzy dla map:
 * - hasKey(key): sprawdza, czy mapa zawiera określony klucz.
 * - hasValue(value): sprawdza, czy mapa zawiera określoną wartość.
 * - hasEntry(key, value): sprawdza, czy mapa zawiera wpis z określonym kluczem i wartością.
 *
 *
 */