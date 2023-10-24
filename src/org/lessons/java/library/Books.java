package org.lessons.java.library;

public class Books {
    // attributes
    private String title;
    private int pageNumbers;
    private String author;
    private String editor;


    // constructor

    public Books(String title, int pageNumbers, String author, String editor) throws IllegalArgumentException {
        if (title.isEmpty()){
            throw new IllegalArgumentException("no title inserted");
        } else if (pageNumbers == 0 || pageNumbers < 0) {
            throw new IllegalArgumentException("page number is invalid");
        } else if (author.isEmpty()) {
            throw new IllegalArgumentException("no author inserted");
        } else if (editor.isEmpty()) {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
}
