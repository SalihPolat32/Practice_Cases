package com.salihpolat;

import java.util.List;

public abstract class Book {

    private String ISBN;
    private String title;
    private String author;
    private int year;
    private EStatus status;
    private List<Member> borrower;

    public Book(String ISBN, String title, String author, int year, EStatus status, List<Member> borrower) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
        this.status = status;
        this.borrower = borrower;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setBorrower(List<Member> borrower) {
        this.borrower = borrower;
    }

    public List<Member> getBorrower() {
        return borrower;
    }

    public abstract String getBookType();

    public void borrowBook(Member member) {
        this.borrower = (List<Member>) member;
        this.setStatus(EStatus.BORROWED);
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN='" + ISBN + '\'' +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                ", status='" + status +
                ", borrower=" + borrower +
                "}";
    }
}
