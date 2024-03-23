package com.salihpolat;

import java.util.List;

public class LibraryManagement {
    public static void main(String[] args) {

        System.out.println("Library Management System");

        Library library = new Library();

        // Create Some Books
        BookOfScience book1 = new BookOfScience("1234567890", "Java Programming", "John Doe", 2022, EStatus.AVAILABLE, null);
        BookOfHistory book2 = new BookOfHistory("0987654321", "Python Basics", "Jane Smith", 2021, EStatus.AVAILABLE, null);

        // Add Books To The Library
        library.setBooks(List.of(book1, book2));

        System.out.println("Books in the library: " + library.getBooks().size());

        // Create Some Members
        Member member1 = new Member("Alice Johnson");
        Member member2 = new Member("Bob Smith");

        // Add Members To The Library
        library.setMembers(List.of(member1, member2));

        System.out.println("Members in the library: " + library.getMembers().size());

        // Lend Books To Members
        library.lendBook(member1, book1);
        library.lendBook(member2, book2);

        System.out.println(book1.getStatus());
        System.out.println(book2.getStatus());
        System.out.println(member1.getBorrowedBooks());
        System.out.println(member2.getBorrowedBooks());

        // View lLibrary Status
        library.viewLibraryStatus();

        // View Borrowed Books
        library.viewBorrowedBooks(member1);

        // Return Books
        library.returnBook(member1, book1);
        library.returnBook(member2, book2);

        System.out.println(book1.getStatus());
        System.out.println(book2.getStatus());
        System.out.println(member1.getBorrowedBooks());
        System.out.println(member2.getBorrowedBooks());

        // View library Status
        library.viewLibraryStatus();
    }
}
