package movies;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieCollections implements Iterable<Movie> {
    private List<Movie> collectionOfMovie;
    private int modCount;

    public MovieCollections(){
        collectionOfMovie = new ArrayList<>();
    }

    public boolean addMovie(Movie movie){
        if (movie.getTitle()==null || movie.getTitle().isEmpty()) return false;
        collectionOfMovie.add(movie);
        modCount++;
        return true;
    }
    public boolean addMovie(Movie...movie){
        if (isNullTitle(movie)) return false;
        collectionOfMovie.addAll(Arrays.asList(movie));
        modCount += movie.length;
        return true;
    }
    private boolean isNullTitle(Movie[] movies){
        for (var moviesNull : movies){
            return moviesNull.getTitle()==null || moviesNull.getTitle().isEmpty();
        }
        return false;
    }

    public boolean removeMovie(Movie movie){
        collectionOfMovie.remove(movie);
        modCount--;
        return true;
    }

    public List<Movie> searchByTitle(String title){
        return collectionOfMovie.stream()
                .filter(t -> t.getTitle().equals(title))
                .collect(Collectors.toList());
    }
    public List<Movie> searchByDirector(String director){
        return collectionOfMovie.stream()
                .filter(t -> t.getDirector().equals(director))
                .collect(Collectors.toList());
    }
    public List<Movie> searchByGenre(String genre){
        return collectionOfMovie.stream()
                .filter(t -> t.getGenre().equals(genre))
                .collect(Collectors.toList());
    }
    public List<Movie> searchByReleaseYear(int year){
        return collectionOfMovie.stream()
                .filter(t -> t.getRelease_year() == year)
                .collect(Collectors.toList());
    }
    public List<Movie> searchByRating(double rating){
        return collectionOfMovie.stream()
                .filter(t -> t.getRating() == rating)
                .collect(Collectors.toList());
    }

    public void viewMovies(){
        collectionOfMovie.forEach(System.out::println);
    }

    @Override
    public Iterator<Movie> iterator() {
        return new Iterator<Movie>() {
            int count = 0;
            @Override
            public boolean hasNext() {
                return count != modCount;
            }

            @Override
            public Movie next() {
                return collectionOfMovie.get(count++);
            }
        };
    }
}
