package com.gla.collections;

import java.util.*;

class Movie {
    String title;
    String genre;
    Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }
    @Override
    public String toString() {
        return title + " (" + genre + ")";
    }
}
public class OnlineStreamingWatchHistory {
    public static void main(String[] args) {
        Stack<Movie> watchHistory = new Stack<>();
        List<Movie> allMovies = new ArrayList<>();
        Set<String> genresWatched = new HashSet<>();
        Queue<Movie> upNext = new LinkedList<>();
        allMovies.add(new Movie("Inception", "Sci-Fi"));
        allMovies.add(new Movie("Titanic", "Romance"));
        allMovies.add(new Movie("Avengers", "Action"));
        allMovies.add(new Movie("Interstellar", "Sci-Fi"));
        allMovies.add(new Movie("Notebook", "Romance"));
        upNext.add(allMovies.get(0));
        upNext.add(allMovies.get(2));
        upNext.add(allMovies.get(1));
        System.out.println("Watching Movies:");
        while (!upNext.isEmpty()) {
            Movie current = upNext.poll();
            System.out.println("Watching: " + current);
            watchHistory.push(current);
            genresWatched.add(current.genre);
        }
        System.out.println("\n Recommended Movies:");
        for (Movie m : allMovies) {
            if (genresWatched.contains(m.genre) && !watchHistory.contains(m)) {
                System.out.println(m);
            }
        }
        System.out.println("\n Watch History:");
        while (!watchHistory.isEmpty()) {
            System.out.println(watchHistory.pop());
        }
    }
}
