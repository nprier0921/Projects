import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        ArrayList<Integer> ratings = new ArrayList<>();

        movies.add("Poetic Justice");
        movies.add("Love Jones");
        movies.add("Love and Basketball");
        movies.add("The Best Man");

        ratings.add(9);
        ratings.add(10);
        ratings.add(8);
        ratings.add(7);

        System.out.println("Original Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nOriginal Ratings:");
        for (int rating : ratings) {
            System.out.println(rating);
        }

        movies.remove("The Best Man");
        ratings.remove(3);
        
        movies.add(1, "The Photograph");
        ratings.add(0, 10);

        System.out.println("\nUpdated Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nUpdated Ratings:");
        for (int rating : ratings) {
            System.out.println(rating);
        }

        System.out.println("\nMovie list size: " + movies.size());
        System.out.println("Ratings list size: " + ratings.size());
    }
}