package ru.korushov.library.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Book {

    private int id;

    @NotEmpty(message = "Book should have name")
    @Size(min = 2, message = "Name of book too small")
    @Size(max = 40, message = "Name of book too large")
    private String name;

    @NotEmpty(message = "Book should have author")
    @Size(min = 2, message = "Name of author too small")
    @Size(min = 40, message = "Name of author too small")
    private String author;

    @Min(value = 0, message = "Year should be greater than 0")
    @Max(value = 2022, message = "Year of birth should be real")
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
