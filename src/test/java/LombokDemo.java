public class LombokDemo {
    /*
Aktywacja Lomboka w IntelliJ, jeżeli nie działa po dodadniu dependecy oraz wtyczki:
Otwórz File > Settings > Build, Execution, Deployment > Compiler > Annotation Processors.
Zaznacz opcję Enable annotation processing dla swojego projektu.

     */

    public static void main(String[] args) {
        Book book1 = new Book("Hp", 123, "JKR");
        Book book2 = new Book("Hp", 123, "JKR");

        System.out.println(book1.getTitle());
        System.out.println(book1.getPages());



        Song song1 = new Song("some title", "some author", "mp3");
        Song song2 = new Song("some title", "some author", "mp3");

        // tutaj jest false bo equals porownuje dwa obiekty ktore sa w roznbych miejscach w pamięci
        System.out.println(book1.equals(book2));
        System.out.println(book2);

        // tutaj będzie inaczej - true. bo klasa Song ma adnotacje lomboka @Data
        // która robi override na euquals() oraz hashCode() co powoduje, że obiekty
        // tej klasy będą porownywane pole po polu
        System.out.println(song1.equals(song2));

        System.out.println(song2);
    }
}


