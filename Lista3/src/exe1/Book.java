package exe1;

public class Book {
    private int id;
    private String  author, title;
    public Book(int id, String author, String title){
        this.setId(id);
        this.setAuthor(author);
        this.setTitle(title);
    }
    public String getAuthor(){
        return this.author;
    }
    public String getTitle(){
        return this.title;
    }
    public int getId(){
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
