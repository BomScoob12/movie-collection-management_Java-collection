package movies;

public class Movie {
    private String title;
    private String director;
    private int release_year;
    private String genre;
    private double rating;

    public Movie(String title, String director, int release_year, String genre, double rating){
        this.title = title;
        this.director = director;
        this.release_year = release_year;
        this.genre = genre;
        this. rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRelease_year() {
        return release_year;
    }

    public void setRelease_year(int release_year) {
        this.release_year = release_year;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", release_year=" + release_year +
                ", Genre="+ genre +
                ", rating=" + rating +
                '}';
    }
}
