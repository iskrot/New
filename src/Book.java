public class Book {
    private Author author;
    private String name;
    private int yearRelease;

    public Book(Author author, String name, int yearRelease){
        this.author = author;
        this.name = name;
        this.yearRelease = yearRelease;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }
}
