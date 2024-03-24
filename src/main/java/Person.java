import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Person {
    private String firstName;
    private String secondName;
    private String lastName;
    private String address;
    private int age;
    private int phoneNumber;
    private boolean isMarried;

}
