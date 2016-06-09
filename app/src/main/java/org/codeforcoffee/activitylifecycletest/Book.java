package org.codeforcoffee.activitylifecycletest;

/**
 * Created by codeforcoffee on 6/9/16.
 */
public class Book {

    private String mTitle;
    private String mAuthor;
    private String mPublisher;
    private int mPageCount;
    private String mISBN;

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public int getPageCount() {
        return mPageCount;
    }

    public void setISBN(String ISBN) {
        mISBN = ISBN;
    }

    public Book(String title,
                String author,
                String publisher,
                int pageCount,
                String isbn) {

        // code is ran
        mTitle = title;
        mAuthor = author;
        mPublisher = publisher;
        mPageCount = pageCount;
        mISBN = isbn;

    }

}
