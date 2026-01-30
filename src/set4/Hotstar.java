package set4;

class Hotstar {


    void displayPlatform() {
        System.out.println("Streaming Platform: Jio-set4.Hotstar");
    }
}


class Genre extends Hotstar {

    String genreName;
    String subscriptionType;


    Genre(String genreName, String subscriptionType) {
        this.genreName = genreName;
        this.subscriptionType = subscriptionType;
    }


    void displayGenreDetails() {
        System.out.println("set4.Genre: " + genreName);
        System.out.println("Subscription Type: " + subscriptionType);
    }
}

class HotstarDemo {
    public static void main(String[] args) {


        Genre g = new Genre("Sports", "Premium");


        g.displayPlatform();


        g.displayGenreDetails();
    }
}
