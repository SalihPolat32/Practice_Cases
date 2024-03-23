package com.salihpolat;

import java.util.List;

public class Member implements IMember{

    private String fullName;
    private List<Book> borrowedBooks;

    public Member(String fullName, List<Book> borrowedBooks) {
        this.fullName = fullName;
        this.borrowedBooks = borrowedBooks;
    }

    public Member(String fullName) {
        this.fullName = fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setBorrowedBooks(List<Book> borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    @Override
    public void borrowBook(Book book) {
        borrowedBooks.add(book);
    }

    @Override
    public void returnBook(Book book) {
        borrowedBooks.remove(book);
    }

    @Override
    public void viewBorrowedBooks() {
        System.out.println("Borrowed Books: ");
        borrowedBooks.forEach(System.out::println);
    }
}
