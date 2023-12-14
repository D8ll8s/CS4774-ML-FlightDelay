public class Book {

    private String title;
    private String author;
    private int yearPublished;
    private double rating;
    private String ID;

    public Book(String title, String author, int yearPublished){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String getTitle(){
        return this.title;
    }

    public String getAuthor(){
        return this.title;
    }

    public int getYearPublished(){
        return this.yearPublished;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(double rating){
        return this.rating;
    }

    public void setID(String ID){
        this.ID = ID;

    }

    public String getID(){
        return this.ID;

    }

}
