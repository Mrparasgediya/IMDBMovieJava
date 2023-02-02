package com.imdb;

import java.util.List;

public class Movie {
  private List<Director> directors;
  private List<Genre>  genres;
  private List<Actor> actors;
  private String name;
  private double rating;

  public Movie(List<Director> directors, List<Genre> genres, List<Actor> actors,
      String name, double rating) {
    this.directors = directors;
    this.genres = genres;
    this.actors = actors;
    this.name = name;
    this.rating = rating;
  }

  @Override
  public String toString() {
    return "Movie{" +
           "directors=" + directors +
           ", genres=" + genres +
           ", actors=" + actors +
           ", name='" + name + '\'' +
           ", rating=" + rating +
           '}';
  }
}
