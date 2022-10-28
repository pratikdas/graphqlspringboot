package io.pratik.graphqldemo.models;

public record Book(Integer id, String title, Integer pages, Rating rating, Author author) {

}
