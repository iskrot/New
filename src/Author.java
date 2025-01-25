import java.util.Objects;

public class Author {
    private String name;
    private String surName;

    public Author(String Name, String SurName) {
        this.name = Name;
        this.surName = SurName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    @Override
    public String toString() {
        return "name: " + name + " surName: " + surName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surName, author.surName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surName);
    }
}
