package com.learning.designpatterns.behavioral.iterator.books.collection;

import com.learning.designpatterns.behavioral.iterator.books.item.Book;
import com.learning.designpatterns.behavioral.iterator.books.iterator.Iterator;

public interface BookCollection {
    Iterator<Book> createIterator();
}
