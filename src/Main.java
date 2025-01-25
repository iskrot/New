public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Alexander","Pushkin");
        Book theCaptainsDaughter = new Book(pushkin, "The Captains Daughter", 1836);

        Author tolstoy = new Author("Leo", "Tolstoy");
        Book childhood = new Book(tolstoy,"Childhood", 1851);

        childhood.setYearRelease(1852);

    }
}