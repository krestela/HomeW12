public class Main {
    public static void main(String[] args) {
        Author author = new Author("Donna", "Tartt");
        Book book = new Book("The Goldfinch", author, 2015);
        System.out.println(book);

        Author author1 = new Author("Lucinda", "Riley");
        Book book1 = new Book("The Seven Sisters", author1, 2019);
        System.out.println(book1);
    }
}
