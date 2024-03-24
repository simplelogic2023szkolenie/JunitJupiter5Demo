import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

import java.util.PrimitiveIterator;

@Data
@AllArgsConstructor
public class Song {
    private String title;
    private String author;
    private String format;
}
