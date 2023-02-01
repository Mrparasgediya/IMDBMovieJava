package com.imdb;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Actor actor1 = new Actor("Visrut", 21, Gender.MALE);
        Actor actor2 = new Actor("Paras", 22, Gender.MALE);

        Director director1 = new Director("Ajinkya", 24, 200,Gender.MALE);
        Director director2 = new Director("Aditya", 25, 100,Gender.MALE);

        Genre action = new Genre("Action");

        ArrayList<Director> gundayDirectors = new ArrayList<Director>(List.of(director1,director2));
        ArrayList<Actor> gundayActors = new ArrayList<Actor>(List.of(actor1,actor2));

        Movie movie1 = new Movie(gundayDirectors,new ArrayList<Genre>(List.of(action)), gundayActors, "Gunday",9.8);

        System.out.println(movie1);
    }
}
