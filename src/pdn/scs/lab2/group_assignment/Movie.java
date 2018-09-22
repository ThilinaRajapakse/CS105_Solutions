package pdn.scs.group_assignment;

import com.sun.org.apache.xpath.internal.SourceTree;import pdn.scs.lab2.Book;

public class Movie
{
    String name;
    int releaseYear;
    double rating;
    static double averageRating;

    public static void main(String[] args)
    {
        // Create a Movie object and assign a reference to the object to movie1 variable. Assign relevant data.
	    Book.Movie movie1 = new Book.Movie();
	    movie1.name = "The Shawshank Redemption";
	    movie1.releaseYear = 1994;
	    movie1.rating = 9.3;

        // Create a Movie object and assign a reference to the object to movie2 variable. Assign relevant data.
	    Book.Movie movie2 = new Book.Movie();
	    movie2.name = "The Godfather";
	    movie2.releaseYear = 1972;
	    movie2.rating = 9.2;

        // Create a Movie object and assign a reference to the object to movie3 variable. Assign relevant data.
	    Book.Movie movie3 = new Book.Movie();
	    movie3.name = "The Dark Knight";
	    movie3.releaseYear = 2008;
	    movie3.rating = 9.0;

        System.out.println("Name:" + movie1.name + "\tYear of Release: " + movie1.releaseYear + "\tRating: " + movie1.rating);
        System.out.println("Name:" + movie2.name + "\tYear of Release: " + movie2.releaseYear + "\tRating: " + movie2.rating);
        System.out.println("Name:" + movie3.name + "\tYear of Release: " + movie3.releaseYear + "\tRating: " + movie3.rating);
        System.out.println("Average Rating: " + Book.Movie.averageRating);

        Book.Movie.averageRating = (movie1.rating + movie2.rating + movie3.rating) / 3;
        System.out.println("Average rating: " + Book.Movie.averageRating);

        Book.Movie movie4 = movie1;  // Copy the reference contained in movie1 variable to movie4. Both variables now
                                //  point to the same object in memory.
        movie4.name = "The Return of the King";
        movie4.releaseYear = 2003;
        movie4.rating = 8.9;

        System.out.println("Name:" + movie1.name + "\tYear of Release: " + movie1.releaseYear + "\tRating: " + movie1.rating);
        // Since both movie1 and movie4 refer to the same object in memory, any changes made using one reference will be
        // reflected in the other.
    }
}
