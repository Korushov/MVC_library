package ru.korushov.library.models;

import javax.validation.constraints.*;

public class Person {

    private int id;

    @NotEmpty(message = "Имя не может быть пустым")
    @Size(min = 2, max = 30, message = "Длина имени должна быть от 2 до 40 символов")
    private String fullName;

    @Min(value = 1900, message = "Год рождения должен быть больше 1900")
    @PositiveOrZero(message = "Год рождения должен быть валидным")
    private int birthYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(int id, String fullName, int birthYear) {
        this.id= id;
        this.fullName = fullName;
        this.birthYear = birthYear;
    }

    public Person() {
    }
}
