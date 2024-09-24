package com.learning.designpatterns.behavioral.iterator.books.collection;

import com.learning.designpatterns.behavioral.iterator.books.item.Book;
import com.learning.designpatterns.behavioral.iterator.books.iterator.BookIterator;
import com.learning.designpatterns.behavioral.iterator.books.iterator.Iterator;

public class Library implements BookCollection {
    private final Book[] books;
    private int index = 0;

    public Library(int size) {
        books = new Book[size];
    }

    public void addBook(Book book) {
        if (index < books.length) {
            books[index] = book;
            index++;
        }
    }

    @Override
    public Iterator<Book> createIterator() {
        return new BookIterator(books);
    }
}
