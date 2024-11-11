package ru.chousik.lab3web.sevices;

public interface ServiceInterface<T> {
    boolean valid(T t);
    void check(T t);
}
