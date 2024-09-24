package com.learning.designpatterns.behavioral.iterator.books.client;

import com.learning.designpatterns.behavioral.iterator.books.collection.Library;
import com.learning.designpatterns.behavioral.iterator.books.item.Book;
import com.learning.designpatterns.behavioral.iterator.books.iterator.Iterator;

public class IteratorPatternDemo {
    public static void main(String[] args) {
        Library library = new Library(5);
        library.addBook(new Book("Design Patterns", "Gamma et al."));
        library.addBook(new Book("Effective Java", "Joshua Bloch"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        Iterator<Book> bookIterator = library.createIterator();

        while (bookIterator.hasNext()) {
            Book book = bookIterator.next();
            System.out.println("Book: " + book.title() + " by " + book.author());
        }
    }
}
