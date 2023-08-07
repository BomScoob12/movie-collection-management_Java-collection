package org.example;

import movies.Movie;
import movies.MovieCollections;

public class Main {
    public static void main(String[] args) {
//        testMovie();
        testMovieCollections();
    }
    private static void testMovie(){
        var mv1 = new Movie("KomFag", "BomScoob",2004, "Romance", 4.5);
        System.out.println(mv1.getRelease_year());
        System.out.println(mv1.getDirector());
        System.out.println(mv1);
    }
    private static void testMovieCollections(){
        var mv1 = new Movie("KomFag", "BomScoob",2004, "Romance", 4.5);
        var mv2 = new Movie("KomFag2", "BomScoob",2014, "Romance", 5.0);
        var mv3 = new Movie("KomFag3", "BomScoob",2024, "Romance", 4.5);
        var mvNull = new Movie("", "BomScoob",2024, "Romance", 4.5);
        var col1 = new MovieCollections();
        col1.addMovie(mv1);
        col1.addMovie(mv2,mv3);
        col1.addMovie(mvNull);
        System.out.println("--------------------");
        col1.viewMovies();
        System.out.println("---SearchTitle---");
        col1.searchByTitle("KomFag").forEach(System.out::println);
        System.out.println("---SearchDirector---");
        col1.searchByDirector("BomScoob").forEach(System.out::println);
        System.out.println("---SearchRelease---");
        col1.searchByReleaseYear(2024).forEach(System.out::println);
        System.out.println("---SearchGenre---");
        col1.searchByGenre("Romance").forEach(System.out::println);
        System.out.println("---SearchRating---");
        col1.searchByRating(5.0).forEach(System.out::println);
        System.out.println("--------------------");
        //next
        if (col1.iterator().hasNext()) System.out.println(col1.iterator().next());

    }
}