//Задание 1. Создать класс Book с полями:
//уникальный номер ISBN
//название название
//автор
//год публикации yearOfPublishing
//жанр жанр
//В классе Book реализуйте конструктор,
// геттеры и сеттеры для всех полей и метод отображения,
// который отображает информацию о книге. Создайте конструктор,
// который не имеет поля ISBN. Создайте конструктор,
// который имеет только поля title, author и genre.

package homeWork;

public class InterestingBook {
    private long ISBN;
    private String name;
    private String author;
    private int yearOfPublishing;
    private String genre;

    public InterestingBook(long ISBN, String name, String author, int yearOfPublishing, String genre) {
        this.ISBN = ISBN;
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    //----------------------------------------------------------------
    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void display(){
        System.out.println("ISBN: " + ISBN + "Name: " + name + "Author: " + author + "Year of publishing: " + yearOfPublishing + "Genre" + genre);
    }
//-------------------------------------------------------------------

    public InterestingBook(String name, String author, int yearOfPublishing, String genre) {
        this.name = name;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }
//----------------------------------------------------------------


    public InterestingBook(String name, String author, String genre) {
        this.name = name;
        this.author = author;
        this.genre = genre;
    }
}
