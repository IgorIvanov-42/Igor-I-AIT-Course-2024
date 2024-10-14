package homeWork.documentArchive.documentModel;

import classWork.bookLibrary.model.Book;
import homeWork.documentArchive.archiveController.Archive;

import java.util.Objects;

public class Document {

    public static final int ISBN_LENGTH = 10;
    // field
    private long isbn;
    private String title;
    private String author;
    private int yearOfPublishing;

    public Document(long isbn, String title, String author, int yearOfPublishing) {
        this.isbn = checkIsbn(isbn);;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
    }

    private long checkIsbn(long isbn){
        //проверить длину isbn по количеству цифр в этом числе
        if (counDigit(isbn)){
            return isbn;
        }
        return -1;// сигнал того, что isbn не верный
    }

    private boolean counDigit(long isbn) {
        //String.valueOf(isbn).length() == 13;
        int count = 0;
        while (isbn / 10 != 0){
            count++;
        }
        return count == ISBN_LENGTH;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Archive archive)) return false;
        return isbn == archive.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Document{");
        sb.append("isbn=").append(isbn);
        sb.append(", title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
}// end of class
