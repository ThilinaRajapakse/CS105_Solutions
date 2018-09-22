package pdn.scs.lab2_classes_and_objects.individual_assignment;

public class Book
{
    String name;
    String author;
    String genre;
    double rating;
    static double averageRating;
    
    public static void main(String[] args)
    {
        // Create a Book object and assign a reference to the object to book1 variable. Assign relevant data.
        Book book1 = new Book();
        book1.name = "Harry Potter and The Deathly Hallows";
        book1.author = "J.K. Rowling";
        book1.genre = "Fantasy";
        book1.rating = 4.62;

        // Create a Book object and assign a reference to the object to book2 variable. Assign relevant data.
        Book book2 = new Book();
        book2.name = "The Help";
        book2.author = "Kathryn Stockett";
        book2.genre = "Fiction";
        book2.rating = 4.46;

        // Create a Book object and assign a reference to the object to book3 variable. Assign relevant data.
        Book book3 = new Book();
        book3.name = "A Game of Thrones";
        book3.author = "George R.R. Martin";
        book3.genre = "Fantasy";
        book3.rating = 4.45;

        System.out.println("Name:" + book1.name + "\tAuthor: " + book1.author + "\tGenre: " + book1.genre + "\tRating: " + book1.rating);
        System.out.println("Name:" + book2.name + "\tAuthor: " + book2.author + "\tGenre: " + book2.genre + "\tRating: " + book2.rating);
        System.out.println("Name:" + book3.name + "\tAuthor: " + book3.author + "\tGenre: " + book3.genre + "\tRating: " + book3.rating);
        System.out.println("Average Rating: " + Book.averageRating);

        Book.averageRating = (book1.rating + book2.rating + book3.rating) / 3;
        System.out.println("Average rating: " + Book.averageRating);

        Book book4 = book3;  // Copy the reference contained in book3 variable to book4. Both variables now
                                //  point to the same object in memory.

        book4.name = "The Way of Kings";
        book4.author = "Brandon Sanderson";
        book4.genre = "Fantasy";
        book4.rating = 4.64;

        System.out.println("Name:" + book3.name + "\tAuthor: " + book3.author + "\tGenre: " + book3.genre + "\tRating: " + book3.rating);
    }
}
