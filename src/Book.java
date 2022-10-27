public class Book {
    private final String title;
    private final Author author;
    private int year;


    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {

        return this.title;
    }

    public Author getAuthor() {

        return author;
    }


    public int getYear() {

        return year;
    }

    public void setYear(int year) {

        this.year = year;
    }


    public boolean equals(Object other) {
        if (this.getClass() == other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return title.equals(c2.title);
    }

    public int hashCode() {
        return java.util.Objects.hash(title);
    }

    public String toString() {
        return "Название книги: " + this.title + " Автор: " + this.author + " Год издания: " + this.year;

    }
}

