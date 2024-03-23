package com.salihpolat;

public interface IMember {

    void borrowBook(Book book);
    void returnBook(Book book);
    void viewBorrowedBooks();
}
