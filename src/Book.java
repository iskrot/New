import java.util.Objects;

public class Book {
    private Author author;
    private String name;
    private int yearRelease;

    public Book(Author author, String name, int yearRelease) {
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

    @Override
    public String toString() {
        return "author: (" + author.toString() + ") name: " + name + " release: " + yearRelease;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearRelease == book.yearRelease && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, yearRelease);
    }
}
