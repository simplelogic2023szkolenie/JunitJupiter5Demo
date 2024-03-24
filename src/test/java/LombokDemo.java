public class LombokDemo {
    /*
Aktywacja Lomboka w IntelliJ, jeżeli nie działa po dodadniu dependecy oraz wtyczki:
Otwórz File > Settings > Build, Execution, Deployment > Compiler > Annotation Processors.
Zaznacz opcję Enable annotation processing dla swojego projektu.

     */

    public static void main(String[] args) {
        Book book  = new Book("Hp", 123, "JKR");

        System.out.println(book.getTitle());
        System.out.println(book.getPages());
    }
}


