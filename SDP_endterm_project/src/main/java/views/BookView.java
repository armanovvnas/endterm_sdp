package views;
import models.Book;

public class BookView {
    // Method to display a preview of the book to the user
    public void showBookPreview(Book book) {
        System.out.println("Preview of \"" + book.getTitle() + "\":");
        book.getPreview().forEach(System.out::println);
    }
    // Method to display an annotation of the book to the user
    public void showAnnotation(Book book) {
        System.out.println("Annotation of \"" + book.getTitle() + "\": " + book.getAnnotation());
    }
}
