
public class Author {
    private String name;
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
    @Override
    public boolean equals(Object other) {
        if (this.getClass() == other.getClass()) {
            return false;
        }
        Author c2 = (Author) other;
        return name.equals(c2.name);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name);
    }
    @Override
    public String toString() {
        return this.name + " " + this.secondName;}
     Author a = new Author("Donna", "Tarrt");

}
