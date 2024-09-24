package com.learning.designpatterns.behavioral.iterator.books.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T next();
}
