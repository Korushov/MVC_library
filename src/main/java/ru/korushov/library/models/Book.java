package ru.korushov.library.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {

    private int id;

    @NotEmpty(message = "Название книги не может быть пустым")
    @Size(min = 2, message = "Название книги слишком короткое")
    @Size(max = 40, message = "Название книги слишком длинное")
    private String name;

    @NotEmpty(message = "У книги должен быть автор")
    @Size(min = 2, message = "Имя автора слишком короткое")
    @Size(max = 40, message = "Имя автора слишком длинное")
    private String author;

    @Min(value = 0, message = "Год выхода должен быть валидным")
    @Max(value = 2022, message = "Год выхода должен быть валидным")
    private int year;

    public Book(int id, String name, String author, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
