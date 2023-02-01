package com.imdb;

public class Director {
  private String name;
  private int age;
  private int noOfMoviesCreated;
  private Gender gender;

  public Director(String name, int age, int noOfMoviesCreated, Gender gender) {
    this.name = name;
    this.age = age;
    this.noOfMoviesCreated = noOfMoviesCreated;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getNoOfMoviesCreated() {
    return noOfMoviesCreated;
  }

  public void setNoOfMoviesCreated(int noOfMoviesCreated) {
    this.noOfMoviesCreated = noOfMoviesCreated;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    return "Director{" +
           "name='" + name + '\'' +
           ", age=" + age +
           ", noOfMoviesCreated=" + noOfMoviesCreated +
           ", gender=" + gender +
           '}';
  }
}
