// Abstract_inner





// Create an abstract class Book with the following properties:
// title (String): Title of the book.
// author (String): Author of the book.
// yearOfPublication (int): Year the book was published.
// Implement abstract methods display() and calculateLateFees(int daysLate).
// Create two subclasses of Book:
// Fiction: Represents fiction books. It should have an additional property genre (String).
// NonFiction: Represents non-fiction books. It should have an additional property topic (String).
abstract class Book {
    String title;
    String author;
    int yearOfPublication;

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    abstract void display();

    abstract double calculateLateFees(int daysLate);
}

class Fiction extends Book {
    String genre;

    public Fiction(String title, String author, int yearOfPublication, String genre) {
        super(title, author, yearOfPublication);
        this.genre = genre;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Genre: " + genre);
    }

    double calculateLateFees(int daysLate) {
        
        return daysLate * 0.50; 
    }
}

class NonFiction extends Book {
    String topic;

    
    public NonFiction(String title, String author, int yearOfPublication, String topic) {
        super(title, author, yearOfPublication);
        this.topic = topic;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year of Publication: " + yearOfPublication);
        System.out.println("Topic: " + topic);
    }

    double calculateLateFees(int daysLate) {
        return daysLate * 0.25; 
    }
}

class LPU {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 1925, "Classic");
        fictionBook.display();
        System.out.println("Late Fee for Fiction book: $" + fictionBook.calculateLateFees(5));

        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 2014, "History");
        nonFictionBook.display();
        System.out.println("Late Fee for NonFiction book: $" + nonFictionBook.calculateLateFees(3));
    }
}


