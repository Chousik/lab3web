package ru.chousik.lab3web.serviceBeans;

public interface ServiceInterface<T> {
    boolean valid(T t);
    boolean check(T t);
}
