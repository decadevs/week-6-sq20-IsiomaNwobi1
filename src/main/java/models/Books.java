package models;

public class Books {
    private String title;
    private String author;
    private int copiesAvailable;

    public Books(String title, String author, int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.copiesAvailable = copiesAvailable;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getCopiesAvailable() {
        return copiesAvailable;
    }

    public void decreaseCopy(){
        if(copiesAvailable>0);
        copiesAvailable--;
    }
}
