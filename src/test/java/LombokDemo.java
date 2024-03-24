public class LombokDemo {
    public static void main(String[] args) {
        Book book  = new Book("Hp", 123, "JKR");

        System.out.println(book.getTitle());
        System.out.println(book.getPages());
    }
}
