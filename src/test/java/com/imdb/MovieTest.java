package com.imdb;

import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class MovieTest {

    Movie movie1;

    @BeforeEach
    void setUp() {
        Director director1 = new Director("paras", 20, 20, Gender.MALE);
        Genre genre1 = new Genre("crime");
        Actor actor1 = new Actor("visrut", 20, Gender.MALE);
        this.movie1 = new Movie(List.of(director1), List.of(genre1), List.of(actor1), "2 Guns", 9.9);
    }

    @Test
    void test_movie_name_inflicted() {
        Assertions.assertThat(this.movie1).isInstanceOf(Movie.class);
    }
}