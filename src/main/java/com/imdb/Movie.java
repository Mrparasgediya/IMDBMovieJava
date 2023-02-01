package com.imdb;

import java.util.ArrayList;

public class Movie {
  private ArrayList<Director> directors;
  private ArrayList<Genre>  genres;
  private ArrayList<Actor> actors;
  private String name;
  private double rating;

  public Movie(ArrayList<Director> directors, ArrayList<Genre> genres, ArrayList<Actor> actors,
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
