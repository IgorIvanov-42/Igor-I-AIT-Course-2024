package classWork.bookLibrary.controller;

import classWork.bookLibrary.model.Book;

public class Library {

    // fields
    private Book[] books;
    private int size; // текущее количество книг

    // constructor

    public Library(int capacity) {
        this.books = new  Book[capacity];
        this.size = 0;
    }

    // CRUD methods
    // boolean addBook(Book book)



    // void printBooks



    public Book findBook(long isbn){
        Book foundBook = null;
        return foundBook;
    }



    // Book removeBook(long isbn)
    // size--


    // boolean updateBook()


    public int size(){
        return size;
    }


}// end of class
