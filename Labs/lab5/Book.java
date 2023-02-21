public class Book {

    private String author;
    private String title;
    private int year;

    public Book (String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public boolean equals(Object other) {
        if( other == null || getClass() != other.getClass()){
            return false;
        }

        Book other2 =  (Book) other;
        if(year != other2.year) { 
            return false; 
        }

        if(title == null) { 
            if(other2.title != null) { 
                return false;
            }
        }
        if(!title.equals(other2.title)) { 
            return false;
        }
        if(author == null) { 
            if(other2.author != null) { 
                return false;
            }
        }
        if(!author.equals(other2.author)) { 
            return false;
        }

        return true;
    }

    public String toString() {
        return author + ":" + title + "(" + Integer.toString(year) + ")";
    }
}