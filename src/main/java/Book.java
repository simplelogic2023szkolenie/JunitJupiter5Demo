import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Book {
    private String title;
    private int pages;
    private String author;
}
