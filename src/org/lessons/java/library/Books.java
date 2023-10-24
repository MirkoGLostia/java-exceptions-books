package org.lessons.java.library;

public class Books {
    // attributes
    private String title;
    private int pageNumbers;
    private String author;
    private String editor;


    // constructor

    public Books(String title, int pageNumbers, String author, String editor) throws IllegalArgumentException {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("no title inserted");
        } else if (pageNumbers == 0 || pageNumbers < 0) {
            throw new IllegalArgumentException("page number is invalid");
        } else if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("no author inserted");
        } else if (editor == null || editor.isBlank()) {
            throw new IllegalArgumentException("no editor inserted");
        }
        this.title = title;
        this.pageNumbers = pageNumbers;
        this.author = author;
        this.editor = editor;
    }



    // getter

    public String getTitle() {
        return title;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public String getAuthor() {
        return author;
    }

    public String getEditor() {
        return editor;
    }


    // setter

    public void setTitle(String title) throws IllegalArgumentException {
        if (title == null || title.isBlank()){
            throw new IllegalArgumentException("no title inserted");
        }
        this.title = title;
    }

    public void setPageNumbers(int pageNumbers) throws IllegalArgumentException {
        if (pageNumbers == 0 || pageNumbers < 0){
            throw new IllegalArgumentException("page number is invalid");
        }
        this.pageNumbers = pageNumbers;
    }

    public void setAuthor(String author) throws IllegalArgumentException {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("no author inserted");
        }
        this.author = author;
    }

    public void setEditor(String editor) throws IllegalArgumentException {
        if (editor == null || editor.isBlank()) {
            throw new IllegalArgumentException("no editor inserted");
        }
        this.editor = editor;
    }



    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", pageNumbers=" + pageNumbers +
                ", author='" + author + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
