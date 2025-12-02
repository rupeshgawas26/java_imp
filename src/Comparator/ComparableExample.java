package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        List<Movie> movies= Arrays.asList(
                new Movie("The Shawshank Redemption",9.5,1990),
                new Movie("Godfather",9.2,1993),
                new Movie("Casablanca",9.1,1990));
        Collections.sort(movies);
        System.out.println("Movies sorted by rating(descending) by Comparable : ");
        for(Movie movie:movies)
            System.out.println(movie);
        System.out.println();
        System.out.println("=============================================");
        System.out.println();
        Collections.sort(movies,new RatingComparator());
        System.out.println("Movies sorted by rating(ascending) by Comparator: ");
        for(Movie movie:movies)
            System.out.println(movie);
    }
}
