package com.gla.streamapi;

import java.util.*;
import java.util.stream.Collectors;
class Movie {
    String title;
    double rating;
    int year;
    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }
    @Override
    public String toString() {
        return title + " | Rating: " + rating + " | Year: " + year;
    }
}
public class TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
                new Movie("Movie A", 8.5, 2023),
                new Movie("Movie B", 9.0, 2024),
                new Movie("Movie C", 8.5, 2024),
                new Movie("Movie D", 7.8, 2022),
                new Movie("Movie E", 9.2, 2023),
                new Movie("Movie F", 8.9, 2021),
                new Movie("Movie G", 9.2, 2024)
        );
        List<Movie> topMovies = movies.stream().filter(m -> m.rating >= 8.0).sorted(Comparator.comparingDouble((Movie m) -> m.rating).reversed().thenComparing(m -> m.year, Comparator.reverseOrder())).limit(5).collect(Collectors.toList());
        topMovies.forEach(System.out::println);
    }
}