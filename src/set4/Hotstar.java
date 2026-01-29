package set4;

class Hotstar {

    // Method to display platform name
    void displayPlatform() {
        System.out.println("Streaming Platform: Jio-set4.Hotstar");
    }
}

// Derived class
class Genre extends Hotstar {

    String genreName;
    String subscriptionType;

    // Constructor to initialize details
    Genre(String genreName, String subscriptionType) {
        this.genreName = genreName;
        this.subscriptionType = subscriptionType;
    }

    // Method to display genre details
    void displayGenreDetails() {
        System.out.println("set4.Genre: " + genreName);
        System.out.println("Subscription Type: " + subscriptionType);
    }
}

// Main class
class HotstarDemo {
    public static void main(String[] args) {

        // Creating object of derived class
        Genre g = new Genre("Sports", "Premium");

        // Accessing inherited method
        g.displayPlatform();

        // Accessing derived class method
        g.displayGenreDetails();
    }
}
