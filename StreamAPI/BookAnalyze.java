import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Comparator;


class QStreamBookReview {

    private String bookId;
    private String rating;
    private String review;

    public QStreamBookReview(String bookId, String rating, String review) {
        this.bookId = bookId;
        this.rating = rating;
        this.review = review;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}

public class BookAnalyze {

    public static void main(String[] args) {
        List<QStreamBookReview> bookReviews = new ArrayList<>();
        bookReviews.add(new QStreamBookReview("B001", "5", "Excellent"));
        bookReviews.add(new QStreamBookReview("B002", "4", "Good"));
        bookReviews.add(new QStreamBookReview("B003", "3", "Average"));
        bookReviews.add(new QStreamBookReview("B004", "2", "Poor"));
        bookReviews.add(new QStreamBookReview("B005", "1", "Very Poor"));

        // Find the average rating of the books
        double averageRating = bookReviews.stream()
                .mapToInt(bookReview -> Integer.parseInt(bookReview.getRating()))
                .average()
                .getAsDouble();
        System.out.println("Average Rating: " + averageRating);

        // Find the number of books with rating greater than 3
        long count = bookReviews.stream()
                .filter(bookReview -> Integer.parseInt(bookReview.getRating()) > 3)
                .count();
        System.out.println("Number of books with rating greater than 3: " + count);

        // Find the book with the highest rating
        Optional<QStreamBookReview> bookReview = bookReviews.stream()
                .max(Comparator.comparingInt(book -> Integer.parseInt(book.getRating())));
        System.out.println("Book with the highest rating: " + bookReview.get().getBookId());

        // Find the book with the lowest rating
        bookReview = bookReviews.stream()
                .min(Comparator.comparingInt(book -> Integer.parseInt(book.getRating())));
        System.out.println("Book with the lowest rating: " + bookReview.get().getBookId());
    }
}