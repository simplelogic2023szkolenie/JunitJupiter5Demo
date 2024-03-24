public class BuilderLombokDemo {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Mat")
                .lastName("Tad")
                .isMarried(true)
                .age(33)
                .build();

        System.out.println(person);

        Person person2 = Person.builder()
                .firstName("Mat")
                .build();

        System.out.println(person2);

    }
}
