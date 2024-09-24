package com.learning.designpatterns.behavioral.iterator.books.iterator;

import com.learning.designpatterns.behavioral.iterator.books.item.Book;

public class BookIterator implements Iterator<Book> {
    private final Book[] books;
    private int position = 0;

    public BookIterator(Book[] books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.length && books[position] != null;
    }

    @Override
    public Book next() {
        return books[position++];
    }
}
