
public class Author {
    private final String name;
    private String secondName;

    public Author(String name, String secondName) {
        this.name = name;
        this.secondName = secondName;

    }

    public String getSecondName() {

        return secondName;
    }

    public String getName() {

        return name;
    }

    public boolean equals(Object other) {
        if (this.getClass() == other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return name.equals(c2.name);
    }

    public int hashCode() {
        return java.util.Objects.hash(name);
    }

    public String toString() {
        return this.name + " " + this.secondName;
    }
}
